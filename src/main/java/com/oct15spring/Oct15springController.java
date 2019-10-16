package com.oct15spring;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
class Oct15springController {

    @GetMapping("/hello/{name}")
    public String person(@PathVariable String name) {
        return "Hello " + name + "!";
    }

}
