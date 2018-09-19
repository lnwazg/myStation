package com.lnwazg.service;

import java.sql.SQLException;

import com.lnwazg.dao.WorkInfoDao;
import com.lnwazg.dbkit.anno.service.Transactional;
import com.lnwazg.entity.WorkInfo;
import com.lnwazg.kit.singleton.B;

/**
 * Service类
 * @author nan.li
 * @version 2018年9月19日
 */
public class WorkInfoService
{
    private WorkInfoDao workInfoDao = B.g(WorkInfoDao.class);
    
    @Transactional
    public void saveWorkInfo(WorkInfo workInfo)
        throws SQLException
    {
        workInfoDao.insert(workInfo);
    }
}
