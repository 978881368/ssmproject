package com.itheima.controller;

import com.itheima.entity.Product;
import com.itheima.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    //注入service
    @Autowired
    private IProductService productService;

    //查询全部
    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        List<Product> list = productService.findAll();
        ModelAndView mv = new ModelAndView();
        mv.addObject("list", list);
        mv.setViewName("product-list");
        return mv;
    }


    //保存
    @RequestMapping("/save")
    public String save(Product product){
        productService.save(product);
        return "redirect:/product/findAll";

    }


}
