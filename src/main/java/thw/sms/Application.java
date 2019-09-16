package thw.sms;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//表示当前类是一个启动类
public class Application {
    public static void main(String[] args) {
        //启动
        SpringApplication.run(Application.class, args);
    }
}
