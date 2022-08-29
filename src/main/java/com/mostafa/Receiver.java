package com.mostafa;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File com.mostafa.springjms.Reciever.java: SpringJMS
 * @CreationDate 8/11/2022 3:15 PM
 */
@Component
public class Receiver {
    @JmsListener(destination = "order-queue", containerFactory = "warehouseFactory")
    public void receiveMessage(String message){
        System.out.print("Order Queue Message: "+message);
    }
}
