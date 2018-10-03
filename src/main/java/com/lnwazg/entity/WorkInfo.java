package com.lnwazg.entity;

import com.lnwazg.dbkit.anno.entity.AutoIncrement;
import com.lnwazg.dbkit.anno.entity.Comment;
import com.lnwazg.dbkit.anno.entity.Id;
import com.lnwazg.dbkit.tools.entity.template.TimestampEntityTemplate;

@Comment("工作信息表")
public class WorkInfo extends TimestampEntityTemplate
{
    @Id
    @AutoIncrement
    @Comment("主键")
    Integer id;
    
    @Comment("工作信息内容")
    String content;
    
    public Integer getId()
    {
        return id;
    }
    
    public WorkInfo setId(Integer id)
    {
        this.id = id;
        return this;
    }
    
    public String getContent()
    {
        return content;
    }
    
    public WorkInfo setContent(String content)
    {
        this.content = content;
        return this;
    }
    
}
