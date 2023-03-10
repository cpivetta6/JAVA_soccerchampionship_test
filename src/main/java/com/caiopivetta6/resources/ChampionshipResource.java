package com.caiopivetta6.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.caiopivetta6.domain.Championship;
import com.caiopivetta6.services.ChampionshipService;

@RestController
@RequestMapping(value = "championship")
public class ChampionshipResource {

	@Autowired
	private ChampionshipService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Championship> findById (@PathVariable Integer id){
		
		Championship obj = service.find(id);
		
		return ResponseEntity.ok().body(obj);
		
	}
	
	
}
