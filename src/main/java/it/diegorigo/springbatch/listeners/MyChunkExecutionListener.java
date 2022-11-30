package it.diegorigo.springbatch.listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ChunkListener;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.stereotype.Component;

@Component
public class MyChunkExecutionListener implements ChunkListener {

    private static final Logger log = LoggerFactory.getLogger(MyChunkExecutionListener.class);

    @Override
    public void beforeChunk(ChunkContext chunkContext) {
        log.info("Chunk starting");
    }

    @Override
    public void afterChunk(ChunkContext chunkContext) {
        log.info("Chunk completed");
    }

    @Override
    public void afterChunkError(ChunkContext chunkContext) {
        log.info("Chunk error");

    }
}
