package com.kenny.esjob.task;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.dataflow.DataflowJob;
import com.kenny.esjob.entity.Foo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class SpringDataflowJob implements DataflowJob<Foo> {
    private static final Logger LOGGER = LoggerFactory.getLogger(SpringDataflowJob.class);

    @Override
    public List<Foo> fetchData(final ShardingContext shardingContext) {
        System.err.println("--------------@@@@@@@@@@ Fetching data collection...--------------");
        List<Foo> list = new ArrayList<Foo>();
        list.add(new Foo("001", "John"));
        list.add(new Foo("002", "Mike"));
        return list;
    }

    @Override
    public void processData(final ShardingContext shardingContext, final List<Foo> data) {
        System.err.println("--------------@@@@@@@@@ Processing data collection...--------------");
    }
}
