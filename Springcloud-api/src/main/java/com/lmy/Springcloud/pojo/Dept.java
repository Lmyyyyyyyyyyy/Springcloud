package com.lmy.Springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;


@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable {
    private long deptno;//主键
    private String dname;//部门名称
    private String db_source;

    public Dept(String dname) {
        this.dname = dname;
    }
}
