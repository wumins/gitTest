package com.example.demo.service.impl;

import com.example.demo.db.UserDb;
import com.example.demo.enums.SortType;
import com.example.demo.service.UserInfoService;
import com.example.demo.util.UserInfoUtil;
import com.example.demo.vo.UserInfo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    /**
     * 排序后的人员列表
     * @param sortType
     * @return List<UserInfo>
     */
    @Override
    public List<UserInfo> query(SortType sortType) {
        UserDb userDb = UserDb.getInstance();
        Map<Long,UserInfo> map = userDb.getUserMap();
        List<UserInfo> list = UserInfoUtil.sortUser(map,sortType);
        return list;
    }
}
