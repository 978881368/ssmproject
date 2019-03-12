package com.itheima.service;

import com.itheima.domain.Product;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IProductService {
    /**
     * 查询全部产品
     */
   List<Product> findAll();

}
