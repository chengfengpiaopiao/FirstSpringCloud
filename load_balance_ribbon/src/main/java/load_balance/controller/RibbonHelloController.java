package load_balance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import load_balance.service.RebbionHelloService;

/**
 * <pre>
 *     Created by Gracie on 2019/7/9
 *     e-mail : 13574845807@163.com
 *     desc   :
 *     version: 1.0
 * </pre>
 */
@RestController
public class RibbonHelloController {

    @Autowired
    RebbionHelloService mRebbionHelloService;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return mRebbionHelloService.providerHiService(name);
    }
}
