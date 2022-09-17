package com.ds.example.provider.service.impl;

import com.ds.example.provider.service.ProviderService;
import com.tencent.cloud.polaris.PolarisDiscoveryProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author ds
 */
@Service
@RefreshScope
public class ProviderServiceImpl implements ProviderService {

    @Resource
    PolarisDiscoveryProperties properties;

    /**
     *  动态配置
     */
    @Value("${name}")
    private String name;

    @Override
    public String echo(String msg) {
        return "Hello PolarisMesh " + msg + ", I'm " + properties.getService() + " --" + name;
    }



}
