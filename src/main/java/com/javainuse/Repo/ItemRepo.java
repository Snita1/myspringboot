package com.javainuse.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javainuse.model.Items;

public interface ItemRepo extends JpaRepository<Items, Integer>{

}
