package eu.ase.deic.ro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import eu.ase.deic.ro.models.TipCamera;

@Repository
public interface TipCameraRepo extends JpaRepository<TipCamera, Long> {

}
