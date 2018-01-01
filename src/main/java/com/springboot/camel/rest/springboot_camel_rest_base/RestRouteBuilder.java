package com.springboot.camel.rest.springboot_camel_rest_base;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

@Component
public class RestRouteBuilder extends RouteBuilder {
    @Override
    public void configure() throws Exception {
//        from("rest:get:hello/{me}")
//                .transform().simple("Bye ${header.me}");
        restConfiguration().component("servlet").bindingMode(RestBindingMode.json) //.host("localhost")
                .contextPath("SpringBootCamelRestBase/rest")
                .port("8084");

        rest("/sayhello").consumes("application/json").produces("application/json")
                    .get().to("bean:helloBean?method=greetingWorld(${header.msg})");

       // rest("/sayhello").get().to("rest:get:greeting/{msg}"); //.log("${body}");
    }
}
