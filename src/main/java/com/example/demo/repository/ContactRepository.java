package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.ContactEntity;

public interface ContactRepository extends JpaRepository<ContactEntity, Long> {

}
