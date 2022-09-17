package com.ds.example.consumer.controller;

import com.ds.example.consumer.service.fegin.ProviderClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ds
 */
@RestController
@RequestMapping("consumer")
public class ConsumerController {

    private final ProviderClient providerClient;

    public ConsumerController(ProviderClient providerClient) {
        this.providerClient = providerClient;
    }

    @GetMapping(value = "/echo/{msg}")
    public String echo(@PathVariable String msg) {
        return providerClient.echo(msg);
    }

}
