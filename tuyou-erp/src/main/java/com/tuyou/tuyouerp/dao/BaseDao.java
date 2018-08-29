package com.tuyou.tuyouerp.dao;

import java.util.List;
import java.util.Map;

public interface BaseDao<Entity> {
    /**
     * 根据ID号查询单个实体
     * @param m
     */
    Entity find(Map m);

    /**
     * 根据实体对象查询
     * @param m
     * @return
     */
    List<Entity> findEntity(Map m);

    /**
     * 由分页信息查询分页记录
     * @param m
     * @return
     */
    List<Entity> findLimit(Map m);


    /**
     * 为分页查询出记录总数
     * @param m
     * @return
     */
    Integer findCount(Map m);

    /**
     * 保存全部字段
     * @param m
     * @return
     */
    int save(Map m);
    /**
     * 插入
     * @param m
     */
    Integer saveNotNull(Map m);

    /**
     * 根据ID号修改单个实体
     * @param m
     */
    Integer upt(Map m);

    /**
     * 根据ID号删除单个实体
     * @param m
     */
    Integer del(Map m);

    /**
     * 批量插入
     * @param m
     * @return
     */
    Integer insertTranscationList(Map m);
}
