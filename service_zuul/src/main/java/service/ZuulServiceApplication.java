package service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * <pre>
 *     Created by 2019/7/9 @author Gracie
 *     e-mail : 13574845807@163.com
 *     des :
 *     version:
 * </pre>
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
@EnableDiscoveryClient
public class ZuulServiceApplication {
    public static void main(String[] args){
        SpringApplication.run(ZuulServiceApplication.class,args);
    }
}
