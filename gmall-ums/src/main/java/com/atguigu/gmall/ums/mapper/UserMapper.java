package com.atguigu.gmall.ums.mapper;

import com.atguigu.gmall.ums.entity.UserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户表
 * 
 * @author babdawn
 * @email 2953616321@qq.com
 * @date 2026-03-20 00:30:47
 */
@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {
	
}
