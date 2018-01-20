package com.example.simple.recommendation.spring.entity;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "IMPROVEMENT")
public class Improvement {
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private long id;	
}
