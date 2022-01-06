package producer.controller;

import common.dto.CommonResult;
import common.pojo.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import producer.service.PaymentService;

/**
 * @Classname PaymentController
 * @Description 订单类前端控制器
 * @Date 2022/1/6 19:27
 * @Author wbl
 */
@RestController
@Slf4j
public class PaymentController {
    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    private String serverPort = "8001";

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment dept){
        int i = paymentService.create(dept);
        if(i>0){
            return new CommonResult(200,"插入数据库成功"+serverPort,i);
        }else{
            return new CommonResult(444,"插入数据库失败",null);
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult queryById(@PathVariable("id") Long id){
        Payment payment = paymentService.queryById(id);
        if(payment!=null){
            return new CommonResult(200,"查询成功"+serverPort,payment);
        }else{
            return new CommonResult(444,"查询失败",null);
        }
    }
}
