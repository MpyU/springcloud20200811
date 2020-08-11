package mpy.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

//    @Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder){
//        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
//        routes.route("custom_route1",
//                r -> r.path("/guonei").uri("http://news.baidu.com/guonei"))
//                .route("custom_rout2",r -> r.path("/guoji")
//                        .uri("http://news.baidu.com/guoji")).build();
//        return routes.build();
//    }
}
