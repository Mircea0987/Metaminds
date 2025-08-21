package eu.ase.deic.ro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import eu.ase.deic.ro.models.Inchirieri;

@Repository
public interface InchirieriRepo extends JpaRepository<Inchirieri, Long> {

}
