package com.yxm.test.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;

/**
 * @Author: yuxiangming
 * @Date: 2021/3/3 15:57
 * @Description: 节点实体
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    @Id
    @GeneratedValue
    private Long id;

    private String title;

    private String tagline;

    private int released;
}
