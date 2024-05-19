package com.example.start.Repositories;

import com.example.start.Entities.Offre;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface OffreRepo extends JpaRepository<Offre,Long> {
	  @Query(value = "select * from offre o where o.employee_id = :idemp ", nativeQuery = true)
	    public List<Offre> getoffre(@Param("idemp") Long idemp);
	  @Query(value = "select * from offre o where o.employeur_id = :idempr ", nativeQuery = true)
	   public List<Offre> getoffrecrrerparemployeur(@Param("idempr") Long idempr);
	  @Query(value = "delete from offre o where o.employee_id = :idemp ", nativeQuery = true)
	   public void annuleroffre(@Param("idemp") Long idemp);
}
