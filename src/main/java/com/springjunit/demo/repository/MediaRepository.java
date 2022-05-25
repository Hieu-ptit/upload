package com.springjunit.demo.repository;

import com.springjunit.demo.model.entity.Media;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MediaRepository extends JpaRepository<Media, Integer> ,InsertUpdateRepository<Media>{

}
