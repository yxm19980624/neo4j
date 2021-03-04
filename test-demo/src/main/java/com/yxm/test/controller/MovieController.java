package com.yxm.test.controller;

import com.yxm.test.entity.Movie;
import com.yxm.test.mapper.repository.MovieRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yuxiangming
 * @Date: 2021/3/3 16:21
 * @Description: 电影控制模块
 */
@RestController
@RequestMapping("/movie")
@Api(tags = "电影控制模块")
public class MovieController {


    @Autowired
    private MovieRepository movieRepository;

    /**
     * 查询所有电影
     * @return 电影json数组
     */
    @ApiOperation(value = "查询所有电影",notes = "查询所有电影")
    @GetMapping("/all")
    public Iterable<Movie> findAll() {
        return movieRepository.findAll();
    }

    /**
     * 根据发行时间查询
     * @param released   发行时间
     * @return  电影json数组
     */
    @ApiOperation(value = "根据发行时间查询",notes = "根据发行时间查询")
    @GetMapping("/findByReveueGT")
    public Iterable<Movie> findByRevenueGT(@RequestParam Integer released) {
        return movieRepository.findByReleased(released);
    }

    /**
     * 根据电影名称查询某个电影 （目前只做了精确查询）
     * @param title 电影名
     * @return 电影
     */
    @ApiOperation(value = "根据电影名称查询某个电影",notes = "根据电影名称查询某个电影")
    @GetMapping("/findByTitle")
    public Movie findByRevenueGT(@RequestParam String title) {
        return movieRepository.findByTitle(title);
    }

}
