package kr.engsoft.qlrm_example.hello;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class HelloController {
    private final HelloRepository helloRepository;

    @ResponseBody
    @GetMapping("/hello_one")
    public List<HelloOne> hello_one() {
        return helloRepository.getHelloOne();
    }

    @ResponseBody
    @GetMapping("/hello_two")
    public List<HelloTwo> hello_two() {
        return helloRepository.getHelloTwo();
    }
}
