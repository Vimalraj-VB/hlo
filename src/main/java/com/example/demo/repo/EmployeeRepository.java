package com.example.demo.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.EmployeeEntity;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long>{

	
	
//	@Query(value="select * from  angular_crud.employee where name=?1",nativeQuery=true)
	
	@Query(value="select * from  employee where name =?1",nativeQuery = true)
	EmployeeEntity getDataByName(String name);
	
	   @Query(value="select * from employee where name=?1",nativeQuery = true)
       Long getIdByName(String name);
	
	@Query(value="select name from  employee  where name=?1",nativeQuery = true)
    public String getDataByNameString(String name);
	
	  @Query(value="select password from employee  where password=?1",nativeQuery = true)
      public String getPasswordString(String password);

    @Query(value="call employee_seq()",nativeQuery = true)
    public String getId();
  
}
