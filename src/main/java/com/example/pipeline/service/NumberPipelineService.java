package com.example.pipeline.service;

import com.example.pipeline.pipeline.Pipeline;
import com.example.pipeline.pipeline.stages.StringToIntegerStage;
import com.example.pipeline.pipeline.stages.IntegerToBooleanStage;
import com.example.pipeline.pipeline.stages.BooleanToMessageStage;
import org.springframework.stereotype.Service;

@Service
public class NumberPipelineService {

    private final StringToIntegerStage stringToIntegerStage;
    private final IntegerToBooleanStage integerToBooleanStage;
    private final BooleanToMessageStage booleanToMessageStage;

    public NumberPipelineService(StringToIntegerStage s, IntegerToBooleanStage i, BooleanToMessageStage b) {
        this.stringToIntegerStage = s;
        this.integerToBooleanStage = i;
        this.booleanToMessageStage = b;
    }

    public String process(String input) {
        Pipeline<String, String> pipeline = new Pipeline<String, String>()
                .addStage(stringToIntegerStage)
                .addStage(integerToBooleanStage)
                .addStage(booleanToMessageStage);

        return pipeline.execute(input);
    }
}
