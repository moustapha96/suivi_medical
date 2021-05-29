package com.ut.sn.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ut.sn.Modeles.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
