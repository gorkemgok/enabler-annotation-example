package com.gorkemgok.example.enablerannotation.app;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping
    public ResponseEntity<String> sampleEndpoint() {
        return ResponseEntity.ok("Sample Response");
    }
}
