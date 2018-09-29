package com.example.demo.db;

import com.example.demo.vo.UserInfo;

import java.util.HashMap;
import java.util.Map;

public class UserDb {

    //用map模拟数据库
    private Map<Long, UserInfo> userMap = null;
    private volatile static UserDb userDb = null;

    /**
     * 构造方法
     */
    private UserDb() {
        this.init();
    }

     public static UserDb getInstance(){
        if(userDb == null){
            synchronized (UserDb.class){
                if(userDb == null){
                    userDb = new UserDb();
                }
            }
        }
        return  userDb;
     }

    /**
     * 获取用户集合
     *
     */
    public Map<Long, UserInfo> getUserMap(){
         return this.userMap;
     }

    /**
     * 数据初始化
     */
    private void init() {
        userMap = new HashMap<>();
        UserInfo user1 = new UserInfo(1L,"andy","","Andy");
        UserInfo user2 = new UserInfo(2L,"carl","","Carl");
        UserInfo user3 = new UserInfo(3L,"bruce","","Bruce");
        UserInfo user4 = new UserInfo(4L,"dolly","","Dolly");
        userMap.put(user1.getId(),user1);
        userMap.put(user2.getId(),user2);
        userMap.put(user3.getId(),user3);
        userMap.put(user4.getId(),user4);
    }
}