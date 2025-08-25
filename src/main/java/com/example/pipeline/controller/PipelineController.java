package com.example.pipeline.controller;

import com.example.pipeline.service.NumberPipelineService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pipeline")
public class PipelineController {

    private final NumberPipelineService service;

    public PipelineController(NumberPipelineService service) {
        this.service = service;
    }

    @GetMapping
    public String process(@RequestParam String number) {
        return service.process(number);
    }
}
