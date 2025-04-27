package com.kenny.esjob.task;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import com.kenny.esjob.annotation.JobTrace;
import org.springframework.stereotype.Component;

@Component
public class MySimpleJob implements SimpleJob {
//    @JobTrace
    @Override
    public void execute(ShardingContext shardingContext) {

        System.err.println("---------	Starting task MySimpleJob	---------");
//
//		System.err.println(shardingContext.getJobName());
//		System.err.println(shardingContext.getJobParameter());
//		System.err.println(shardingContext.getShardingItem());
//		System.err.println(shardingContext.getShardingParameter());
//		System.err.println(shardingContext.getShardingTotalCount());
//		System.err.println("Current thread: ---------------" + Thread.currentThread().getName());
//
//		System.err.println("----------Task ended-------");
    }
}
