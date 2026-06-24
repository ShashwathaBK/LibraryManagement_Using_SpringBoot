package com.example.LibraryManagement.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.LibraryManagement.dto.LibraryManagementDto;
import com.example.LibraryManagement.service.LibraryManagementService;

//@CrossOrigin("*")
@RestController
@RequestMapping("/libraries")
public class LibraryManagementController {

	@Autowired
	LibraryManagementService libraryManagementService;
	
	@PostMapping
	public String insertData(@RequestBody LibraryManagementDto libraryManagementDto) {
		System.out.println(libraryManagementDto);
		return libraryManagementService.insertData(libraryManagementDto);
	}
	@GetMapping
	public Object fetchById(@RequestParam int id) {
//		int id=libraryManagementDto.getBookId();
//		  System.out.println("Controller Id = " + id);
		return libraryManagementService.fetchById(id);
	}
	@GetMapping("/All")
	public List<LibraryManagementDto> fetchAll(){
		return libraryManagementService.fetchAll();
	}
	
	@DeleteMapping("/{id}")
	public String deleteById(@PathVariable int id) {
//		int id=libraryManagementDto.getBookId();
		return libraryManagementService.deleteById(id);
	}
	@DeleteMapping("/deleteAll")
	public String deleteAll() {
		return libraryManagementService.deleteAll();
	}
}
