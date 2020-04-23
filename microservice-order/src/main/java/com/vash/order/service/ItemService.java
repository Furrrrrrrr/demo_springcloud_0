package com.vash.order.service;

import com.vash.order.entity.Item;
import com.vash.order.properties.OrderProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ItemService {

    // Spring框架对RESTful方式的http请求做了封装，来简化操作
    @Autowired
    private RestTemplate restTemplate;

//    @Value("${myspcloud.item.url}")
//    private String itemUrl;

    @Autowired
    private OrderProperties orderProperties;


    public Item queryItemById(Long id) {
        return this.restTemplate.getForObject(orderProperties.getItem().getUrl()
                + id, Item.class);
    }

}
