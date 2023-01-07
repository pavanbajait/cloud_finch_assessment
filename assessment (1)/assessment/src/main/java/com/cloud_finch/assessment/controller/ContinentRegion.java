package com.cloud_finch.assessment.controller;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloud_finch.assessment.model.Countries;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class ContinentRegion {
	
	@GetMapping("/v1/find_top5_countries")
	public void findCountries(@RequestBody List<Countries> list) {
		Map<String, TreeSet<Countries>> treeMap = new TreeMap<String, TreeSet<Countries>>();
		for(Countries country : list ) {
			
			if(treeMap.containsKey(country.getRegion())) {
				TreeSet<Countries> treeset = treeMap.get(country.getRegion());
				treeset.add(country);
				treeMap.put(country.getRegion(),treeset);
			}
			else {
				TreeSet<Countries> treeset = new TreeSet<Countries>();
				treeset.add(country);
				treeMap.put(country.getRegion(),treeset);
			}
		}
		System.out.println(treeMap.toString());
	}
   
}
