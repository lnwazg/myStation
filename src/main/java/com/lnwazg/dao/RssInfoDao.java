package com.lnwazg.dao;

import java.util.List;

import com.lnwazg.dbkit.anno.dao.handletype.Select;
import com.lnwazg.dbkit.jdbc.MyJdbc;
import com.lnwazg.entity.RssInfo;

public interface RssInfoDao extends MyJdbc
{
    @Select
    List<RssInfo> queryByOrderByIdDesc();
    
    @Select
    List<RssInfo> queryOrderByIdDesc();
    
    
}
