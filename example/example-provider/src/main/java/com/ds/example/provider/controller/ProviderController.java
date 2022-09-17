package com.ds.example.provider.controller;

import com.ds.example.provider.service.ProviderService;
import com.tencent.cloud.polaris.PolarisDiscoveryProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ds
 */
@RestController
@RequestMapping("provider")
public class ProviderController {

    @Resource
    private ProviderService providerService;

    @GetMapping(value = "/echo/{msg}")
    public String echo(@PathVariable String msg) {
        return providerService.echo(msg);
    }

}
