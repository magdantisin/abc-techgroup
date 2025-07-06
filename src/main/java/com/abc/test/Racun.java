
package com.abc.test;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Racun {
	@Id
	@Column(name = "racun_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer racunId;

	@Column(name = "iban", length = 20)
    private String iban;

    @Column(name = "tip_racuna")
    private Integer tipRacuna;

    @Column(name = "valuta", length = 3)
    private String valuta;

    @Column(name = "klijent_id")
    private Integer klijentId;

    @Column(name = "datum_otvaranja")
    private LocalDate datumOtvaranja;

    @Column(name = "datum_zatvaranja")
    private LocalDate datumZatvaranja;
    
    public Racun(){}

    public Racun(String iban, Integer tipRacuna, String valuta, Integer klijentId, LocalDate datumOtvaranja, LocalDate datumZatvaranja) {
		this.iban = iban;
		this.tipRacuna = tipRacuna;
		this.valuta = valuta;
		this.klijentId = klijentId;
		this.datumOtvaranja = datumOtvaranja;
		this.datumZatvaranja = datumZatvaranja;
	}
    
    public Integer getRacunId() {
        return racunId;
    }

    public void setRacunId(Integer racunId) {
        this.racunId = racunId;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public Integer getTipRacuna() {
        return tipRacuna;
    }

    public void setTipRacuna(Integer tipRacuna) {
        this.tipRacuna = tipRacuna;
    }

    public String getValuta() {
        return valuta;
    }

    public void setValuta(String valuta) {
        this.valuta = valuta;
    }

    public Integer getKlijentId() {
        return klijentId;
    }

    public void setKlijentId(Integer klijentId) {
        this.klijentId = klijentId;
    }

    public LocalDate getDatumOtvaranja() {
        return datumOtvaranja;
    }

    public void setDatumOtvaranja(LocalDate datumOtvaranja) {
        this.datumOtvaranja = datumOtvaranja;
    }

    public LocalDate getDatumZatvaranja() {
        return datumZatvaranja;
    }

    public void setDatumZatvaranja(LocalDate datumZatvaranja) {
        this.datumZatvaranja = datumZatvaranja;
    }
}
