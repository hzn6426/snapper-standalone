package com.baomibing.business.controller;

import com.baomibing.business.dto.WmsOrderDto;
import com.baomibing.business.service.WmsOrderService;
import com.baomibing.cache.CacheService;
import com.baomibing.tool.common.PageQuery;
import com.baomibing.web.annotation.ULog;
import com.baomibing.web.base.MBaseController;
import com.baomibing.web.common.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * WmsOrderController
 *
 * @author frog 2023/7/13 15:09
 * @version 1.0.0
 **/
@RestController
@RequestMapping(path = { "/epi/order","/wapi/order"}, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class WmsOrderTenantController extends MBaseController<WmsOrderDto> {

    @Autowired private WmsOrderService orderService;
    @Autowired private CacheService cacheService;

@   ULog("订单查询")
    @PostMapping("search")
    public R<WmsOrderDto> search(@RequestBody PageQuery<WmsOrderDto> pageQuery) {
        return R.build(orderService.search(pageQuery.getDto(), pageQuery.getPageNo(), pageQuery.getPageSize()));
    }


}
