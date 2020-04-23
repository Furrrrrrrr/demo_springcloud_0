package com.vash.order.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * todo order中用到了item类，是从item项目中直接复制过来的
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {

    private Long id;

    private String title;

    private String pic;

    private String desc;

    private Long price;

}
