package com.example.kaveritietokanta.web;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.kaveritietokanta.domain.Kaveri;
import com.example.kaveritietokanta.domain.KaveriRepository;



@Controller
public class KaveriKontrolleri {
	@Autowired
	private KaveriRepository repository; 

    @RequestMapping(value="/kirjautuminen")
    public String login() {	
        return "kirjautuminen";
    }	

    @RequestMapping(value="/kaverilista")
    public String kaverilista(Model model) {	
        model.addAttribute("kaverit", repository.findAll());
        return "kaverilista";
    }
  
    @RequestMapping(value="/kaverit")
    public @ResponseBody List<Kaveri> kaveriListaRest() {	
        return (List<Kaveri>) repository.findAll();
    }    

    @RequestMapping(value="/kaveri/{id}", method = RequestMethod.GET)
    public @ResponseBody Optional<Kaveri> etsiKaveriRest(@PathVariable("id") Long kaveriId) {	
    	return repository.findById(kaveriId);
    }       
    
    @RequestMapping(value = "/lisaa")
    public String lisaaKaveri(Model model){
    	model.addAttribute("kaveri", new Kaveri());
        return "lisaakaveri";
    }     
    
    @RequestMapping(value = "/talleta", method = RequestMethod.POST)
    public String talleta(Kaveri kaveri){
        repository.save(kaveri);
        return "redirect:kaverilista";
    }    
/*
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    @PreAuthorize("hasAuthority('ADMIN')")
    public String deleteKaveri(@PathVariable("id") Long kaveriId, Model model) {
    	repository.deleteById(kaveriId);
        return "redirect:../kaverilista";
    }     
    */
}
