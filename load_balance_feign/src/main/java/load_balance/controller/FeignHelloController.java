package load_balance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import load_balance.service.FeignSchedualServiceHi;

/**
 * <pre>
 *     Created by Gracie on 2019/7/9
 *     e-mail : 13574845807@163.com
 *     desc   :
 *     version: 1.0
 * </pre>
 */
@RestController
public class FeignHelloController {
    @Autowired
    FeignSchedualServiceHi mFeignSchedualServiceHi;

    @GetMapping("/hi")
    public String providerHiService(String name){
        return mFeignSchedualServiceHi.hi(name);
    }
}
