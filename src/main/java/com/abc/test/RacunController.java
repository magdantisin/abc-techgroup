
package com.abc.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/racuni")
public class RacunController {

    @Autowired
    private RacunRepository repo;

    @GetMapping
    public List<Racun> getByDate(@RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate datum) {
    	if (datum == null) {
    		datum = LocalDate.now();
        }
    	return repo.findByDatum(datum);
    }

    @PostMapping
    public Racun add(@RequestBody @Valid Racun racun) {
        return repo.save(racun);
    }

    @PutMapping("/{id}")
    public Racun update(@PathVariable Integer id, @RequestBody @Valid Racun racun) {
        racun.setRacunId(id);
        return repo.save(racun);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        repo.deleteById(id);
    }
}
