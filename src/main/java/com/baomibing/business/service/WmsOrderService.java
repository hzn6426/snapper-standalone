package com.baomibing.business.service;

import com.baomibing.business.dto.WmsOrderDto;
import com.baomibing.core.common.SearchResult;
import com.baomibing.business.dto.WmsOrderDto;

import java.util.Set;

public interface WmsOrderService {

    SearchResult<WmsOrderDto> search(WmsOrderDto v, int pageNo, int pageSize);

    void saveOrder(WmsOrderDto order);

    void updateOrder(WmsOrderDto order);

    void deleteOrders(Set<String> ids);

    WmsOrderDto getOrder(String id);
}
