package com.baomibing.business.service;

import com.baomibing.business.dto.WmsItemDto;
import com.baomibing.core.base.MBaseService;
import com.baomibing.core.common.SearchResult;
import com.baomibing.business.dto.WmsClassDto;
import com.baomibing.business.dto.WmsItemDto;

import java.util.List;
import java.util.Set;

public interface WmsItemService extends MBaseService<WmsItemDto> {

    SearchResult<WmsItemDto> search(WmsItemDto item, int pageNo, int pageSize);

    void saveItem(WmsItemDto item);

    void updateItem(WmsItemDto item);

    void deleteItems(Set<String> ids);

    List<WmsItemDto> listByKeyWord(String keyword);
}
