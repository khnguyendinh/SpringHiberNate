package com.controller;

import com.model.SanPham;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/hello")
public class HelloController {

    @RequestMapping(value = "/xinchao",method = RequestMethod.GET)
    public String xinchao(ModelMap modelMap){
        modelMap.put("a","nguyen van a");
        modelMap.put("b","nguyen van b");
        modelMap.put("sp",new SanPham("ghe","maGhe", 1000));
        List<SanPham> sanPhams = new ArrayList<SanPham>();
        sanPhams.add(new SanPham("ten1", "masp1", 100));
        sanPhams.add(new SanPham("ten2", "masp2", 101));
        sanPhams.add(new SanPham("ten3", "masp3", 102));
        modelMap.put("dsSanPham",sanPhams);
        return "xinchao";
    }
    @RequestMapping(value = "/hienthi/{noidung}",method = RequestMethod.GET)
    public String hienthi(@PathVariable (value = "noidung")String noidung, ModelMap modelMap){
        modelMap.put("noidung",noidung);
        return "hienthi";
    }
}
