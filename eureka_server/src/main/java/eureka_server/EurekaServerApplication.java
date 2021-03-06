package eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <pre>
 *     Created by Gracie on 2019/7/8
 *     e-mail : 13574845807@163.com
 *     desc   :
 *     version: 1.0
 * </pre>
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
    public static void main(String[] args){
        // 运行Eureka服务中心
        SpringApplication.run(EurekaServerApplication.class,args);
    }

}
