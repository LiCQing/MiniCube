package com.jsu.dao;

import com.jsu.pojo.TbLike;
import com.jsu.pojo.TbLikeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbLikeMapper {
    int countByExample(TbLikeExample example);

    int deleteByExample(TbLikeExample example);

    int deleteByPrimaryKey(Integer lkId);

    int insert(TbLike record);

    int insertSelective(TbLike record);

    List<TbLike> selectByExample(TbLikeExample example);

    TbLike selectByPrimaryKey(Integer lkId);

    int updateByExampleSelective(@Param("record") TbLike record, @Param("example") TbLikeExample example);

    int updateByExample(@Param("record") TbLike record, @Param("example") TbLikeExample example);

    int updateByPrimaryKeySelective(TbLike record);

    int updateByPrimaryKey(TbLike record);
}