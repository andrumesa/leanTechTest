package com.leantech.staffapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leantech.staffapp.model.Position;
import com.leantech.staffapp.repository.PositionRepository;

@RestController
public class PositionController {
	
	 @Autowired
	 private PositionRepository positionRepository;
	 
	 @GetMapping("/position")
	 public ResponseEntity<List<Position>> getPosition()
	 {
		 
		 List<Position> positions= new ArrayList<Position>();
		 try {
			    positionRepository.findAll().forEach(positions::add);
	
				if (positions.isEmpty()) {
					return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			    }
				
			} catch (Exception e) {
				return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		 return new ResponseEntity<>(positions, HttpStatus.OK);
	 }
	 
	 @GetMapping("/allPositions")
	 public ResponseEntity<List<Position>> getAllPosition()
	 {
		 
		 List<Position> positions= new ArrayList<Position>();
		 try {
			    positionRepository.findAll().forEach(positions::add);
	
				if (positions.isEmpty()) {
					return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			    }
				
			} catch (Exception e) {
				return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		 return new ResponseEntity<>(positions, HttpStatus.OK);
	 }

}
