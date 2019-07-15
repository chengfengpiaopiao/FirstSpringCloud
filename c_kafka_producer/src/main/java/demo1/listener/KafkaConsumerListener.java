package demo1.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * <pre>
 *     Created by Gracie on 2019/7/15
 *     e-mail : 13574845807@163.com
 *     desc   :
 *     version: 1.0
 * </pre>
 */
@Component
public class KafkaConsumerListener {
    @KafkaListener(topics = "${kafka.topic}")
    public void getMessage(String message){
        System.out.println("kafka 消费者监听，接收到消息:" + message);
    }
}
