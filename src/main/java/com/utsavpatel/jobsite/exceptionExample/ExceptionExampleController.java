package com.utsavpatel.jobsite.exceptionExample;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exec")
public class ExceptionExampleController {


    @GetMapping("/")
    public ResponseEntity<Object> getData() throws Exception {
        try {
            throw new Exception("Exception is raised");
        }catch (Exception e){
//            System.out.println(e.getMessage());
            ErrorResponse errorResponse = new ErrorResponse(false, HttpStatus.INTERNAL_SERVER_ERROR.value(), e.getMessage());
            return ResponseEntity.status(500).body(errorResponse);
        }
    }
}
