package com.itheima.dao;

import com.itheima.domain.Product;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IProductDao {
    /**
     * 查询全部产品  23423423423
     */
    @Select("select * from product")
    List<Product> findAll();

}
