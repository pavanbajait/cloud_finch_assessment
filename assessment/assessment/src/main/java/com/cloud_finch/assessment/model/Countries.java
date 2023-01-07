package com.cloud_finch.assessment.model;

import java.util.List;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Countries implements Comparable<Countries> {

	String name;
    String capital;
    List<String> altSpellings;
    String relevance;
    String region;
    String subregion;
    Translations translations;
    int population;
    List<Integer> latlng;
    String demonym;
    Long area;
    double gini;
    List<String> timezones;
    List<String> callingCodes;
    List<String> topLevelDomain;
    String alpha2Code;
    String alpha3Code;
    List<String> currencies;
    List<String> languages;
    
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Countries other = (Countries) obj;
		return Objects.equals(area, other.area) && Objects.equals(name, other.name);
	}
	@Override
	public int hashCode() {
		return Objects.hash(area, name);
	}
    
	@Override
	public int compareTo(Countries o)
	{
	    return this.hashCode() - o.hashCode();
	}
	

    
	
}
