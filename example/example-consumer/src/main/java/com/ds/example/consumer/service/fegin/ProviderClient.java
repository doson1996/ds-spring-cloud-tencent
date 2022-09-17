package com.ds.example.consumer.service.fegin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author ds
 */
@FeignClient(name = "example-provider", path = "provider")
public interface ProviderClient {

    /**
     * 打印来自provider服务的消息
     * @param msg
     * @return
     */
    @GetMapping("/echo/{msg}")
    String echo(@PathVariable String msg);

}
