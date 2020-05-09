package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MorsController {

    @PostMapping("/test")
    public String getMorse(@RequestBody String toMorse) {
        final MorsConverter morsConverter = new MorsConverter();
        final String zakodowane = morsConverter.convert(toMorse.toLowerCase());
        return zakodowane;
    }

}
