package com.yqc.manage.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * 实体未找到异常
 *
 * @author yangqc
 */
@AllArgsConstructor
public class JsonFileException extends CCException {

  private static final long serialVersionUID = -4414322464616247799L;
  /**
   * 实体名称
   */
  @Getter
  @Setter
  private String jsonFile;
}
