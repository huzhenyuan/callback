package com.example.callback;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CallbackController {

    @PostMapping("/callback")
    @ResponseBody
    public void callback(@RequestBody String orderInfo) {
        System.out.println(orderInfo);
    }
}
