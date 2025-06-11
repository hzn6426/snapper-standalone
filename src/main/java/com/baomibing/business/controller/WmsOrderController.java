package com.baomibing.business.controller;

import com.baomibing.bo.TokenCacheBo;
import com.baomibing.business.dto.WmsOrderDto;
import com.baomibing.business.dto.WmsOrderDto;
import com.baomibing.business.service.WmsOrderService;
import com.baomibing.cache.CacheService;
import com.baomibing.tool.common.PageQuery;
import com.baomibing.web.base.MBaseController;
import com.baomibing.web.common.R;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

/**
 * WmsOrderController
 *
 * @author frog 2023/7/13 15:09
 * @version 1.0.0
 **/
@RestController
@RequestMapping(path = { "/api/order"}, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class WmsOrderController extends MBaseController<WmsOrderDto> {

    @Autowired private WmsOrderService orderService;
    @Autowired private CacheService cacheService;

    @GetMapping("tokens")
    public List<TokenCacheBo> getTokens() {
        String TOKEN_EXAMPLE_PREFIX = "TOKEN_EXAMPLE_PREFIX_";
        Set<String> keys =cacheService.keys(TOKEN_EXAMPLE_PREFIX);
        return cacheService.gets(Lists.newArrayList(keys), TokenCacheBo.class);
    }

    @PostMapping("search")
    public R<WmsOrderDto> search(@RequestBody PageQuery<WmsOrderDto> pageQuery) {
        return R.build(orderService.search(pageQuery.getDto(), pageQuery.getPageNo(), pageQuery.getPageSize()));
    }

    @GetMapping("/{id}")
    public WmsOrderDto getOrder(@PathVariable("id") String id) {
        return orderService.getOrder(id);
    }

    @PutMapping
    public void updateOrder(@RequestBody WmsOrderDto order) {
        orderService.updateOrder(order);
    }

    @PostMapping
    public void saveOrder(@RequestBody WmsOrderDto order) {
        orderService.saveOrder(order);
    }

    @DeleteMapping
    public void deleteOrders(@RequestBody List<String> ids) {
        orderService.deleteOrders(Sets.newHashSet(ids));
    }

}
