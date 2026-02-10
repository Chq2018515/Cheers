package com.cheers.service;

import com.cheers.model.dto.ItemDTO;
import com.cheers.model.dto.ItemQueryDTO;
import com.cheers.model.entity.Item;
import com.baomidou.mybatisplus.extension.service.IService;
import com.cheers.model.vo.ItemVO;

import java.util.List;

/**
* @author iris
* @description 针对表【item(单品)】的数据库操作Service
* @createDate 2026-02-09 15:15:59
*/
public interface ItemService extends IService<Item> {
    ItemVO selectById(Integer id);
    List<ItemVO> selectByCondition(ItemQueryDTO dto);
    void insertItems(List<ItemDTO> dtos);
    void deleteById(List<Integer> ids);
    boolean updateById(ItemDTO itemDTO);
}
