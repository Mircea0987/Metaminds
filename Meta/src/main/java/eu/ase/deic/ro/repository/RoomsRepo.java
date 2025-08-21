package eu.ase.deic.ro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import eu.ase.deic.ro.models.Rooms;

@Repository
public interface RoomsRepo extends JpaRepository<Rooms, Long> {

}
