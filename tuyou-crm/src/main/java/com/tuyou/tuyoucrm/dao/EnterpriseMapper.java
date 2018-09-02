package com.tuyou.tuyoucrm.dao;

import com.tuyou.tuyoucrm.vo.Enterprise;
import com.tuyou.tuyoucrm.vo.EnterpriseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface EnterpriseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enterprise
     *
     * @mbg.generated
     */
    long countByExample(EnterpriseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enterprise
     *
     * @mbg.generated
     */
    int deleteByExample(EnterpriseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enterprise
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer enterpriseId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enterprise
     *
     * @mbg.generated
     */
    int insert(Enterprise record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enterprise
     *
     * @mbg.generated
     */
    int insertSelective(Enterprise record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enterprise
     *
     * @mbg.generated
     */
    List<Enterprise> selectByExampleWithRowbounds(EnterpriseExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enterprise
     *
     * @mbg.generated
     */
    List<Enterprise> selectByExample(EnterpriseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enterprise
     *
     * @mbg.generated
     */
    Enterprise selectByPrimaryKey(Integer enterpriseId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enterprise
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Enterprise record, @Param("example") EnterpriseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enterprise
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Enterprise record, @Param("example") EnterpriseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enterprise
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Enterprise record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enterprise
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Enterprise record);
}