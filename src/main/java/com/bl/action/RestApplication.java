package com.bl.action;

import org.codehaus.jackson.jaxrs.JacksonJsonProvider;
import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.server.ResourceConfig;

/**
 * Created by lwb on 15/8/19.
 */
public class RestApplication extends ResourceConfig {
    public RestApplication(){
        //服务类所在包路径
        packages("com.bl.service");
        //打印访问日志，便于跟踪调试，正式发布可清除
        register(JacksonJsonProvider.class);
        register(LoggingFilter.class);
    }
}
