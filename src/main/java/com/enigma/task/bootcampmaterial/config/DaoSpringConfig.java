package com.enigma.task.bootcampmaterial.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.enigma.task.bootcampmaterial.dao.BootcampMaterialDao;
import com.enigma.task.bootcampmaterial.dao.impl.BootcampMaterialDaoImpl;

@Configuration
public class DaoSpringConfig {
	
	@Bean
	public BootcampMaterialDao bootcampMaterialDao() {
		return new BootcampMaterialDaoImpl();
	}
	
	@Bean
    public ModelMapper modelMapper() {
    	return new ModelMapper();
    }

}
