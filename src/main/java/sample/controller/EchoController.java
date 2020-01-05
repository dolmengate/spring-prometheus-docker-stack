package sample.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sample.http.retrofit.service.ISomeService;

@Slf4j
@RestController
public class EchoController {

    @Autowired
    ISomeService httpService;

    @RequestMapping("/{msg}")
    public String echo(@PathVariable("msg") String msg) {
        log.info("Echoes...");
//        httpService.someServiceEndpoint();
        return String.format("%s %s %s", msg, msg, msg);
    }
}
