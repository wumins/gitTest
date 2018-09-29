package com.example.demo.service;

import com.example.demo.enums.SortType;
import com.example.demo.vo.UserInfo;

import java.util.List;

public interface UserInfoService {

    List<UserInfo> query(SortType sortType);

}
