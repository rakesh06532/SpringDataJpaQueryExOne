package com.ex.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Product1 {
	
	@Id
	private Integer proId;
	private String proCode;
	private String proName;
	private Double proCost;
	private String proVen;

}
