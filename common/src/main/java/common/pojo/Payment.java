package common.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Classname Payment
 * @Description 订单实体类
 * @Date 2022/1/6 19:22
 * @Author wbl
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Payment implements Serializable {

    private Long id;

    private  String serial;
}
