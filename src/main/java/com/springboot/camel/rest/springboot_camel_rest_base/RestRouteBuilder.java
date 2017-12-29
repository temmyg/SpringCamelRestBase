package com.springboot.camel.rest.springboot_camel_rest_base;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class RestRouteBuilder extends RouteBuilder {
    @Override
    public void configure() throws Exception {

        restConfiguration().component("servlet").host("localhost").port("8080");
        rest("/sayhello").get().to("rest:get:greeting/{msg}"); //.log("${body}");
    }
}
