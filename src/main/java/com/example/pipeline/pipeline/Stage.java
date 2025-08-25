package com.example.pipeline.pipeline;

public interface Stage<I, O> {
    O process(I input);
}
