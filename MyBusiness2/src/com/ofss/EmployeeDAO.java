package com.ofss;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;  
import org.springframework.jdbc.core.RowMapper;

public class EmployeeDAO {  

@Autowired	
DataSource dataSource;  
JdbcTemplate jdbcTemplate;

public JdbcTemplate giveMeJdbcTemplate()
{
	if (jdbcTemplate==null)
		jdbcTemplate=new JdbcTemplate(dataSource);
	return jdbcTemplate;
}
  
public int saveEmployee(Employee e){
	jdbcTemplate=giveMeJdbcTemplate();
    String query="insert into emps values(" +
    		"'"+e.getEmployeeId()+"','"+e.getEmployeeName()+"','"+e.getDepartmentId()+"')";  
    return jdbcTemplate.update(query);  
}  
public int updateEmployee(Employee e){  
    String query="update emps set" +
    "name='"+e.getEmployeeName()+"' where id='"+e.getEmployeeId()+"' ";  
    return jdbcTemplate.update(query);  
}  
public int deleteEmployee(Employee e){  
    String query="delete from emps where id='"+e.getEmployeeId()+"' ";
    return jdbcTemplate.update(query);  
}

public List<Employee> getEmployeeList(){
	jdbcTemplate=giveMeJdbcTemplate();
	 return jdbcTemplate.query("select * from emps",new RowMapper(){  
	    @Override  
	    public Employee mapRow(ResultSet rs, int rownumber) throws SQLException {  
	        Employee e=new Employee();  
	        e.setEmployeeId(rs.getInt(1));  
	        e.setEmployeeName(rs.getString(2));  
	        e.setDepartmentId(rs.getInt(3));  
	        return e;  
	    }  
	    });  
	}
}
