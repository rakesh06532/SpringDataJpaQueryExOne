package com.ex.repo;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.ex.model.Product1;

import jakarta.transaction.Transactional;

public interface ProductRepository extends JpaRepository<Product1, Integer> {
	
	//@Query("SELECT p FROM com.ex.model.Product1 p WHERE p.proVen=:a or p.proCode=:b")
	//@Query("SELECT p FROM Product1 p WHERE p.proVen=:a or p.proCode=:b")
	//@Query("FROM Product1 WHERE proVen=:a or proCode=:b")
	@Query(value="select * from product1 where pro_Ven=? or pro_Code=?", nativeQuery=true)
	List<Product1> getProduct1Data(String a, String b);
	//List<Product1> getProduct1Data(@Param("a")String a, @Param("b")String b);
	
	//select one column
	@Query("SELECT p.proCode FROM com.ex.model.Product1 p")
	List<String> getAllProCode();
	
	//select all column
	@Query("SELECT p FROM com.ex.model.Product1 p")
	List<Product1> getAllProduct();
	
	//select few columns
	@Query("SELECT p.proCode, p.proName FROM com.ex.model.Product1 p")
	List<Object[]> getAllProCodeAndProName();
	
	@Query("SELECT p.proCode FROM Product1 p WHERE p.proCode like :proCode or p.proName!=:proName")
	List<String> getMyInfo(String proCode, String proName);
	
	@Query("SELECT p.proName, p.proCost FROM Product1 p WHERE p.proCost BETWEEN :v1 AND :v2")
	List<Object[]> getMyInfob(Double v1, Double v2);
	
	@Query("SELECT p FROM Product1 p WHERE p.proCost IN (:input)")
	List<Product1> getMyInfoC(Collection<Double> input);
	
	@Query("SELECT p FROM Product1 p WHERE p.proCost NOT IN (:input)")
	List<Product1> getMyInfoD(Collection<Double> input);
	
	@Modifying  //non select query
	@Transactional  //Commit//rollback
	@Query("DELETE FROM Product1 p WHERE p.proCost>:proCost AND p.proCost IS NOT NULL")
	Integer removeData(Double proCost);
	
	@Modifying  //non select query
	@Transactional  //Commit//rollback
	@Query("UPDATE Product1 p SET p.proCost= :proCost WHERE p.proVen= :proVen")
	Integer modifyingData(Double proCost, String proVen);

}
