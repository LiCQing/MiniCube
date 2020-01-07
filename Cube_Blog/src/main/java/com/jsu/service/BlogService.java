package com.jsu.service;

import com.jsu.pojo.TbBlog;
import com.jsu.vo.RequestPage;

import java.util.List;

public interface BlogService {
    void insert(TbBlog blog);

    TbBlog getById(Integer blogId);

    void update(TbBlog blog);
}
