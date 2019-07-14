package service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <pre>
 *     Created by 2019/7/13 @author Gracie
 *     e-mail : 13574845807@163.com
 *     des :
 *     version:
 * </pre>
 */
@SpringBootApplication
@RestController
@EnableTransactionManagement
@MapperScan("com.chengfeng.dao")
public class DbTestApplication {
    public static void main(String[] args){
        SpringApplication.run(DbTestApplication.class,args);
    }


    @Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
        PropertySourcesPlaceholderConfigurer c = new PropertySourcesPlaceholderConfigurer();
        c.setIgnoreUnresolvablePlaceholders(true);
        return c;
    }

}
