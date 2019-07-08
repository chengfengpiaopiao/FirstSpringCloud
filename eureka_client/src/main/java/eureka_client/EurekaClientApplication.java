package eureka_client;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <pre>
 *     Created by Gracie on 2019/7/8
 *     e-mail : 13574845807@163.com
 *     desc   :
 *     version: 1.0
 * </pre>
 */
@SpringBootApplication
@RestController
@EnableEurekaClient
public class EurekaClientApplication {
    @RequestMapping("/")
    public String home() {
        return "Hello world";
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaClientApplication.class).web(true).run(args);
    }
}
