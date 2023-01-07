package com.cloud_finch.assessment.controller;

import java.util.List;

import com.cloud_finch.assessment.model.Countries;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class CountryWrapper {
	
	List<Countries> countries;

}
