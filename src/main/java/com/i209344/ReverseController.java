package com.i209344;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("string")
public class ReverseController {

    @GetMapping("/reverse/{inputString}")
    @ResponseBody
    public String reverseWord(@PathVariable String inputString) {
        return new StringBuilder(inputString).reverse().toString();
    }

}
