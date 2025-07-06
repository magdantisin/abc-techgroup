
package com.abc.test;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface RacunRepository extends JpaRepository<Racun, Integer> {
    @Query("SELECT r FROM Racun r WHERE :datum >= r.datumOtvaranja AND (:datum <= r.datumZatvaranja OR r.datumZatvaranja IS NULL)")
    List<Racun> findByDatum(LocalDate datum);
}
