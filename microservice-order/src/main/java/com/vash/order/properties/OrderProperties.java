package com.vash.order.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "myspcloud")
public class OrderProperties {

    // 此处的变量名称要和yml中同级的名称保持一致
    private ItemProperties item;

}
