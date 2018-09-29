package com.example.demo.controller;

import com.example.demo.enums.SortType;
import com.example.demo.service.UserInfoService;
import com.example.demo.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/")
public class UserInfoController {
    @Autowired
    UserInfoService userInfoService;

    /**
     * 页面跳转
     * @param
     * @return ModelAndView
     */
    @RequestMapping(value = "sortUser.html")
    public ModelAndView sortUser(){
        ModelAndView modelAndView = new ModelAndView("/sortUser");
        return modelAndView;
    }

    /**
     *获取排序后的人员信息
     * @param sortType sortField
     * @return ResultVo
     */
    @RequestMapping(value = "getUserInfo")
    @ResponseBody
    public ResultVo getUserInfo(Short sortType, Short sortField){
        if((sortType == null && sortField == null) || (sortType != null && sortField != null)){
            return new ResultVo(1,userInfoService.query(SortType.getSortTypeByIds(sortType,sortField)));
        }else {
            return new ResultVo(0,"排序规则不正确！");
        }
    }

}
