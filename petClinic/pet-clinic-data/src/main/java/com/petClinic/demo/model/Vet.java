package com.petClinic.demo.model;

import java.util.HashSet;
import java.util.Set;

public class Vet extends Person {

	Set <Speciality> spec = new HashSet<>();

	public Vet() {

	}

	public Vet(Set<Speciality> spec) {
		this.spec = spec;
	}

	public Set<Speciality> getSpec() {
		return spec;
	}

	public void setSpec(Set<Speciality> spec) {
		this.spec = spec;
	}

	
	
	
	
	
}
