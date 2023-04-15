package com.lmy.Springcloud.dao;

import com.lmy.Springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface Deptdao {

    public Boolean addDept(Dept dept);
    public Dept queryById(Long id);
    public List<Dept> queryAll();
}
