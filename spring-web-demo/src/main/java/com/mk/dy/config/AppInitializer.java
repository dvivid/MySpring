package com.mk.dy.config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.filter.DelegatingFilterProxy;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.*;
import java.util.EnumSet;

/**

 *
 * @author dvivid
 * @version V1.0
 * @Title AppInitializer
 * @Package com.mk.dy.config
 * <p/>
 * *****************************************
 * @Description  web.xml注解配置实现
 * @date 2016/6/12
 */
public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    /**
     * 实现方法，供super.onstart()调用时注册本实现方法返回的类到应用上下文
     * @return
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{AppContextConfig.class,MongoConfig.class};
    }

    /**
     * 实现方法，供super.onstart()调用时注册本实现方法返回的类到MVC上下文
     * @return
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{WebConfig.class};
    }

    /**
     * DispatcherServlet <servlet-mapping/>
     * @return
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }


    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        super.onStartup(servletContext);
        initFilters(servletContext);
    }

    private void initFilters(ServletContext servletContext) {
        //addFilter(servletContext, "exceptionFilter", new DelegatingFilterProxy("exceptionFilter"));

        initCharacterEncodingFilter(servletContext);
    }
    private void initCharacterEncodingFilter(ServletContext servletContext) {
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setForceEncoding(true);
        characterEncodingFilter.setEncoding("UTF-8");
        addFilter(servletContext, "characterEncodingFilter", characterEncodingFilter);
    }

    private void addFilter(ServletContext servletContext, String filterName, Filter filter) {
        FilterRegistration.Dynamic filterRegistration = servletContext.addFilter(filterName, filter);
        filterRegistration.setAsyncSupported(isAsyncSupported());
        filterRegistration.addMappingForUrlPatterns(getDispatcherTypes(), false, "/*");
    }
    private EnumSet<DispatcherType> getDispatcherTypes() {
        return isAsyncSupported() ?
                EnumSet.of(DispatcherType.REQUEST, DispatcherType.FORWARD, DispatcherType.INCLUDE, DispatcherType.ASYNC) :
                EnumSet.of(DispatcherType.REQUEST, DispatcherType.FORWARD, DispatcherType.INCLUDE);
    }

}
