package org.project.springawsrds.respository;

import org.project.springawsrds.entity.Sample;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SampleRepository extends JpaRepository<Sample, Long> {
}
