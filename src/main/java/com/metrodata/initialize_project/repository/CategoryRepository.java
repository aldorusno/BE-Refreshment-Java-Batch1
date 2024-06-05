package com.metrodata.initialize_project.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import com.metrodata.initialize_project.entity.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {

}
