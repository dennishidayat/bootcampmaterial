package com.enigma.task.bootcampmaterial.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;

import com.enigma.task.bootcamp.dao.impl.BaseImpl;
import com.enigma.task.bootcamp.model.BootcampPeriod;
import com.enigma.task.bootcampmaterial.dao.BootcampMaterialDao;
import com.enigma.task.bootcampmaterial.exception.CustomException;
import com.enigma.task.bootcampmaterial.model.BootcampMaterial;
import com.enigma.task.bootcampmaterial.repository.BootcampMaterialRepository;
import com.enigma.task.studymaterial.model.StudyMaterial;
import com.enigma.task.trainer.model.Trainer;



public class BootcampMaterialDaoImpl extends BaseImpl implements BootcampMaterialDao{
	
	@Autowired
	private BootcampMaterialRepository repository;

	public BootcampMaterial getById(int id) throws CustomException {
		return repository.findById(id).orElse(null);
	}

	public BootcampMaterial save(BootcampMaterial bootcampMaterial) throws CustomException {
		return repository.save(bootcampMaterial);
	}

	public void delete(BootcampMaterial bootcampMaterial) throws CustomException {
		repository.delete(bootcampMaterial);
		
	}

	public List<BootcampMaterial> getList() throws CustomException {
		CriteriaBuilder critB = em.getCriteriaBuilder();
		CriteriaQuery<BootcampMaterial> query = critB.createQuery(BootcampMaterial.class);
		Root<BootcampMaterial> root = query.from(BootcampMaterial.class);
		query.select(root);
		
		TypedQuery<BootcampMaterial> i = em.createQuery(query);
		
		return i.getResultList();
	}

	public List<BootcampMaterial> getListByActiveFlag() throws CustomException {
		CriteriaBuilder critB = em.getCriteriaBuilder();
		CriteriaQuery<BootcampMaterial> query = critB.createQuery(BootcampMaterial.class);
		Root<BootcampMaterial> root = query.from(BootcampMaterial.class);
		query = query.select(root)
				.where(critB.equal(root.get("activeFlag"), 1));
		
		TypedQuery<BootcampMaterial> i = em.createQuery(query);
		
		return i.getResultList();
	}

	@Override
	public List<BootcampMaterial> getBootcampPeriodList(BootcampPeriod bootcampPeriod) throws CustomException {
		return repository.findByBootcampPeriod(bootcampPeriod);
	}

	@Override
	public List<BootcampMaterial> getStudyMaterialList(StudyMaterial studyMaterial) throws CustomException {
		return repository.findByStudyMaterial(studyMaterial);
	}

	@Override
	public List<BootcampMaterial> getTrainerList(Trainer trainer) throws CustomException {
		return repository.findByTrainer(trainer);
	}
	
}
