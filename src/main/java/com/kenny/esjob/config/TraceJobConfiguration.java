package com.kenny.esjob.config;

import com.kenny.esjob.annotation.JobTraceInterceptor;
import org.springframework.context.annotation.Bean;

public class TraceJobConfiguration {
    @Bean
    public JobTraceInterceptor jobTraceInterceptor() {
        System.err.println("init --------------->");
        return new JobTraceInterceptor();
    }
}
