package com.controller;

import com.model.TaiKhoan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/form")
public class FormController {

    @RequestMapping(value = "/dangky",method = RequestMethod.GET)
    public String dangky(ModelMap modelMap){
        modelMap.addAttribute("taikhoan",new TaiKhoan());
        return "dangky";
    }
    @RequestMapping(value = "/xulidangki",method = RequestMethod.POST)
    public String xulidangki(@ModelAttribute(value = "taikhoan") TaiKhoan taikhoan,ModelMap mm){
        mm.addAttribute("tk",taikhoan);
        return "welcome";
    }
}
