package com.project.blog_app_apis.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="categories")
@NoArgsConstructor
@Setter
@Getter
public class Category {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer categoryId;
	
	@Column(name="title", length=100, nullable=false)
	private String categoryTitle;
	
	@Column(name="description")
	private String categoryDescription;
	
	//1(ek) category me multiple posts ho sakte hai
	@OneToMany(mappedBy = "category", cascade = CascadeType.ALL, fetch = FetchType.LAZY) //agar hum parent ko hata de toh uske childs bhi hatt jayenge, or agar parent ko add kar rhe ho to child ko alag save na karna pade, or isme CRUD sab honge, jo prent ke sath hoga wo automatically childs ke saath bhi ho jayega
	private List<Post> posts = new ArrayList<>();

}
