# myStation
SuperBoot的示例项目

### 依赖项目
- SuperBoot

### 近期计划
- 持续打磨被依赖框架
- 学习整合业界的优秀实践
- 通过一系列精美的例子，深化框架的价值

### 项目启动示例：  
```
Powered by
   ____                      ___             __ 
  / __/__ __ ___  ___  ____ / _ ) ___  ___  / /_
 _\ \ / // // _ \/ -_)/ __// _  |/ _ \/ _ \/ __/
/___/ \_,_// .__/\__//_/  /____/ \___/\___/\__/ 
          /_/                                   

[I] 安全化配置模块名称:mystation 
[I] 开始加载安全化配置总文件，路径为/Users/linan/Desktop/secure.properties 
[I] 安全化配置总文件加载完毕！ 
[I] 加载安全配置文件信息... 
[I] 安全配置文件信息加载完毕 
[I] 开始执行包：com.lnwazg.logic.afterreadcfg.TaskList下面的启动任务... 
[I] 开始调用任务：modifyApplicationCfgs... 
[I] [2018-09-23 17:00:34] 开始初始化HikariCP数据源... 
[I] [2018-09-23 17:00:34] 开始加载sqlite数据库驱动... 
[main] INFO com.zaxxer.hikari.HikariDataSource - HikariPool-1 - Starting...
[main] INFO com.zaxxer.hikari.HikariDataSource - HikariPool-1 - Start completed.
[D] [2018-09-23 17:00:34] getConnection()   获取新连接！ 
[D] [2018-09-23 17:00:34] Cost 16 ms, sqlDetail=PRAGMA synchronous=OFF; 
[D] [2018-09-23 17:00:35] close()   主动关闭连接！ 
[D] [2018-09-23 17:00:35] Close Database Connection [HikariProxyConnection@225493257 wrapping org.sqlite.SQLiteConnection@17ed40e0]. 
[D] [2018-09-23 17:00:35] getConnection()   获取新连接！ 
[D] [2018-09-23 17:00:35] Cost 0 ms, sqlDetail=PRAGMA journal_mode=WAL; 
[D] [2018-09-23 17:00:35] close()   主动关闭连接！ 
[D] [2018-09-23 17:00:35] Close Database Connection [HikariProxyConnection@575335780 wrapping org.sqlite.SQLiteConnection@17ed40e0]. 
[D] [2018-09-23 17:00:35] 检查以下类是否在classPath中：com.lnwazg.httpkit.server.HttpServer 
[I] [2018-09-23 17:00:35] SQL_MONITOR已启用... 
[I] [2018-09-23 17:00:35] 启动内置http服务器进行sql监控... 
[I] [2018-09-23 17:00:35] HttpServer start generating route table... 
[I] [2018-09-23 17:00:35] Adding FreeMarker route -> /dbkit/web --> static/ 
[I] [2018-09-23 17:00:35] 未发现Http Filter配置文件，将采用默认的过滤器配置！ 
[I] [2018-09-23 17:00:35] 加载到的filterClassList为:[class com.lnwazg.httpkit.filter.common.CORSFilter] 
[I] [2018-09-23 17:00:35] Adding route -> Route [path=/dbkit/monitor/monitorJson.do, method=void com.lnwazg.dbkit.tools.sqlmonitor.controller.MonitorController.monitorJson()] 
[I] [2018-09-23 17:00:35] Adding route -> Route [path=/dbkit/monitor/queryAllSqlData.do, method=void com.lnwazg.dbkit.tools.sqlmonitor.controller.MonitorController.queryAllSqlData()] 
[I] [2018-09-23 17:00:35] Adding route -> Route [path=/dbkit/monitor/queryBadSqlData.do, method=void com.lnwazg.dbkit.tools.sqlmonitor.controller.MonitorController.queryBadSqlData()] 
[I] [2018-09-23 17:00:35] SQL实时监控模式地址请访问  http://127.0.0.1:5000/dbkit/web/page/monitor.ftl 
[I] [2018-09-23 17:00:35] Routing over! 
[I] [2018-09-23 17:00:35] 未发现myzoo-api依赖库，因此忽略注册到myzoo注册中心。 
[I] [2018-09-23 17:00:35] Http服务器启动完毕！端口号：5000 
[I] [2018-09-23 17:00:35] HttpServer start OK! Cost 365 ms! Please visit http://127.0.0.1:5000/dbkit/__info__
 
[I] [2018-09-23 17:00:35] begin package search entities and init database tables... 
[I] [2018-09-23 17:00:35] 开始自适应数据源进行表初始化... 
[I] [2018-09-23 17:00:35] [package search] init com.lnwazg.entity.WorkInfo  
[D] [2018-09-23 17:00:35] 使用默认数据源 
[I] [2018-09-23 17:00:35] 使用默认数据源初始化表：WorkInfo 
[D] [2018-09-23 17:00:35] getConnection()   获取新连接！ 
[D] [2018-09-23 17:00:35] Cost 8 ms, sqlDetail=SELECT COUNT(1) count FROM sqlite_master where type='table' and name='WorkInfo' 
[D] [2018-09-23 17:00:35] close()   主动关闭连接！ 
[D] [2018-09-23 17:00:35] Close Database Connection [HikariProxyConnection@1410986873 wrapping org.sqlite.SQLiteConnection@17ed40e0]. 
[I] [2018-09-23 17:00:35] begin package search dao... 
[I] [2018-09-23 17:00:35] [package search] init com.lnwazg.dao.WorkInfoDao  
[D] [2018-09-23 17:00:35] 使用默认数据源 
[I] [2018-09-23 17:00:35] 使用默认数据源初始化DAO：WorkInfoDao 
[I] [2018-09-23 17:00:35] begin package search service... 
[I] [2018-09-23 17:00:35] [package search] init com.lnwazg.service.GuokeRssService  
[I] [2018-09-23 17:00:35] [package search] init com.lnwazg.service.WorkInfoService  
[I] [2018-09-23 17:00:35] HttpServer start generating route table... 
[I] [2018-09-23 17:00:35] 开始读取配置值列表，key为:mvc.filters.cfg 
[I] [2018-09-23 17:00:35] 尝试读取key:mvc.filters.cfg[0] 
[I] [2018-09-23 17:00:35] 尝试读取key:mvc.filters.cfg[1] 
[I] [2018-09-23 17:00:35] 读取到空值，结束配置值列表读取！键为：mvc.filters.cfg，值列表为：[com.lnwazg.httpkit.filter.common.CORSFilter] 
[I] [2018-09-23 17:00:35] 加载到的filterClassList为:[class com.lnwazg.httpkit.filter.common.CORSFilter] 
[I] [2018-09-23 17:00:35] Adding route -> Route [path=/processFail.do, method=protected void com.lnwazg.controller.ParentController.processFail(java.lang.Exception,com.lnwazg.kit.common.model.FrontObj)] 
[I] [2018-09-23 17:00:35] Adding route -> Route [path=/rss/viewRss.do, method=void com.lnwazg.controller.RssController.viewRss()] 
[I] [2018-09-23 17:00:35] Adding route -> Route [path=/rss/processFail.do, method=protected void com.lnwazg.controller.ParentController.processFail(java.lang.Exception,com.lnwazg.kit.common.model.FrontObj)] 
[I] [2018-09-23 17:00:35] Adding route -> Route [path=/workinfo/hello.do, method=void com.lnwazg.controller.WorkInfoController.hello()] 
[I] [2018-09-23 17:00:35] Adding route -> Route [path=/workinfo/queryWorkInfo.do, method=void com.lnwazg.controller.WorkInfoController.queryWorkInfo()] 
[I] [2018-09-23 17:00:35] Adding route -> Route [path=/workinfo/saveWorkInfo.do, method=void com.lnwazg.controller.WorkInfoController.saveWorkInfo()] 
[I] [2018-09-23 17:00:35] Adding route -> Route [path=/workinfo/processFail.do, method=protected void com.lnwazg.controller.ParentController.processFail(java.lang.Exception,com.lnwazg.kit.common.model.FrontObj)] 
[I] [2018-09-23 17:00:35] Routing over! 
[I] [2018-09-23 17:00:35] 未发现myzoo-api依赖库，因此忽略注册到myzoo注册中心。 
[I] [2018-09-23 17:00:35] Http服务器启动完毕！端口号：8080 
[I] [2018-09-23 17:00:35] HttpServer start OK! Cost 102 ms! Please visit http://127.0.0.1:8080/__info__
 
[I] [2018-09-23 17:00:35] 根据JOB_SCAN_PACKAGE加载定时器配置... 
[main] INFO org.quartz.impl.StdSchedulerFactory - Using default implementation for ThreadExecutor
[main] INFO org.quartz.simpl.SimpleThreadPool - Job execution threads will use class loader of thread: main
[main] INFO org.quartz.core.SchedulerSignalerImpl - Initialized Scheduler Signaller of type: class org.quartz.core.SchedulerSignalerImpl
[main] INFO org.quartz.core.QuartzScheduler - Quartz Scheduler v.2.2.3 created.
[main] INFO org.quartz.simpl.RAMJobStore - RAMJobStore initialized.
[main] INFO org.quartz.core.QuartzScheduler - Scheduler meta-data: Quartz Scheduler (v2.2.3) 'DefaultQuartzScheduler' with instanceId 'NON_CLUSTERED'
  Scheduler class: 'org.quartz.core.QuartzScheduler' - running locally.
  NOT STARTED.
  Currently in standby mode.
  Number of jobs executed: 0
  Using thread pool 'org.quartz.simpl.SimpleThreadPool' - with 10 threads.
  Using job-store 'org.quartz.simpl.RAMJobStore' - which does not support persistence. and is not clustered.

[main] INFO org.quartz.impl.StdSchedulerFactory - Quartz scheduler 'DefaultQuartzScheduler' initialized from default resource file in Quartz package: 'quartz.properties'
[main] INFO org.quartz.impl.StdSchedulerFactory - Quartz scheduler version: 2.2.3
[main] INFO org.quartz.core.QuartzScheduler - Scheduler DefaultQuartzScheduler_$_NON_CLUSTERED started.
[D] [2018-09-23 17:00:35] QUARTZ_JOB com.lnwazg.job.RefreshRssCacheJob 【0 */5 * * * ?】已启动！ 
[I] [2018-09-23 17:00:35] 定时器加载完毕！ 
[I] [2018-09-23 17:00:35] 开始执行包：com.lnwazg.logic.afterstart.TaskList下面的启动任务... 
[I] [2018-09-23 17:00:35] 开始调用任务：refreshRss... 
[I] [2018-09-23 17:00:35] refreshRssContentCache... 

```
