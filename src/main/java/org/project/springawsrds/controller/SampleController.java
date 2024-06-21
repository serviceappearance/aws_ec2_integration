package org.project.springawsrds.controller;

import org.project.springawsrds.entity.Sample;
import org.project.springawsrds.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SampleController {

  @Autowired
  private SampleService sampleService;

  @GetMapping("/samples")
  public List<Sample> getAllSamples() {
    List<Sample> allSample = sampleService.getAllSample();
    return allSample;
  }

  @PostMapping("/samples")
  public Sample createSample(@RequestBody Sample sample) {
    Sample sample1 = sampleService.saveSample(sample);
    return sample1;
  }

}
