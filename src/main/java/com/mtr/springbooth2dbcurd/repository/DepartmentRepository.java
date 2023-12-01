package com.mtr.springbooth2dbcurd.repository;

import org.springframework.stereotype.Repository;

import com.mtr.springbooth2dbcurd.entity.Department;

import org.springframework.data.repository.CrudRepository;


@Repository
public interface DepartmentRepository
extends CrudRepository<Department, Long> {
}