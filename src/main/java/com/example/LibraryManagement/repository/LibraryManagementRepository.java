package com.example.LibraryManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.LibraryManagement.dto.LibraryManagementDto;

public interface LibraryManagementRepository extends JpaRepository<LibraryManagementDto, Integer>{

}
