package com.zhuhui.dao;

import com.zhuhui.domain.Items;

//@Repository
public interface ItemsDao {

    /**
     * 根据id查询item
     */
//    @Select("select * from items where id = #{id}")
    Items findById(Integer id);
}
