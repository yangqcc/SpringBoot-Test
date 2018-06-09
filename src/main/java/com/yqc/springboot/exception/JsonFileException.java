package com.yqc.springboot.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * 实体未找到异常
 */
@AllArgsConstructor
public class JsonFileException extends CCException {

    /**
     * 实体名称
     */
    @Getter
    @Setter
    private String jsonFile;
}
