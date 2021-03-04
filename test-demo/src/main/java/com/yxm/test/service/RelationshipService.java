package com.yxm.test.service;

import com.yxm.test.entity.Movie;
import com.yxm.test.entity.Person;

/**
 * @Author: yuxiangming
 * @Date: 2021/3/3 16:13
 * @Description:    操作节点关系接口
 */
public interface RelationshipService {

    /**
     * 给电影添加演员关系
     * @param person 演员
     * @param movie  电影
     * @return  返回值大于0代表成功，小于0代表失败
     */
    int addActorToMovie(Person person, Movie movie);
}
