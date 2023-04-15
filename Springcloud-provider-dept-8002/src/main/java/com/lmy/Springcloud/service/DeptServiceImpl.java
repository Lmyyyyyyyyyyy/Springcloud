package com.lmy.Springcloud.service;

import com.lmy.Springcloud.dao.Deptdao;
import com.lmy.Springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService{

    @Autowired
    private Deptdao deptdao;

    @Override
    public Boolean addDept(Dept dept) {
        return deptdao.addDept(dept);
    }

    @Override
    public Dept queryById(Long id) {
        return deptdao.queryById(id);
    }

    @Override
    public List<Dept> queryAll() {
        return deptdao.queryAll();
    }
}
