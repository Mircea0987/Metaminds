package eu.ase.deic.ro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import eu.ase.deic.ro.models.Apartamente;

@Repository
public interface ApartamenteRepository extends JpaRepository<Apartamente, Long> {

}
