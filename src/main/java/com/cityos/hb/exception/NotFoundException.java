package com.cityos.hb.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by yangqc on 2017/10/25
 */
@AllArgsConstructor
public class NotFoundException extends CCException {

    /**
     * 实体名称
     */
    @Getter
    @Setter
    private String entityName;
}
