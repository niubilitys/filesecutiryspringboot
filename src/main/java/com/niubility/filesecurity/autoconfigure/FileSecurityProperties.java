package com.niubility.filesecurity.autoconfigure;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author huangliusong
 * @since 2019/7/5
 * {@link ConfigurationProperties}
 * {@link EnableAutoConfiguration Auto-configuration}
 */
@PropertySource("classpath:application.yml")
@Configuration
@ConfigurationProperties(prefix = FileSecurityProperties.FILE_SECURITY_PREFIX)
public class FileSecurityProperties {
    public static final String FILE_SECURITY_PREFIX = "file";

    /**
     * WhiteList
     */
    private String uploadPrefixWhiteList;

    public String getUploadPrefixWhiteList() {
        return uploadPrefixWhiteList;
    }

    public void setUploadPrefixWhiteList(String uploadPrefixWhiteList) {
        this.uploadPrefixWhiteList = uploadPrefixWhiteList;
    }
}
