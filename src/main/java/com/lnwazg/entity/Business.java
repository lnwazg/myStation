package com.lnwazg.entity;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.lnwazg.dbkit.anno.entity.AutoIncrement;
import com.lnwazg.dbkit.anno.entity.Comment;
import com.lnwazg.dbkit.anno.entity.Id;
import com.lnwazg.dbkit.anno.entity.Varchar;

@Comment("商户表")
public class Business
{
    @Id
    @AutoIncrement(startValue = 10000)
    @Comment("主键")
    Integer id;
    
    @Varchar(200)
    @Comment("商户名称、简称")
    String businessName;
    
    @Varchar(20)
    @Comment("省")
    String province;
    
    @Varchar(20)
    @Comment("市")
    String city;
    
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
    
    public Business setId(Integer id)
    {
        this.id = id;
        return this;
    }
    
    public String getBusinessName()
    {
        return businessName;
    }
    
    public Business setBusinessName(String businessName)
    {
        this.businessName = businessName;
        return this;
    }
    
    public String getProvince()
    {
        return province;
    }
    
    public Business setProvince(String province)
    {
        this.province = province;
        return this;
    }
    
    public String getCity()
    {
        return city;
    }
    
    public Business setCity(String city)
    {
        this.city = city;
        return this;
    }
    
    public Date getCreateTime()
    {
        return createTime;
    }
    
    public Business setCreateTime(Date createTime)
    {
        this.createTime = createTime;
        return this;
    }
    
}
