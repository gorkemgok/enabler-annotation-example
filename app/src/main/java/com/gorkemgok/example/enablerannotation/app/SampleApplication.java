package com.gorkemgok.example.enablerannotation.app;

import com.gorkemgok.example.enablerannotation.commonheaders.EnableCommonHeaders;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableCommonHeaders(enableHostHeader = true, enableTraceIdHeader = true)
public class SampleApplication {

    public static void main(String[] args) {
        new SpringApplication(SampleApplication.class).run(args);
    }

}
