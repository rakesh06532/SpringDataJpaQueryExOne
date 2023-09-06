package com.ex.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ex.model.Product1;
import com.ex.repo.ProductRepository;

@Component
public class ProductTestRunner implements CommandLineRunner {
	
	@Autowired
	private ProductRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
	/*	repo.save(new Product1(10,"AAA","Botel_1",300.0,"NIT"));
		repo.save(new Product1(11,"BBB","Botel_2",310.0,"NIT"));
		repo.save(new Product1(12,"CCC","Botel_3",320.0,"NIT"));
		repo.save(new Product1(13,"DDD","Botel_4",330.0,"AIT"));
		repo.save(new Product1(14,"EEE","Botel_5",340.0,"AIT"));
		repo.save(new Product1(15,"FFF","Botel_6",350.0,"AIT"));
	*/
		
	//repo.getProduct1Data("NIT", "AAA").forEach(System.out::println);
	//repo.getAllProCode().forEach(System.out::println);
	//repo.getAllProduct().forEach(System.out::println);
	//repo.getAllProCodeAndProName().stream().map(ob->ob[0]+"-"+ob[1]).forEach(System.out::println);
		//repo.getMyInfo("%B%", "NIT").forEach(System.out::println);
		//repo.getMyInfob(310.0, 340.0).stream().map(ob->ob[0]+"-"+ob[1]).forEach(System.out::println);
		//repo.getMyInfoC(Arrays.asList(310.0,320.0,340.0)).forEach(System.out::println);
		//repo.getMyInfoD(Arrays.asList(310.0,320.0,340.0)).forEach(System.out::println);
	//	Integer data=repo.removeData(340.0);
		//System.out.println(data);
		int count=repo.modifyingData(400.0, "NIT");
		System.out.println(count);
	}

}
