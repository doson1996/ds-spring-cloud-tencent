package com.ds.example.provider.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author ds
 */
public interface ProviderService {

    /**
     * 打印消息
     * @param msg
     * @return
     */
    @GetMapping("/echo/{msg}")
    String echo(@PathVariable String msg);

}
