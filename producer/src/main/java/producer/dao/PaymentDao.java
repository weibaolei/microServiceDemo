package producer.dao;

import common.pojo.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @Classname PaymentDao
 * @Description 订单类dao层接口
 * @Date 2022/1/6 19:30
 * @Author wbl
 */
@Mapper
@Repository
public interface PaymentDao {

    /**
     * 新建
     * @param payment
     * @return int
     */
    int create(Payment payment);

    /**
     * 根据id查询
     * @param id
     * @return Payment
     */
    Payment queryById(@Param("id")long id);
}
