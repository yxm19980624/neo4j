package com.yxm.test.mapper.repository;

import com.yxm.test.entity.Movie;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.neo4j.repository.Neo4jRepository;

/**
 * @Author: yuxiangming
 * @Date: 2021/3/3 16:08
 * @Description: 封装了一些方法，类似于mybatis-plus中的IService，例如 match (a:A) where a.property = value return a
 */
public interface MovieRepository extends Neo4jRepository<Movie, Long> {
    Movie findByTitle(@Param("title") String title);

    Iterable<Movie> findByReleased(int released);
}
