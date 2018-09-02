package com.tuyou.tuyoucrm.dao;

import com.tuyou.tuyoucrm.vo.OperateLog;
import com.tuyou.tuyoucrm.vo.OperateLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface OperateLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operate_log
     *
     * @mbg.generated
     */
    long countByExample(OperateLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operate_log
     *
     * @mbg.generated
     */
    int deleteByExample(OperateLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operate_log
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer operateLogId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operate_log
     *
     * @mbg.generated
     */
    int insert(OperateLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operate_log
     *
     * @mbg.generated
     */
    int insertSelective(OperateLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operate_log
     *
     * @mbg.generated
     */
    List<OperateLog> selectByExampleWithRowbounds(OperateLogExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operate_log
     *
     * @mbg.generated
     */
    List<OperateLog> selectByExample(OperateLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operate_log
     *
     * @mbg.generated
     */
    OperateLog selectByPrimaryKey(Integer operateLogId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operate_log
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") OperateLog record, @Param("example") OperateLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operate_log
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") OperateLog record, @Param("example") OperateLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operate_log
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(OperateLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operate_log
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(OperateLog record);
}