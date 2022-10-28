package org.zerock.springboard.config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;
import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;


//web.xml을 대신
public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{RootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{ZerockServletConfig.class};
    }

    @Override
    protected String[] getServletMappings() { // localhost:8080에 들어오는 모든 애들을 / 를 통해 들어오게끔하는것 -> 프론트 컨트롤러
        return new String[]{"/"};
    }

    @Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter filter = new CharacterEncodingFilter();
        filter.setEncoding("UTF-8");
        return new Filter[] {filter};
    }

    @Override
    protected void customizeRegistration(ServletRegistration.Dynamic registration) {

        MultipartConfigElement multipartConfigElement =
                new MultipartConfigElement("C://upload/temp");
        //1. 경로 2.최대 파일 사이즈  3. 한번에 얼마나 request를 받을 것인가
        registration.setMultipartConfig(multipartConfigElement);

    }
}
