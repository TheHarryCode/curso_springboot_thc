package com.harrymesa.curso.springboot.persistence;

import org.springframework.data.repository.CrudRepository;

import com.harrymesa.curso.springboot.model.MarcaDTO;

public interface ICursoSpringRepositoryJPA extends CrudRepository <MarcaDTO, Long>{

}
