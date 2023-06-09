package com.dscatalog.dscatalog.entities;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_company")
public class Company implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	@Column(columnDefinition = "TEXT")
	private String description;
	private LocalTime openingTime;
	private LocalTime closingTime;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "tb_company_role",
		joinColumns = @JoinColumn(name = "company_id"),
		inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles = new HashSet<>();
	
	@ManyToMany
    @JoinTable(name="tb_company_product",
        joinColumns = @JoinColumn(name="company_id"),
        inverseJoinColumns = @JoinColumn(name="product_id"))
    private Set<Product> products = new HashSet<>();
	
	public Company() {
		
	}

	public Company(Long id, String name, String description, LocalTime openingTime, LocalTime closingTime) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.openingTime = openingTime;
		this.closingTime = closingTime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalTime getOpeningTime() {
		return openingTime;
	}

	public void setOpeningTime(LocalTime openingTime) {
		this.openingTime = openingTime;
	}

	public LocalTime getClosingTime() {
		return closingTime;
	}

	public void setClosingTime(LocalTime closingTime) {
		this.closingTime = closingTime;
	}

	public Set<Role> getRoles() {
		return roles;
	}
	
	public Set<Product> getProducts() {
		return products;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Company other = (Company) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	

}
