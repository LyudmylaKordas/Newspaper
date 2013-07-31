package com.lula.regionnewspaper.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="CATEGORY")
public class Category {

		@Id
	    @Column(name="Id_Category")
	    @GeneratedValue
	    private Integer idCategory;
	     
	    @Column(name="Category")
	    private String category;
	
	    @OneToMany(cascade=CascadeType.ALL)
	    private List<Advertisement> listAdvertisement;

		public List<Advertisement> getListAdvertisement() {
			return listAdvertisement;
		}


		public void setListAdvertisement(List<Advertisement> listAdvertisement) {
			this.listAdvertisement = listAdvertisement;
		}


		public Integer getIdCategory() {
			return idCategory;
		}


		public void setIdCategory(Integer idCategory) {
			this.idCategory = idCategory;
		}


		public String getCategory() {
			return category;
		}


		public void setCategory(String category) {
			this.category = category;
		}


}
