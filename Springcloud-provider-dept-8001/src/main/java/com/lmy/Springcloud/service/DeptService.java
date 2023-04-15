package com.lmy.Springcloud.service;

import com.lmy.Springcloud.pojo.Dept;

import java.util.List;

public interface DeptService {

    public Boolean addDept(Dept dept);

    public Dept queryById(Long id);

    public List<Dept> queryAll();
}
