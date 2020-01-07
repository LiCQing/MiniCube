package com.jsu.controller;

import com.jsu.pojo.TbBlog;
import com.jsu.service.BlogService;
import com.jsu.vo.CubeResult;
import com.jsu.vo.RequestPage;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 微博模块
 */
@RestController
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    private BlogService service;

    /**
     * 发表微博
     * @param blog
     * @return
     */
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public CubeResult insert(@RequestBody TbBlog blog){
        return CubeResult.SUCCESS();
    }

    /**
     * 查看某一条微博
     * @param blogId
     * @return
     */
    @RequestMapping(value = "/get/{blogId}",method = RequestMethod.GET)
    public CubeResult find(@PathVariable Integer blogId){
        return CubeResult.SUCCESS(service.getById(blogId));
    }

    /**
     * 修改某一条微博
     * @param blog
     * @return
     */
    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public CubeResult update(TbBlog blog){
        service.update(blog);
        return CubeResult.SUCCESS();
    }



}
