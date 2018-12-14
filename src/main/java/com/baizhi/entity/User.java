package com.baizhi.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="s_user")
public class User implements Serializable {
    @Id
    private Long id;
    @JSONField(serialize = false)
    private String username;
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    @JSONField(format = "yyyy-MM-dd")
    private Date date;
}