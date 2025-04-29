package com.kenny.esjob.task.test;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import org.springframework.stereotype.Component;

@Component
//@ElasticJobConfig(
//        name = "com.bfxy.esjob.task.test.TestJob",
//        cron = "0/5 * * * * ?",
//        description = "Test scheduled job",
//        overwrite = true,
//        shardingTotalCount = 5
//)
public class TestJob implements SimpleJob {
    @Override
    public void execute(ShardingContext shardingContext) {
        System.err.println("Executing Test job.");
    }
}
