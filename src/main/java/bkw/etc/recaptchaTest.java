package bkw.etc;




import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Please explain the class!!
 *
 * @author : kma04
 * @fileName : recaptchaTest
 * @since : 2024-03-05
 */

@Controller
public class recaptchaTest {
    public static final String SECRET_KEY = "6LfNBYkpAAAAAC1K2-3VFfzDA6IIKEcVnkCCaA-Q";
    public static final String SITE_VERIFY_URL = "https://www.google.com/recaptcha/api/siteverify";

    @Autowired
    RestTemplateBuilder builder;

    /**
     * 구글 리캡쳐 v3
     * @return
     */

    @GetMapping("/recaptcha")
    public String recaptcha(){return "recaptcha";}


    @PostMapping("/validation")
    public @ResponseBody String ajax(String captcha) throws Exception {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
        map.add("secret", SECRET_KEY);
        map.add("response", captcha);

        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(map, headers);

        ResponseEntity<String> response = builder.build().postForEntity(SITE_VERIFY_URL, request , String.class );


        // response.getBody()가 JSON 형식의 문자열이라고 가정합니다.
        String responseBody = response.getBody();

        // ObjectMapper 객체 생성
        ObjectMapper objectMapper = new ObjectMapper();

        // JSON 문자열을 JsonNode로 파싱
        JsonNode jsonNode = objectMapper.readTree(responseBody);

        // "success" 키의 값을 조회
        boolean success = jsonNode.get("success").asBoolean();

        System.out.println("success : "+ success);
        System.out.println("====================================================================================");
        System.out.println("response : " + response);
        System.out.println("====================================================================================");
        System.out.println("response.getBody() : " + response.getBody());
        System.out.println("====================================================================================");
        System.out.println(response.getStatusCode());

        System.out.println("====================================================================================");


        return response.getBody();
    }



}
