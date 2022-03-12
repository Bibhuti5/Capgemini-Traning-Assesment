package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;

import com.example.demo.model.Alien;

public interface AlienRepo extends CrudRepository<Alien,Integer>
{

	Alien getOne(int aid);
   
}
