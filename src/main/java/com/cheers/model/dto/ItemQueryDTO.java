package com.cheers.model.dto;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class ItemQueryDTO {
    private String description;
    private Integer type;
    private Integer freq;
    private Timestamp startDate;
    private Timestamp endDate;
}
