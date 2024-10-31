package com.utsavpatel.jobsite.packages;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("offlineorder")
@Lazy
public class OfflineOrder implements Order{

    OfflineOrder(){
        System.out.println("offline order constructor");
    }
    @Override
    public void createOrder() {
        System.out.println("create offline order");
    }
}
