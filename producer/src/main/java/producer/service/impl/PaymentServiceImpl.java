package producer.service.impl;

import common.pojo.Payment;
import org.springframework.stereotype.Service;
import producer.dao.PaymentDao;
import producer.service.PaymentService;

/**
 * @Classname PaymentServiceImpl
 * @Description 订单服务类的实现类
 * @Date 2022/1/6 19:29
 * @Author wbl
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    final
    PaymentDao paymentDao;

    public PaymentServiceImpl(PaymentDao paymentDao) {
        this.paymentDao = paymentDao;
    }

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment queryById(long id) {
        return paymentDao.queryById(id);
    }
}
