package com.autumn.blog.domain.form;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;


/**
 * 注册表单
 *
 * @author Mark sunlightcs@gmail.com
 */
@Data
public class RegisterForm {
    @NotBlank(message="手机号不能为空")
    private String mobile;

    @NotBlank(message="密码不能为空")
    private String password;
}
