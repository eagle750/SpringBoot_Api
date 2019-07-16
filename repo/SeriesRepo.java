package com.example.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Series;

@Repository
public interface SeriesRepo extends JpaRepository<Series, Integer>{
	public List<Series> findAll();

	public Series findFirstByOrderByIdDesc();
}
