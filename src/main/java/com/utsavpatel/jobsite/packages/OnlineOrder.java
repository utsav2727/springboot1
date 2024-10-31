package com.utsavpatel.jobsite.packages;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
@Qualifier("onlineorder")
public class OnlineOrder implements Order{

    OnlineOrder(){
        System.out.println("OnlineOrder order constructor");
    }

    @Override
    public void createOrder() {
        System.out.println("create online order");
    }
}
