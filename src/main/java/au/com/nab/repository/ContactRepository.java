package au.com.nab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import au.com.nab.model.Contact;
@Repository
public interface ContactRepository extends JpaRepository<Contact,Long>{

}
