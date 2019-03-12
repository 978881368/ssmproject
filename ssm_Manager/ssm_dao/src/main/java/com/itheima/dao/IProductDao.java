package com.itheima.dao;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import com.itheima.entity.Product;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface IProductDao {
    /**
     * 查询全部
     */
 @Select("select * from product")
    List<Product> findAll();

    /**
     * 保存
     * @param product
     */
    @Insert("insert into  product values(seq_product.nextval,#{productNum},\n" +
            "#{productName},#{cityName},#{departureTime},#{productPrice},#{productDesc},#{productStatus})")
    void save(Product product);


}
