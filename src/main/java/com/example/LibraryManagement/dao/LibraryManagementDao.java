package com.example.LibraryManagement.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.LibraryManagement.dto.LibraryManagementDto;
import com.example.LibraryManagement.repository.LibraryManagementRepository;

@Repository
public class LibraryManagementDao {

	@Autowired
	LibraryManagementRepository libraryManagementRepository;
	
	public String insertData(LibraryManagementDto libraryManagementDto) {
		libraryManagementRepository.save(libraryManagementDto);
		return "data inserted";
	}


public Optional<LibraryManagementDto> fetchById(int id) {
	Optional<LibraryManagementDto> oe=libraryManagementRepository.findById(id);
	return  oe;
 
}
public List<LibraryManagementDto> fetchAll(){
	return libraryManagementRepository.findAll();
}
public String inserAllData(List<LibraryManagementDto> libraryManagementDto) {
		libraryManagementRepository.saveAll(emp);
		return "Inser All Data";
	}
//public String deleteById(int id) {
//	 libraryManagementRepository.deleteById(id);
//	 return "data deleted";
//}
//
//public String deleteAll() {
//	libraryManagementRepository.deleteAll();
//	return "All data deleted";
//}
}
