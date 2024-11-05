package org.scaler.ecommerceemailservice.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * @author: Vijaysurya Mandala
 * @github: github/mandalavijaysurya (<a href="https://www.github.com/mandalavijaysurya"> Github</a>)
 */
@Service
public class KafkaConsumer {

    @KafkaListener(topics = "email", groupId = "email-service")
    public void sendEmail(String message){
        System.out.println(message);
    }
}
