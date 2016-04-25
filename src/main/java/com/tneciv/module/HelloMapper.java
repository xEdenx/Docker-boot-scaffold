package com.tneciv.module;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by Tneciv on 2016/10/4.
 */
@Mapper
public interface HelloMapper {

    @Select("select * from hello where hello = #{key} ")
    HelloEntity findByKey(@Param("key") String key);

}
