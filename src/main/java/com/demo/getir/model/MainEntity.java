package com.demo.getir.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;

import java.util.Date;

@Data
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class MainEntity {
    @Id
    private String id;

    @Version
    private Integer version;

    @CreatedDate
    private Date createTime = new Date();

    @LastModifiedDate
    private Date updateTime;
}
