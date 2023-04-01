package com.atguigu.admin.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * ClassName: User
 * Package: com.atguigu.admin.bean
 * Description:
 *
 * @Author kurt
 * @Create 2023/1/4 下午 11:05
 * @Version v1.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User implements Serializable {
    private String userName;
    private String password;
}
