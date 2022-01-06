package producer.service;

import common.pojo.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Classname PaymentService
 * @Description 订单服务类
 * @Date 2022/1/6 19:28
 * @Author wbl
 */
public interface PaymentService {

    /**
     * 新建
     * @param payment
     * @return
     */
    int create(Payment payment);

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    Payment queryById(@Param("id")long id);
}
