package org.com.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.com.entity.TblItem;
import org.com.entity.TblItemExample;

public interface TblItemMapper {
    long countByExample(TblItemExample example);

    int deleteByExample(TblItemExample example);

    int deleteByPrimaryKey(Integer itemId);

    int insert(TblItem record);

    int insertSelective(TblItem record);

    List<TblItem> selectByExample(TblItemExample example);

    TblItem selectByPrimaryKey(Integer itemId);

    int updateByExampleSelective(@Param("record") TblItem record, @Param("example") TblItemExample example);

    int updateByExample(@Param("record") TblItem record, @Param("example") TblItemExample example);

    int updateByPrimaryKeySelective(TblItem record);

    int updateByPrimaryKey(TblItem record);
}