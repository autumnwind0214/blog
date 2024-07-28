package com.autumn.blog.domain.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author autumn
 * @description TODO
 * @date 2024年07月28日
 * @version: 1.0
 */
@Data
public class BaseBean implements Serializable {

    /**
     *
     */
    @TableId(value = "id")
    private Long id;

    /**
     *
     */
    @TableField(value = "create_time")
    private LocalDateTime createTime;

    /**
     *
     */
    @TableField(value = "update_time")
    private LocalDateTime updateTime;

    /**
     *
     */
    @TableLogic(value = "flag")
    private Integer flag;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
