package com.lnwazg.dao;

import java.util.List;

import com.lnwazg.dbkit.anno.dao.handletype.Select;
import com.lnwazg.dbkit.jdbc.MyJdbc;
import com.lnwazg.entity.WorkInfo;

/**
 * 工作信息DAO
 * @author nan.li
 * @version 2018年9月19日
 */
public interface WorkInfoDao extends MyJdbc
{
    /**
     * 根据内容信息查到对象
     * @param content
     * @return
     */
    @Select
    List<WorkInfo> queryByContent(String content);
}
