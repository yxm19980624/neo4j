package com.yxm.test.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

/**
 * @Author: yuxiangming
 * @Date: 2021/3/3 15:58
 * @Description: 节点实体
 */
@NodeEntity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private Integer born;

    @Relationship(type = "ACTED_IN", direction = Relationship.OUTGOING)     //外向关系 也就是这个是开始节点
    private List<Movie> aMovies;

    //也就是演员指向电影
    @Relationship(type = "DIRECTED", direction = Relationship.OUTGOING)     //外向关系 也就是这个是开始节点
    private List<Movie> dMovies;

}
