package load_balance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * <pre>
 *     Created by Gracie on 2019/7/9
 *     e-mail : 13574845807@163.com
 *     desc   :
 *     version: 1.0
 * </pre>
 */
@Service
public class RebbionHelloService {

    @Autowired
    RestTemplate mRestTemplate;

    public String providerHiService(String name){
        return mRestTemplate.getForObject("http://SERVICE-HI/hi?name=" + name,String.class);
    }
}
