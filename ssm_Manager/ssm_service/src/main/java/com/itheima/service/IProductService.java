package com.itheima.service;

import com.itheima.entity.Product;

import java.util.List;

public interface IProductService {
    /**
     * 查询全部
     *
     */
    List<Product> findAll();
//保存
    void save(Product product);

}
