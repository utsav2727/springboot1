package com.utsavpatel.jobsite.packages;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/package")
public class PackageController {

    @Autowired
    @Qualifier("onlineorder")
    Order onlineOrder;


    @Autowired
    @Qualifier("offlineorder")
    Order offlineOrder;


    @GetMapping("/get")
    public String getValue(){
        return "Hello Utsav";
    }

    @PostMapping("/order/{type}")
    public String postOrder(@PathVariable(name = "type") String type){
        System.out.println("type "+ type);
        if(type.equals("online")){
            onlineOrder.createOrder();
            return "online order";
        }else if(type.equals("offline")){
            offlineOrder.createOrder();
            return "offline order";
        }else{
            return "posted order";
        }
    }
}
