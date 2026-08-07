package com.hmdp.mapper;

import com.hmdp.entity.Blog;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.Collection;
import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 虎哥
 * @since 2021-12-22
 */
public interface BlogMapper extends BaseMapper<Blog> {

    /**
     * 根据id查询用户
     * @param ids
     * @return
     */
    Collection<Object> listMapper(List<Long> ids);
}
