package com.enigma.task.bootcampmaterial.dao;

import java.util.List;

import com.enigma.task.bootcamp.model.BootcampPeriod;
import com.enigma.task.bootcampmaterial.exception.CustomException;
import com.enigma.task.bootcampmaterial.model.BootcampMaterial;
import com.enigma.task.studymaterial.model.StudyMaterial;
import com.enigma.task.trainer.model.Trainer;

public interface BootcampMaterialDao {
	public BootcampMaterial getById(int id) throws CustomException;
	public BootcampMaterial save(BootcampMaterial bootcampMaterial) throws CustomException;
	void delete(BootcampMaterial bootcampMaterial) throws CustomException;
	
	List<BootcampMaterial> getList() throws CustomException;
	List<BootcampMaterial> getBootcampPeriodList(BootcampPeriod bootcampPeriod) throws CustomException;
	List<BootcampMaterial> getStudyMaterialList(StudyMaterial studyMaterial) throws CustomException;
	List<BootcampMaterial> getTrainerList(Trainer trainer) throws CustomException;
	List<BootcampMaterial> getListByActiveFlag() throws CustomException;
}
