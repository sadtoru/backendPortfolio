package com.daiana.backendportfolio.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(unique = true)
	private String name;
	@ManyToMany(mappedBy = "roles")
	private List<Person> personList = new ArrayList<>();

	public Role() {
	}

	public Role(String name) {
		this.name = name;
	}
}
