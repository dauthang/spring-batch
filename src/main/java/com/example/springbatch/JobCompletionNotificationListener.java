package com.example.springbatch;

import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.CompositeJobExecutionListener;
import org.springframework.stereotype.Component;

@Component
public class JobCompletionNotificationListener extends CompositeJobExecutionListener {
    @Override
    public void afterJob(JobExecution jobExecution) {
        System.out.println(" ====== status = "+jobExecution.getStatus() );
        if (jobExecution.getStatus() == BatchStatus.COMPLETED) {
            System.out.println("!!! JOB FINISHED! Time to verify the results = "+jobExecution);

        }
    }

}
