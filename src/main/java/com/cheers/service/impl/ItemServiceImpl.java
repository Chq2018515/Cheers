package com.cheers.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cheers.model.entity.Item;
import com.cheers.service.ItemService;
import com.cheers.mapper.ItemMapper;
import org.springframework.stereotype.Service;

/**
* @author iris
* @description 针对表【item(单品)】的数据库操作Service实现
* @createDate 2026-02-09 15:15:59
*/
@Service
public class ItemServiceImpl extends ServiceImpl<ItemMapper, Item>
    implements ItemService{

}




