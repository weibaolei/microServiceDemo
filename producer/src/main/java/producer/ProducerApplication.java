package producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Classname ProducerApplication
 * @Description 生产者启动类
 * @Date 2022/1/6 19:26
 * @Author wbl
 */
@SpringBootApplication
@EnableEurekaClient
public class ProducerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProducerApplication.class,args);
    }

}
