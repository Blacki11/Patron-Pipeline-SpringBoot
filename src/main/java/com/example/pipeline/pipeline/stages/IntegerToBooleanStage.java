package com.example.pipeline.pipeline.stages;

import com.example.pipeline.pipeline.Stage;
import org.springframework.stereotype.Component;

@Component
public class IntegerToBooleanStage implements Stage<Integer, Boolean> {
    @Override
    public Boolean process(Integer input) {
        return input % 2 == 0; // true si es par
    }
}
