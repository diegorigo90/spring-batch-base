package it.diegorigo.springbatch.listeners;

import it.diegorigo.springbatch.dto.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ItemReadListener;
import org.springframework.stereotype.Component;

@Component
public class MyItemReadListener implements ItemReadListener<Person> {
    private static final Logger log = LoggerFactory.getLogger(MyItemReadListener.class);

    @Override
    public void beforeRead() {
        log.info("Item reader is starting");
    }

    @Override
    public void afterRead(Person person) {
        log.info("Readed person " + person.toString());
    }

    @Override
    public void onReadError(Exception e) {
        log.info("Item reader error");
    }
}
