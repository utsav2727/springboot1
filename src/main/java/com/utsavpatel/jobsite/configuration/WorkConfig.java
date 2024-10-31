package com.utsavpatel.jobsite.configuration;


import com.utsavpatel.jobsite.work.OfflineWork;
import com.utsavpatel.jobsite.work.OnlineWork;
import com.utsavpatel.jobsite.work.Work;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WorkConfig {

    @Bean
    public Work selectWork(@Value("${isOnlineWork}") Boolean onlineWorkType){

        System.out.println("isOnlineWork " + onlineWorkType);
        if(onlineWorkType){
            return new OnlineWork();
        }else {
            return new OfflineWork();
        }
    }
}
