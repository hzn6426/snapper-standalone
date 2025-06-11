package com.baomibing.business.service;

import com.baomibing.business.dto.WmsProviderDto;
import com.baomibing.core.base.MBaseService;
import com.baomibing.core.common.SearchResult;
import com.baomibing.business.dto.WmsProviderDto;

import java.util.List;
import java.util.Set;

public interface WmsProviderService extends MBaseService<WmsProviderDto> {

    SearchResult<WmsProviderDto> search(WmsProviderDto v, int pageNo, int pageSize);

    void saveProvider(WmsProviderDto v);

    void updateProvider(WmsProviderDto v);

    void deleteProviders(Set<String> ids);

    List<WmsProviderDto> listByKeyWord(String keyword);
}
