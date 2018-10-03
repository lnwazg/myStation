package com.lnwazg.dao;

import java.util.List;

import com.lnwazg.dbkit.anno.dao.handletype.Select;
import com.lnwazg.dbkit.jdbc.MyJdbc;

public interface RssInfoDao extends MyJdbc
{
    
    //TODO  这个不支持的问题解决
    @Select("select content from RssInfo")
    List<String> queryAllContent();
}
