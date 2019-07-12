package config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <pre>
 *     Created by Gracie on 2019/7/12
 *     e-mail : 13574845807@163.com
 *     desc   :
 *     version: 1.0
 * </pre>
 */
@SpringBootApplication
@EnableEurekaServer
public class ConfigEurekaServerApplication {
    public static void main(String[] args){
        SpringApplication.run(ConfigEurekaServerApplication.class,args);
    }
}
