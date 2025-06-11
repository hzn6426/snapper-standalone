package com.baomibing.business.mapper;

import com.baomibing.business.entity.WmsOrder;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

public interface WmsOrderMapper extends BaseMapper<WmsOrder> {

    Integer getCountOrdersByMonth(@Param("date") String date);
}
