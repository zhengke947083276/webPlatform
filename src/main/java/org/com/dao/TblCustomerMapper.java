package org.com.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.com.entity.TblCustomer;
import org.com.entity.TblCustomerExample;

public interface TblCustomerMapper {
    long countByExample(TblCustomerExample example);

    int deleteByExample(TblCustomerExample example);

    int deleteByPrimaryKey(Integer customerId);

    int insert(TblCustomer record);

    int insertSelective(TblCustomer record);

    List<TblCustomer> selectByExample(TblCustomerExample example);

    TblCustomer selectByPrimaryKey(Integer customerId);

    int updateByExampleSelective(@Param("record") TblCustomer record, @Param("example") TblCustomerExample example);

    int updateByExample(@Param("record") TblCustomer record, @Param("example") TblCustomerExample example);

    int updateByPrimaryKeySelective(TblCustomer record);

    int updateByPrimaryKey(TblCustomer record);
}