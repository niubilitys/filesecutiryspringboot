package com.niubility.filesecurity.register;


import com.niubility.filesecurity.handler.FileSecurityInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * FileSecurity AutoConfiguration
 *
 * @author huangliusong
 * @version 1.0.0
 * @since 2019/7/5
 * {@link WebMvcConfigurerAdapter}
 * {@link FileSecurityInterceptor}
 */
@Configuration
public class FileSecurityInterceptorRegister extends WebMvcConfigurerAdapter {


    @Bean
    public FileSecurityInterceptor fileSecurityInterceptor() {
        return new FileSecurityInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(fileSecurityInterceptor());
    }
}
