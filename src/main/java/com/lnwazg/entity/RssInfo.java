package com.lnwazg.entity;

import com.lnwazg.dbkit.anno.entity.AutoIncrement;
import com.lnwazg.dbkit.anno.entity.Comment;
import com.lnwazg.dbkit.anno.entity.Id;
import com.lnwazg.dbkit.template.entity.TimestampEntityTemplate;

@Comment("RSS表")
public class RssInfo extends TimestampEntityTemplate
{
    @Id
    @AutoIncrement
    @Comment("主键")
    Integer id;
    
    @Comment("rss内容")
    String content;
    
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
    
}
