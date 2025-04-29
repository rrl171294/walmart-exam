package com.walmart.test.controller;

import com.walmart.test.service.TestService;
import com.walmart.test.vo.SearchRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class TestController {

    @Autowired
    private TestService testService;

    @PostMapping("/searchArray")
    public ResponseEntity<?>
    searchArray(@RequestBody SearchRequest request) {
        if (request.getArrayA() == null || request.getArrayA().isEmpty()) {
            return ResponseEntity.badRequest().body("El arreglo A no debe estar vacio");
        }
        if (request.getArrayB() == null || request.getArrayB().isEmpty()) {
            return ResponseEntity.badRequest().body("El arreglo B no debe estar vacio");
        }

        Map<String, Integer> result = testService.countMatches(request.getArrayA(), request.getArrayB());
        return  ResponseEntity.ok(result);
    }

}
