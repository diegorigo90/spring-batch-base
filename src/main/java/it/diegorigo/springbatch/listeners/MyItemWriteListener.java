package it.diegorigo.springbatch.listeners;

import it.diegorigo.springbatch.dto.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ItemWriteListener;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyItemWriteListener implements ItemWriteListener<Person> {
    private static final Logger log = LoggerFactory.getLogger(MyItemWriteListener.class);

    @Override
    public void beforeWrite(List<? extends Person> list) {
        log.info("Writing a list of " + list.size() + " items");
    }

    @Override
    public void afterWrite(List<? extends Person> list) {
        log.info("Writing complete for " + list.size() + " items");
    }

    @Override
    public void onWriteError(Exception e, List<? extends Person> list) {
        log.info("Item writer error");
    }
}
