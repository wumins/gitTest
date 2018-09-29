package com.example.demo.util;

import com.example.demo.enums.SortType;
import com.example.demo.vo.UserInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 用户排序工具类
 */
public class UserInfoUtil {

    /**
     * 用户排序
     * @param userInfoMap
     * @param sortType
     * @return
     */
    public static List<UserInfo> sortUser(Map<Long,UserInfo> userInfoMap, SortType sortType){
        List<UserInfo> userList = new ArrayList<>(userInfoMap.values());
        if(sortType == null){
            return userList;
        }else if (sortType == SortType.DESC_ID){//ID降序
            for (int i = userList.size()-1;i>0;i-- ){
                for(int j = 0;j<=i-1;j++){
                    if(userList.get(j).getId()<userList.get(j+1).getId()){
                        UserInfo u = userList.get(j);
                        userList.set(j,userList.get(j+1));
                        userList.set(j+1,u);
                    }
                }
            }
        }else if(sortType == SortType.DESC_NAME){//NAME降序
                for (int i = userList.size()-1;i>0;i-- ){
                    for(int j = 0;j<=i-1;j++){
                        if(userList.get(j).getLoginName().charAt(0)<userList.get(j+1).getLoginName().charAt(0)){
                            UserInfo u = userList.get(j);
                            userList.set(j,userList.get(j+1));
                            userList.set(j+1,u);
                        }
                    }
                }
        }else if(sortType == SortType.ASC_ID) {//ID升序
            for (int i = userList.size() - 1; i > 0; i--) {
                for (int j = 0; j <= i - 1; j++) {
                    if (userList.get(j).getId() > userList.get(j + 1).getId()) {
                        UserInfo u = userList.get(j);
                        userList.set(j, userList.get(j + 1));
                        userList.set(j + 1, u);
                    }
                }
            }
        }else{//NAME升序
            for (int i = userList.size()-1;i>0;i-- ){
                for(int j = 0;j<=i-1;j++){
                    if(userList.get(j).getLoginName().charAt(0)>userList.get(j+1).getLoginName().charAt(0)){
                        UserInfo u = userList.get(j);
                        userList.set(j,userList.get(j+1));
                        userList.set(j+1,u);
                    }
                }
            }
        }
        return userList;
    }
}
