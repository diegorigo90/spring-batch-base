package it.diegorigo.springbatch.listeners;

import it.diegorigo.springbatch.dto.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ItemProcessListener;
import org.springframework.stereotype.Component;

@Component
public class MyItemProcessListener implements ItemProcessListener<Person, Person> {
    private static final Logger log = LoggerFactory.getLogger(MyItemProcessListener.class);

    @Override
    public void beforeProcess(Person person) {
        log.info("Item Processor input: " + person.toString());
    }

    @Override
    public void afterProcess(Person person, Person person2) {
        log.info("Item Processor output: " + person2.toString());
    }

    @Override
    public void onProcessError(Person person, Exception e) {
        log.info("Item Processor error during process " + person.toString());
    }
}
