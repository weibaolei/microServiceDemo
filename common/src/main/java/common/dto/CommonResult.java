package common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @Classname CommonResult
 * @Description 像前端返回的数据
 * @Date 2022/1/6 19:19
 * @Author wbl
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class CommonResult<T> {
    /**
     * 返回状态码
     */
    private Integer code;
    /**
     * 返回是否调用成功
     */
    private String  message;
    /**
     * 返回的数据
     */
    private  T data;

    public CommonResult(Integer code, String message) {
        this(code,message,null);
    }
}
