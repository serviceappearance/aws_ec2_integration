package org.project.springawsrds.service;

import org.project.springawsrds.entity.Sample;
import org.project.springawsrds.respository.SampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SampleService {

  @Autowired
  private SampleRepository sampleRepository;

  public List<Sample> getAllSample() {
    return sampleRepository.findAll();
  }

  public Sample saveSample(Sample sample) {
    return sampleRepository.save(sample);
  }
}
