package bkw.etc.stringbuilder;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class htmlRestTest {
    @ResponseBody
    @PostMapping("/test")
    public List<Map<String, Object>> test(
            @RequestBody List<Map<String,Object>> param) {
        System.out.println("param : " + param);
        return param;
    }
}
