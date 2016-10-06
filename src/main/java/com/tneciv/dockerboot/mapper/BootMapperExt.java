package com.tneciv.dockerboot.mapper;

import com.tneciv.dockerboot.entity.Boot;
import org.apache.ibatis.annotations.Insert;

/**
 * Created by Tneciv on 2016/10/7.
 */
public interface BootMapperExt extends BootMapper {
    @Insert({
            "insert into boot (id, boot, ",
            "name, description, ",
            "memo_rest)",
            "values (#{id,jdbcType=INTEGER}, #{boot,jdbcType=VARCHAR}, ",
            "#{name,jdbcType=VARCHAR}, #{description,jdbcType=VARCHAR}, ",
            "#{memoRest,jdbcType=VARCHAR})"
    })
    int insertBoot(Boot record);
}
