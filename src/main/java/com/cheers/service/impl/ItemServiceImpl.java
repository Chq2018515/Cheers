package com.cheers.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cheers.model.dto.ItemDTO;
import com.cheers.model.dto.ItemQueryDTO;
import com.cheers.model.entity.Item;
import com.cheers.model.vo.ItemVO;
import com.cheers.service.ItemService;
import com.cheers.mapper.ItemMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
* @author iris
* @description 针对表【item(单品)】的数据库操作Service实现
* @createDate 2026-02-09 15:15:59
*/
@Service
@Slf4j
public class ItemServiceImpl extends ServiceImpl<ItemMapper, Item>
    implements ItemService{
    @Autowired
    private ItemMapper itemMapper;
    @Override
    public ItemVO selectById(Integer id) {
        Item item = itemMapper.selectOne(Wrappers.<Item>lambdaQuery().eq(Item::getId, id));
        if (null == item) {
            return null;
        }
        ItemVO vo = new ItemVO();
        BeanUtils.copyProperties(item, vo);
        return vo;
    }

    public List<ItemVO> selectByCondition(ItemQueryDTO dto) {
        List<Item> items = itemMapper.selectList(Wrappers.<Item>lambdaQuery()
                .eq(null != dto.getType(), Item::getType, dto.getType())
                .ge(null != dto.getStartDate(), Item::getBuyAt, dto.getStartDate())
                .le(null != dto.getEndDate(), Item::getBuyAt, dto.getEndDate())
                .orderByDesc(Item::getFreq));
        return items.stream().map(
            item -> {
                ItemVO vo = new ItemVO();
                BeanUtils.copyProperties(item, vo);
                return vo;
            }).collect(Collectors.toList());
    }

    public void insertItems(List<ItemDTO> itemDTOs) {
        itemDTOs.stream().map(dto -> {
            Item item = new Item();
            BeanUtils.copyProperties(dto, item);
            itemMapper.insert(item);
            ItemVO vo = new ItemVO();
            BeanUtils.copyProperties(item, vo);
            return vo;
        }).collect(Collectors.toList());
    }

    @Override
    public void deleteById(List<Integer> ids) {
        getBaseMapper().delete(Wrappers.<Item>lambdaUpdate().in(Item::getId, ids));
    }

    public boolean updateById(ItemDTO itemDTO) {
        Item item = new Item();
        BeanUtils.copyProperties(itemDTO, item);
        return itemMapper.updateById(item) > 0;
    }
}




