package com.leantech.staffapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.leantech.staffapp.model.Position;

@Repository
public interface PositionRepository extends JpaRepository<Position,Integer> ,JpaSpecificationExecutor<Position>
{

}
