package com.kenny.esjob.config;

import com.dangdang.ddframe.job.event.JobEventConfiguration;
import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter;
import org.springframework.beans.factory.annotation.Autowired;

public class MySimpleJobConfig {
    @Autowired
    private ZookeeperRegistryCenter registryCenter;

    @Autowired
    private JobEventConfiguration jobEventConfiguration;
}
