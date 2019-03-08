package com.enigma.task.bootcampmaterial.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.enigma.task.bootcamp.model.BootcampPeriod;
import com.enigma.task.studymaterial.model.StudyMaterial;
import com.enigma.task.trainer.model.Trainer;

@Entity
@Table(name="bootcamp_material")
public class BootcampMaterial {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	@ManyToOne
	@JoinColumn(name="bootcamp_period_id")
	private BootcampPeriod bootcampPeriod;
	@ManyToOne
	@JoinColumn(name="material_id")
	private StudyMaterial studyMaterial;
	@ManyToOne
	@JoinColumn(name="trainer_id")
	private Trainer trainer;
	@Column(name="description")
	private String description;
	@Column(name="active_flag")
	private Boolean activeFlag;
	
	public BootcampMaterial(int id, BootcampPeriod bootcampPeriod, StudyMaterial studyMaterial, Trainer trainer, String description, Boolean activeFlag) {
		this.id = id;
		this.bootcampPeriod = bootcampPeriod;
		this.studyMaterial = studyMaterial;
		this.trainer = trainer;
		this.description = description;
		this.activeFlag = activeFlag;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public BootcampMaterial() {}

}
