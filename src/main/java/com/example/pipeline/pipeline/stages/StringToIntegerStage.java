package com.example.pipeline.pipeline.stages;

import com.example.pipeline.pipeline.Stage;
import org.springframework.stereotype.Component;

@Component
public class StringToIntegerStage implements Stage<String, Integer> {
    @Override
    public Integer process(String input) {
        return Integer.parseInt(input);
    }
}
