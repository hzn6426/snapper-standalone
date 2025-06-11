package com.baomibing.business.mapper;

import com.baomibing.business.entity.WmsProvider;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WmsProviderMapper extends BaseMapper<WmsProvider> {

    List<WmsProvider> listByKeyWord(@Param("keyWord") String keyWord);

}
