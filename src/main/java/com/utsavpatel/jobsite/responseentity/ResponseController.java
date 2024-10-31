package com.utsavpatel.jobsite.responseentity;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/response")
public class ResponseController {

    @GetMapping("/get")
    public ResponseEntity<String> getdata(){

        return ResponseEntity.status(200).body("ok");
    }
}
