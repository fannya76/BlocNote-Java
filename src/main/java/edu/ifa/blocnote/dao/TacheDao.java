package edu.ifa.blocnote.dao;

import edu.ifa.blocnote.model.Tache;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TacheDao extends JpaRepository<Tache, Integer> {
}
