dockerbin="/usr/bin/docker"
appname="${server.application}"
appport="${server.port}"
echo $appname
echo "keep only latest two images, delete others..."
docker images | grep baomibing/$appname | grep -v grep | awk '{print $3}'| tail -n +3 | xargs $dockerbin rmi -f
echo "keep only latest three containers, delete others..."
docker ps --all|grep $appname | grep -v grep | awk '{print $1}' | tail -n +4 | xargs $dockerbin rm -f
#stop all restart policy
echo "set previous container not auto start..."
docker ps --all|grep $appname | grep -v grep | awk '{print $1}' | xargs docker update --restart=no
count=`$dockerbin ps  | grep $appname | grep -v "grep" | wc -l`
md=`date "+%m%d"`
echo "There are "$count" running docker containers! "
if [ $count -gt 0 ];
then
echo "Stop docker containers....."
${dockerbin} ps  | grep $appname | grep -v grep | awk '{print $1}' | xargs $dockerbin stop
else
echo "There are no containers running....."
fi;
mkdir -p /usr/local/baomibing/$appname
cd /usr/local/baomibing/$appname
$dockerbin build -t baomibing/$appname:v$md .
ccount=$($dockerbin ps --all | grep $appname$md | grep -v "grep" | wc -l)
echo "There are $ccount count same name container are exist..."
if [ $ccount -gt 0 ];
then
echo "remove exist name container..."
$dockerbin ps --all|grep $appname$md  | grep -v grep | awk '{print $1}' | xargs $dockerbin rm -f
fi;
$dockerbin run -di --restart=always --network=host -v /usr/local/baomibing/$appname/logs:/logs/$appname --name $appname$md -p $appport:$appport baomibing/$appname:v$md --memory=4g --memory-swap=4g
$dockerbin logs -f $appname$md &> $appname$md.log &

