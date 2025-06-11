package com.baomibing.business.runner;

import com.baomibing.authority.service.SystemService;
import com.baomibing.cache.CacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class TokenRunner implements ApplicationRunner {

    @Autowired private SystemService systemService;
    @Autowired private CacheService cacheService;

    private final String passwd = "14e1b600b1fd579f47433b88e8d85291";
    private final String tag = "example";
    private final String TOKEN_EXAMPLE_PREFIX = "TOKEN_EXAMPLE_PREFIX_";
    private final long SIX_MONTH = 60 * 60 *24* 30 * 6;
    @Override
    public void run(ApplicationArguments args) throws Exception {
//        JwtTokenResponse response_xm = systemService.login("ximen",passwd, tag, null);
//        TokenCacheBo xmCache = new TokenCacheBo().setToken(response_xm.getAccess_token()).setUserNo("ximen").setUserCnName("西门").setDescription("西门为青岛分公司管理员，能够看到所有数据，该用户在”管理员“用户组中，对应的角色拥有“订单演示”资源权限，该用户组在”授权管理“中，设置权限范围为”全部“-此设置能看到所有订单查询的数据");
//
//        JwtTokenResponse response_liuxing = systemService.login("liuxing",passwd, tag, null);
//        TokenCacheBo liuxingCache = new TokenCacheBo().setToken(response_liuxing.getAccess_token()).setUserNo("liuxing").setUserCnName("刘星").setDescription("刘星为青岛分公司销售部总监，该职位在职位管理中设置，权限范围为本组织即能看到部门下所有人数据（订单中的销售），而且只能看到青岛分公司数据（默认条件），在用户组中为“销售组”该用户组拥有“销售角色“");
//
//        JwtTokenResponse response_nana = systemService.login("zhangnana",passwd, tag, null);
//        TokenCacheBo nanaCache = new TokenCacheBo().setToken(response_nana.getAccess_token()).setUserNo("zhangnana").setUserCnName("张娜娜").setDescription("张娜娜为青岛分公司客服主管，该职位权限范围为本组织，能在提单中看到部门下所有人的数据（订单中客服列），通过授权管理设置看不到“单价”和“总价”列");
//
//        JwtTokenResponse response_wangfeng = systemService.login("wangfeng",passwd, tag, null);
//        TokenCacheBo wangfengCache = new TokenCacheBo().setToken(response_wangfeng.getAccess_token()).setUserNo("wangfeng").setUserCnName("王凤").setDescription("王凤（红牛专属）为青岛分公司销售一部销售，只能看到提单中销售是自己的数据（默认），但通过授权管理设置后还能看到所有“红牛”的订单，这样可以专门处理某一品类的数据");
//
//        JwtTokenResponse response_hanwen = systemService.login("hanwen",passwd, tag, null);
//        TokenCacheBo hanwenCache = new TokenCacheBo().setToken(response_hanwen.getAccess_token()).setUserNo("hanwen").setUserCnName("韩文").setDescription("韩文为北京总部的销售总裁，能够看到分公司的销售数据，但看不到销售总监的数据，通过职位角色及权限范围来达到该需求，做到换人不换职");
//        cacheService.deleteByKeyPrefix(TOKEN_EXAMPLE_PREFIX);
//        cacheService.set(TOKEN_EXAMPLE_PREFIX + "ximen", JSONObject.toJSONString(xmCache), SIX_MONTH);
//        cacheService.set(TOKEN_EXAMPLE_PREFIX + "liuxing", JSONObject.toJSONString(liuxingCache), SIX_MONTH);
//        cacheService.set(TOKEN_EXAMPLE_PREFIX + "zhangnana", JSONObject.toJSONString(nanaCache), SIX_MONTH);
//        cacheService.set(TOKEN_EXAMPLE_PREFIX + "wangfeng", JSONObject.toJSONString(wangfengCache),SIX_MONTH);
//        cacheService.set(TOKEN_EXAMPLE_PREFIX + "hanwen", JSONObject.toJSONString(hanwenCache),SIX_MONTH);
    }
}
