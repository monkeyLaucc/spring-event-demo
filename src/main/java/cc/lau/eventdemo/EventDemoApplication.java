package cc.lau.eventdemo;

import cc.lau.eventdemo.biz.service.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class EventDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EventDemoApplication.class, args);
    }

    @Autowired
    private AccountServiceImpl accountService;

    @GetMapping("consume")
    public String consume(){
        accountService.consume();
        return "consume success";
    }
}