package com.example.pipeline.pipeline;

import java.util.ArrayList;
import java.util.List;

public class Pipeline<I, O> {
    private final List<Stage<?, ?>> stages = new ArrayList<>();

    public <T> Pipeline<I, T> addStage(Stage<? super O, T> stage) {
        Pipeline<I, T> newPipeline = new Pipeline<>();
        newPipeline.stages.addAll(this.stages);
        newPipeline.stages.add(stage);
        return newPipeline;
    }

    @SuppressWarnings("unchecked")
    public O execute(I input) {
        Object result = input;
        for (Stage<?, ?> stage : stages) {
            result = ((Stage<Object, Object>) stage).process(result);
        }
        return (O) result;
    }
}
