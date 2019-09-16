package thw.sms;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class QueueController {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplat;

    @RequestMapping("/sendsms")
    public void sendSms() {
        Map map = new HashMap<>();
        map.put("mobile", "18140670993");
        map.put("template_code", "SMS_173945295");
        map.put("sign_name", "通惠网");
        map.put("param", "{\"code\":\"123456\"}");
        jmsMessagingTemplat.convertAndSend("sms", map);//sms activemq列队名  保存一致 / @JmsListener(destination="sms")
    }
}
