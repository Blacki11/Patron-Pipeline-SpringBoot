package com.example.pipeline.pipeline.stages;

import com.example.pipeline.pipeline.Stage;
import org.springframework.stereotype.Component;

@Component
public class BooleanToMessageStage implements Stage<Boolean, String> {
    @Override
    public String process(Boolean input) {
        return input ? "El número es PAR ✅" : "El número es IMPAR ❌";
    }
}
