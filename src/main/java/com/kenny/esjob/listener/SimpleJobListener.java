package com.kenny.esjob.listener;

import com.alibaba.fastjson.JSON;
import com.dangdang.ddframe.job.executor.ShardingContexts;
import com.dangdang.ddframe.job.lite.api.listener.ElasticJobListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleJobListener implements ElasticJobListener {

    private static Logger LOGGER = LoggerFactory.getLogger(SimpleJobListener.class);

    @Override
    public void beforeJobExecuted(ShardingContexts shardingContexts) {
        LOGGER.info("-----------------Before job execution: {}", JSON.toJSONString(shardingContexts));
    }

    @Override
    public void afterJobExecuted(ShardingContexts shardingContexts) {
        LOGGER.info("-----------------After job execution: {}", JSON.toJSONString(shardingContexts));
    }

}
