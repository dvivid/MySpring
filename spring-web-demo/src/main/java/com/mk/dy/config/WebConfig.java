package com.mk.dy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.http.MediaType;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.ResourceHttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.converter.support.AllEncompassingFormHttpMessageConverter;
import org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverter;
import org.springframework.http.converter.xml.SourceHttpMessageConverter;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.util.ClassUtils;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.xml.transform.Source;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**

 * @author dvivid
 * @version V1.0
 * @Title WebConfig
 * @Package com.mk.dy.config
 * <p/>
 * *****************************************
 * @Description servlet��mvc����������
 * @date 2016/6/12
 */

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.mk.dy"})
@EnableScheduling
@EnableAsync
public class WebConfig extends WebMvcConfigurerAdapter {


//    private static final boolean jaxb2Present =
//            ClassUtils.isPresent("javax.xml.bind.Binder", WebConfig.class.getClassLoader());
//
//    private static final boolean jackson2Present =
//            ClassUtils.isPresent("com.fasterxml.jackson.databind.ObjectMapper", WebConfig.class.getClassLoader()) &&
//                    ClassUtils.isPresent("com.fasterxml.jackson.core.JsonGenerator", WebConfig.class.getClassLoader());
//
//    private static final boolean jacksonPresent =
//            ClassUtils.isPresent("org.codehaus.jackson.map.ObjectMapper", WebConfig.class.getClassLoader()) &&
//                    ClassUtils.isPresent("org.codehaus.jackson.JsonGenerator", WebConfig.class.getClassLoader());
//
//    @Override
//    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
//        configurer.favorPathExtension(false).favorParameter(false);
//        configurer.defaultContentType(MediaType.APPLICATION_JSON);
//    }
//
//    @Override
//    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//        // 默认非 UTF-8
//        StringHttpMessageConverter stringConverter = new StringHttpMessageConverter(Charset.forName("UTF-8"));
//        stringConverter.setWriteAcceptCharset(false);
//
//        converters.add(new ByteArrayHttpMessageConverter());
//        converters.add(stringConverter);
//        converters.add(new ResourceHttpMessageConverter());
//        converters.add(new SourceHttpMessageConverter<Source>());
//        converters.add(new AllEncompassingFormHttpMessageConverter());
//        if (jaxb2Present) {
//            converters.add(new Jaxb2RootElementHttpMessageConverter());
//        }
//        if (jackson2Present) {
//            MappingJackson2HttpMessageConverter convert = new MappingJackson2HttpMessageConverter();
//            convert.setObjectMapper(JsonMapper.getMapper());
//
//            //重置媒体类型不带charset
//            List<MediaType> supportedMediaTypes = new ArrayList<MediaType>();
//            supportedMediaTypes.add(MediaType.APPLICATION_JSON);
//            convert.setSupportedMediaTypes(supportedMediaTypes);
//
//            converters.add(convert);
//        } else if (jacksonPresent) {
//            converters.add(new org.springframework.http.converter.json.MappingJacksonHttpMessageConverter());
//        }
//        customMediaTypeSupport(converters);
//    }
//
//    public void customMediaTypeSupport(List<HttpMessageConverter<?>> converters) {
//    }


}
