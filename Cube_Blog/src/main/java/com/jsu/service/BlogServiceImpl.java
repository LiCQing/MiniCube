package com.jsu.service;

import com.jsu.dao.TbBlogMapper;
import com.jsu.pojo.TbBlog;
import com.jsu.pojo.TbBlogExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private TbBlogMapper blogMapper;

    @Override
    public void insert(TbBlog blog) {
        System.out.println(blogMapper.insert(blog));
    }

    @Override
    public TbBlog getById(Integer blogId) {
        return blogMapper.selectByPrimaryKey(blogId);
    }

    @Override
    public void update(TbBlog blog) {
        blogMapper.updateByPrimaryKeySelective(blog);
    }


}
