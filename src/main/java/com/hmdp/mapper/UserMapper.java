package com.hmdp.mapper;

import com.hmdp.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 虎哥
 * @since 2021-12-22
 */
public interface UserMapper extends BaseMapper<User> {

    /**
     * 根据id列表查询用户，保持id顺序
     * @param ids
     * @return
     */
    List<User> listByIdsOrdered(List<Long> ids);
}