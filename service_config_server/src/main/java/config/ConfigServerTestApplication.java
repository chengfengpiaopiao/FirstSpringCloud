package config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * <pre>
 *     Created by Gracie on 2019/7/10
 *     e-mail : 13574845807@163.com
 *     desc   :
 *     version: 1.0
 * </pre>
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ConfigServerTestApplication {
    public static void main(String[] args){
        // http://localhost:8888/foo/dev
        SpringApplication.run(ConfigServerTestApplication.class,args);
    }
}
