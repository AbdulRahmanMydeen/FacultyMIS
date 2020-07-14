package com.faculty.info.databaseOb;

import java.util.List;

import com.faculty.info.model.FacultyDetails;
import com.faculty.info.model.Login;

public interface FacultyDatabaseOb {
	public int save(FacultyDetails faculty);
	public int update(FacultyDetails faculty);
	public int delete(Integer id);
	public FacultyDetails get(Integer id);
	public FacultyDetails validateUser(Login login);
	public List<FacultyDetails> list();
	public List<FacultyDetails> list(String searchText);
	
}
