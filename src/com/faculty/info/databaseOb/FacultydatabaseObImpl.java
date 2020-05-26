package com.faculty.info.databaseOb;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.activation.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;



import com.faculty.info.model.FacultyDetails;

public class FacultydatabaseObImpl implements FacultyDatabaseOb {
	
	private JdbcTemplate jdbcTemplate;
	  
	public FacultydatabaseObImpl(javax.sql.DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public int save(FacultyDetails faculty) {
		String query = "INSERT INTO facultyDetails (IdNumber , FirstName , LastName , MobileNumber , AGE , Gender , Qualification , Designation , NumberOfConferences , NumberOfPapers , EmailId , Username , Password) Values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		jdbcTemplate.update(query,faculty.getFacultyId(),faculty.getFacultyFirstName(),faculty.getFacultyLastName(),faculty.getMobileNumber(),faculty.getAge(),faculty.getGender(),faculty.getQualification(),faculty.getDesignation(),faculty.getNumberOfConference(),faculty.getNumberOfPapers(),faculty.getMailId(),faculty.getUsername(),faculty.getPassword());
		return 0;
	}

	public int update(FacultyDetails faculty) {
		String query = "UPDATE facultyDetails SET FirstName = ? , LastName = ? , MobileNumber = ? , AGE = ? , Gender = ? , Qualification = ? , Designation = ? , NumberOfConferences = ? , NumberOfPapers = ? , EmailId = ? , Username = ? , Password = ? WHERE IdNumber = ?";
		jdbcTemplate.update(query,faculty.getFacultyFirstName(),faculty.getFacultyLastName(),faculty.getMobileNumber(),faculty.getAge(),faculty.getGender(),faculty.getQualification(),faculty.getDesignation(),faculty.getNumberOfConference(),faculty.getNumberOfPapers(),faculty.getMailId(),faculty.getUsername(),faculty.getPassword(),faculty.getFacultyId());
		return 0;

	}

	public int delete(Integer id) {
		String query = "DELETE FROM FACULTYDETAILS WHERE IdNumber = '" + id +"'";
		return jdbcTemplate.update(query);
		
	}

	public FacultyDetails get(Integer id) {
		String query = "SELECT * FROM FACULTYDETAILS WHERE IdNumber  ='" + id +"'";
		ResultSetExtractor<FacultyDetails> extract = new ResultSetExtractor<FacultyDetails>() {
		

			@Override
			public FacultyDetails extractData(ResultSet rs) throws SQLException, DataAccessException {
				
				if(rs.next()) {
					int id =rs.getInt("IdNumber");
					String mobileNumber =rs.getString("MobileNumber");
					String firstName = rs.getString("FirstName");
					String lastName = rs.getString("lastName");
					String qualification = rs.getString("Qualification");
					String designation = rs.getString("Designation");
					String mailID = rs.getString("EmailId");
					String username = rs.getString("Username");
					String password = rs.getString("Password");
					String gender = rs.getString("Gender");
					String conferences =rs.getString("NumberOfConferences");
					String papers =rs.getString("NumberOfPapers");
					int age = rs.getInt("AGE");
					
					return new FacultyDetails(id , firstName , lastName , mobileNumber ,  age ,gender ,qualification , designation , conferences , papers , mailID , username , password );
									
				}
				return null;
			}
			
		};
		return jdbcTemplate.query(query,extract);
	}

	public List<FacultyDetails> list() {
		String query = "SELECT * FROM FACULTYDETAILS";
		
		RowMapper<FacultyDetails> rowMapper = new RowMapper<FacultyDetails>() {

			@Override
			public FacultyDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
				int id =rs.getInt("IdNumber");
				String mobileNumber =rs.getString("MobileNumber");
				String firstName = rs.getString("FirstName");
				String lastName = rs.getString("lastName");
				String qualification = rs.getString("Qualification");
				String designation = rs.getString("Designation");
				String mailID = rs.getString("EmailId");
				String username = rs.getString("Username");
				String password = rs.getString("Password");
				String gender = rs.getString("Gender");
				String conferences =rs.getString("NumberOfConferences");
				String papers =rs.getString("NumberOfPapers");
				int age = rs.getInt("AGE");
				
				
				return new FacultyDetails(id , firstName , lastName , mobileNumber , age , gender ,qualification , designation , conferences , papers , mailID , username , password );
				
			}
			
		};
		
		return jdbcTemplate.query(query , rowMapper);
		
	}

	
	public List<FacultyDetails> list(String textSearch) {
		String query = "SELECT * FROM FACULTYDETAILS WHERE " +"FirstName LIKE '" + textSearch + "%' OR lastName LIKE '" + textSearch + "%' OR Designation LIKE '"+ textSearch +"%' OR Qualification LIKE '"+ textSearch +"%' ; ";
		
		RowMapper<FacultyDetails> rowMapper = new RowMapper<FacultyDetails>() {

			@Override
			public FacultyDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
				Integer id =rs.getInt("IdNumber");
				String mobileNumber =rs.getString("MobileNumber");
				String firstName = rs.getString("FirstName");
				String lastName = rs.getString("lastName");
				String qualification = rs.getString("Qualification");
				String designation = rs.getString("Designation");
				String mailID = rs.getString("EmailId");
				String username = rs.getString("Username");
				String password = rs.getString("Password");
				String gender = rs.getString("Gender");
				String conferences =rs.getString("NumberOfConferences");
				String papers =rs.getString("NumberOfPapers");
				int age = rs.getInt("AGE");
				
				
				return new FacultyDetails(id , firstName , lastName , mobileNumber , age , gender ,qualification , designation , conferences , papers , mailID , username , password );
				
			}
			
		};
		
		return jdbcTemplate.query(query , rowMapper);
		
	}
	


}
