package com.itheima.service.impl;

import com.itheima.dao.IProductDao;
import com.itheima.domain.Product;
import com.itheima.service.IProductService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class ProductServiceImpl implements IProductService {
    //注入dao
    private IProductDao productDao;
    /**
     * 查询全部产品
     */
    @Override
    public List<Product> findAll() {

        return productDao.findAll();
    }
}
