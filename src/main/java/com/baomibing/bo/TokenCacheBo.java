package com.baomibing.bo;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class TokenCacheBo {
    private String token;
    private String userNo;
    private String userCnName;
    private String description;

}
