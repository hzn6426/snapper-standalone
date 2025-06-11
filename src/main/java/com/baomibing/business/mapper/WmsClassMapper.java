package com.baomibing.business.mapper;

import com.baomibing.business.dto.WmsClassDto;
import com.baomibing.business.entity.WmsClass;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WmsClassMapper extends BaseMapper<WmsClass> {

    List<WmsClass> listByKeyWord(@Param("keyWord") String keyWord);
}
