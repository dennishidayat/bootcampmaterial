package com.enigma.task.bootcampmaterial.dto;

import com.enigma.task.bootcamp.model.BootcampPeriod;
import com.enigma.task.studymaterial.model.StudyMaterial;
import com.enigma.task.trainer.model.Trainer;

public class BootcampMaterialDto {
	private Integer id;
	private BootcampPeriod bootcampPeriod;
	private StudyMaterial studyMaterial;
	private Trainer trainer;
	private String description;
	private Boolean activeFlag;
	
	public BootcampMaterialDto(Integer id, BootcampPeriod bootcampPeriod, StudyMaterial studyMaterial, Trainer trainer, String description, Boolean activeFlag) {
		this.id = id;
		this.bootcampPeriod = bootcampPeriod;
		this.studyMaterial = studyMaterial;
		this.trainer = trainer;
		this.description = description;
		this.activeFlag = activeFlag;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public BootcampPeriod getBootcampPeriod() {
		return bootcampPeriod;
	}


	public void setBootcampPeriod(BootcampPeriod bootcampPeriod) {
		this.bootcampPeriod = bootcampPeriod;
	}


	public StudyMaterial getStudyMaterial() {
		return studyMaterial;
	}


	public void setStudyMaterial(StudyMaterial studyMaterial) {
		this.studyMaterial = studyMaterial;
	}


	public Trainer getTrainer() {
		return trainer;
	}


	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Boolean getActiveFlag() {
		return activeFlag;
	}


	public void setActiveFlag(Boolean activeFlag) {
		this.activeFlag = activeFlag;
	}


	public BootcampMaterialDto() {}

	

}
