package com.zhuhui.service.impl;

import com.zhuhui.dao.ItemsDao;
import com.zhuhui.domain.Items;
import com.zhuhui.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("itemsService")
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsDao itemsDao;

    @Override
    public Items findById(Integer id) {
        return itemsDao.findById(id);
    }
}
