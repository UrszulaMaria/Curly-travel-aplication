package com.example.curly1.repository;

import com.example.curly1.model.OpinionModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OpinionRepository extends JpaRepository<OpinionModel,Long> {
}
