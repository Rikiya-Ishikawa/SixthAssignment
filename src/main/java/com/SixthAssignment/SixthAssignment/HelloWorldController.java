package com.SixthAssignment.SixthAssignment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    public Wrestler hello() {
        return new Wrestler(
                "拳王",
                "1985年1月1日",
                "174㎝",
                "95kg",
                "A型",
                "徳島県徳島市",
                "失恋モッシュ",
                "拳王スペシャル"
        );
    }
}
