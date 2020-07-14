 package com.faculty.info.databaseOb;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.faculty.info.model.FacultyDetails;

class FacultyDatabaseObTest {
	private DriverManagerDataSource dataSource;
	private FacultyDatabaseOb dbo;
	
	@BeforeEach
	void setupBeforeEach()
	{
		dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/faculty");
		dataSource.setUsername("root");
		dataSource.setPassword("Qazwsxedc123");
		
		dbo = new FacultydatabaseObImpl(dataSource);
	}
	
	@Test
	void testSave() {
	
	FacultyDetails faculty = new FacultyDetails(102,"JAckie","CHan","9943783344",30,"Male","M.E","EIE","AP-1","2","0","chan.jackie@attention.in","Chan993","password231");
	int result = dbo.save(faculty);
	
    assertTrue(result > 0);
	}

	@Test
	void testUpdate() {
	//	FacultyDetails faculty = new FacultyDetails(299, "9789114178", "Yasar", "Arafath", "M.E", "AP-3", "M", 34, "abdul@mail,com", "G.Ijoe", "password123", "3","4");
		//int result = dbo.update(faculty);
		
		//assertTrue(result > 0);
	}

	@Test
	void testDelete() {
		int id = 778;
		//int result = dbo.delete(id);
		
		//assertTrue(result > 0);
	}

	@Test
	void testGet() {
		int id = 298;
		//FacultyDetails facultydetails = dbo.get(id);
		
		//if(facultydetails != null) {
			//System.out.println(facultydetails);
			
		//}
		
		
		//assertNotNull(facultydetails);
	}

	@Test
	void testList() {
		List<FacultyDetails> listFaculties = dbo.list();
		
		for(FacultyDetails faculty : listFaculties)
		{
			System.out.println(faculty);
		}
		
		assertTrue(listFaculties.isEmpty());
		
	}

}
