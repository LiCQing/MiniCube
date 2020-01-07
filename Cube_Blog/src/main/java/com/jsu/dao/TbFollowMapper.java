package com.jsu.dao;

import com.jsu.pojo.TbFollow;
import com.jsu.pojo.TbFollowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbFollowMapper {
    int countByExample(TbFollowExample example);

    int deleteByExample(TbFollowExample example);

    int deleteByPrimaryKey(Integer flId);

    int insert(TbFollow record);

    int insertSelective(TbFollow record);

    List<TbFollow> selectByExample(TbFollowExample example);

    TbFollow selectByPrimaryKey(Integer flId);

    int updateByExampleSelective(@Param("record") TbFollow record, @Param("example") TbFollowExample example);

    int updateByExample(@Param("record") TbFollow record, @Param("example") TbFollowExample example);

    int updateByPrimaryKeySelective(TbFollow record);

    int updateByPrimaryKey(TbFollow record);
}