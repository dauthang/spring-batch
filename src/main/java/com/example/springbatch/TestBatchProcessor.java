package com.example.springbatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;


public class TestBatchProcessor implements ItemProcessor<TestBatch, TestBatch> {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestBatchProcessor.class);

    @Override
    public TestBatch process(final TestBatch testBatch) throws Exception {
        String name =  testBatch.getName().toUpperCase();
        String password = testBatch.getRunOrder().toUpperCase();
        TestBatch transformedTestBatch = new TestBatch(null, name, password);
        LOGGER.info(name, password);
        return transformedTestBatch;
    }
}
