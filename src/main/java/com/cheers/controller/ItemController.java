package com.cheers.controller;

import com.cheers.model.dto.ItemDTO;
import com.cheers.model.dto.ItemDeleteDTO;
import com.cheers.model.dto.ItemQueryDTO;
import com.cheers.model.vo.ItemVO;
import com.cheers.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/item/v1")
public class ItemController {
    private final ItemService service;

    @GetMapping("/{id}/query")
    public ItemVO getItem(@PathVariable Integer id) {
        return service.selectById(id);
    }

    @GetMapping("/list")
    public List<ItemVO> list(@RequestBody ItemQueryDTO queryDTO) {
        return service.selectByCondition(queryDTO);
    }

    @PostMapping("/new")
    public void add(@RequestBody List<ItemDTO> itemDTOs) {
        service.insertItems(itemDTOs);
    }

    @PostMapping("/delete")
    public void remove(@RequestBody ItemDeleteDTO deleteDTO) {
        service.deleteById(deleteDTO.getIds());
    }

    @PostMapping("/update")
    public boolean update(@RequestBody ItemDTO itemDTO) {
        return service.updateById(itemDTO);
    }
}
