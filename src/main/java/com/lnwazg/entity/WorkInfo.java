package com.lnwazg.entity;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.lnwazg.dbkit.anno.entity.AutoIncrement;
import com.lnwazg.dbkit.anno.entity.Comment;
import com.lnwazg.dbkit.anno.entity.Id;

@Comment("工作信息表")
public class WorkInfo
{
    @Id
    @AutoIncrement(startValue = 10000)
    @Comment("主键")
    Integer id;
    
    @Comment("工作信息内容")
    String content;
    
    @Comment("创建时间")
    Date createTime;
    
    @Override
    public String toString()
    {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
    
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
    
    public Date getCreateTime()
    {
        return createTime;
    }
    
    public WorkInfo setCreateTime(Date createTime)
    {
        this.createTime = createTime;
        return this;
    }
}
