package com.example.LibraryManagement.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.LibraryManagement.dao.LibraryManagementDao;
import com.example.LibraryManagement.dto.LibraryManagementDto;
import com.example.LibraryManagement.repository.LibraryManagementRepository;

@Service
public class LibraryManagementService {

	@Autowired
	LibraryManagementDao libraryManagementDao;
	
	@Autowired
	LibraryManagementRepository libraryManagementRepository;
	
	public String insertData(LibraryManagementDto libraryManagementDto) {
		return libraryManagementDao.insertData(libraryManagementDto);
	}
	
	public Object fetchById(int id) {
		Optional<LibraryManagementDto> oe=libraryManagementDao.fetchById(id);
		if(oe.isPresent()) {
			return oe.get();
		}else
			return "Data not found";
	}
	public List<LibraryManagementDto> fetchAll(){
		return libraryManagementDao.fetchAll();
	}
	
	public String deleteById(int id) {
		Optional<LibraryManagementDto> oe=libraryManagementDao.fetchById(id);
		if(oe.isPresent()) {
			libraryManagementRepository.deleteById(id);
			return "data deleted";
		}else 
			return "Data not found";
	}
	
	public String deleteAll() {
		List<LibraryManagementDto>l=libraryManagementDao.fetchAll();
		if(l.isEmpty()) {
			return " Data Not foun";
		}
		else return "data deleted ";
	}
}
