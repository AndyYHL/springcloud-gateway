package com.tuyou.tuyouerp.dao;

import com.xdjk.model.erp.ErpOperateLog;
import com.xdjk.model.erp.ErpOperateLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ErpOperateLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table erp_operate_log
     *
     * @mbg.generated
     */
    long countByExample(ErpOperateLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table erp_operate_log
     *
     * @mbg.generated
     */
    int deleteByExample(ErpOperateLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table erp_operate_log
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer operateLogId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table erp_operate_log
     *
     * @mbg.generated
     */
    int insert(ErpOperateLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table erp_operate_log
     *
     * @mbg.generated
     */
    int insertSelective(ErpOperateLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table erp_operate_log
     *
     * @mbg.generated
     */
    List<ErpOperateLog> selectByExampleWithRowbounds(ErpOperateLogExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table erp_operate_log
     *
     * @mbg.generated
     */
    List<ErpOperateLog> selectByExample(ErpOperateLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table erp_operate_log
     *
     * @mbg.generated
     */
    ErpOperateLog selectByPrimaryKey(Integer operateLogId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table erp_operate_log
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ErpOperateLog record, @Param("example") ErpOperateLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table erp_operate_log
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ErpOperateLog record, @Param("example") ErpOperateLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table erp_operate_log
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ErpOperateLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table erp_operate_log
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ErpOperateLog record);
}