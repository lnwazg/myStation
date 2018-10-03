package com.lnwazg.entity;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.lnwazg.dbkit.anno.entity.AutoIncrement;
import com.lnwazg.dbkit.anno.entity.Comment;
import com.lnwazg.dbkit.anno.entity.Id;

@Comment("RSS表")
public class RssInfo
{
    @Id
    @AutoIncrement
    @Comment("主键")
    Integer id;
    
    @Comment("rss内容")
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
    
    public RssInfo setId(Integer id)
    {
        this.id = id;
        return this;
    }
    
    public String getContent()
    {
        return content;
    }
    
    public RssInfo setContent(String content)
    {
        this.content = content;
        return this;
    }
    
    public Date getCreateTime()
    {
        return createTime;
    }
    
    public RssInfo setCreateTime(Date createTime)
    {
        this.createTime = createTime;
        return this;
    }
}
