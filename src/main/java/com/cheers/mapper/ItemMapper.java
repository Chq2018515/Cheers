package com.cheers.mapper;

import com.cheers.model.entity.Item;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author iris
* @description 针对表【item(单品)】的数据库操作Mapper
* @createDate 2026-02-09 15:15:59
* @Entity com.cheers.model.entity.Item
*/
@Mapper
public interface ItemMapper extends BaseMapper<Item> {

}




