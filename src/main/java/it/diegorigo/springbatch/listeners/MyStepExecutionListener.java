package it.diegorigo.springbatch.listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.stereotype.Component;

@Component
public class MyStepExecutionListener implements StepExecutionListener {
    private static final Logger log = LoggerFactory.getLogger(MyStepExecutionListener.class);

    @Override
    public void beforeStep(StepExecution stepExecution) {
        log.info("Step " + stepExecution.getStepName() + " is starting");

    }

    @Override
    public ExitStatus afterStep(StepExecution stepExecution) {
        log.info("Step " + stepExecution.getStepName() + " ended");
        return null;
    }
}
