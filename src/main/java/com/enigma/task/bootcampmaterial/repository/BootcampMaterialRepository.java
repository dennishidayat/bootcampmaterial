package com.enigma.task.bootcampmaterial.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.enigma.task.bootcamp.model.BootcampPeriod;
import com.enigma.task.bootcampmaterial.model.BootcampMaterial;
import com.enigma.task.studymaterial.model.StudyMaterial;
import com.enigma.task.trainer.model.Trainer;


public interface BootcampMaterialRepository extends PagingAndSortingRepository<BootcampMaterial, Integer>{
	
	List<BootcampMaterial> findByBootcampPeriod(BootcampPeriod bootcampPeriod);
	List<BootcampMaterial> findByStudyMaterial(StudyMaterial studyMaterial);
	List<BootcampMaterial> findByTrainer(Trainer trainer);
}
