package com.lnwazg.service;

import com.lnwazg.dao.WorkInfoDao;
import com.lnwazg.kit.singleton.B;

public class WorkInfoService
{
   public WorkInfoDao workInfoDao = B.g(WorkInfoDao.class);
}
