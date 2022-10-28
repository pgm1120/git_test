package org.zerock.springboard.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.zerock.springboard.controller.converter.LocalDateConverter;

//servlet.xml대신
@EnableWebMvc
@ComponentScan(basePackages = "org.zerock.springboard.controller")
public class ZerockServletConfig implements WebMvcConfigurer {


    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new LocalDateConverter());
    }

    @Bean
    public MultipartResolver multipartResolver() {

        StandardServletMultipartResolver resolver = new StandardServletMultipartResolver();
        return resolver;

    }



    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {

        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        registry.viewResolver(viewResolver);
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // res로 시작하는 모든 주소를   webapp 의 resources로 접근하도록.
        registry.addResourceHandler("/res/**").addResourceLocations("/resources/"); // 어느경로로 들어오면 사용할지 , 패턴을 적어줌
    }
}
