package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.AlienRepo;
import com.example.demo.model.Alien;

@RestController
public class AlienController 
{
	@Autowired
	AlienRepo repo;
	
	@RequestMapping("/")
	public ModelAndView home()
	{
		ModelAndView mv = new ModelAndView("home.jsp");
		Alien alien=new Alien();
		return mv;
	}
	@RequestMapping("/addAlien")
    public Alien addAlien(Alien alien)
    {
		repo.save(alien);
		ModelAndView mv = new ModelAndView("home.jsp");

		return alien;
    }
//	@RequestMapping("/getAlien")
//    public ModelAndView  getAlien(@RequestParam int aid)
//    {
//	    ModelAndView mv = new ModelAndView("showalien.jsp");
//	    Alien alien = repo.findById(aid).orElse(new Alien());
//	    mv.addObject(alien);
//		return mv;
//    }
	@PostMapping("/alien")
	public Alien addAliens(@RequestBody Alien alien)
	{
		repo.save(alien);
		return alien;
	}
	
	@PutMapping("/alien")
	public Alien updateAliens(@RequestBody Alien alien)
	{
		repo.save(alien);
		return alien;
	}
	
	@RequestMapping("/aliens")
	@ResponseBody
    public String getAlien()
    {
		return repo.findAll().toString();
    }
	
	@RequestMapping("/aliens/{aid}")
	@ResponseBody
    public Optional<Alien> getAlien(@PathVariable("aid") int aid)
    {
		return repo.findById(aid);
    }
	
	
	
	@DeleteMapping("/aliens/{aid}")
    public String deleteAlien(@PathVariable int aid)
    {
		Alien a = repo.getOne(aid);
		repo.delete(a);
		
		return "deleted";
    }
	
}
