package com.yqc.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 当前应用相关配置
 */
@ConfigurationProperties(prefix = "application", ignoreUnknownFields = false)
public class ApplicationProperties {
}
