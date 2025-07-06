# 💼 Web aplikacija za pregled i upravljanje računima

Ova Spring Boot aplikacija omogućuje pregled, dodavanje, izmjenu i brisanje računa iz baze podataka putem web preglednika.

## ✅ Funkcionalnosti

- 📅 Tablični pregled računa na osnovu unesenog datuma (default: današnji dan).
- ➕ Dodavanje novih računa.
- ✏️ Ažuriranje postojećih računa.
- ❌ Brisanje računa.
- ✅ Validacija podataka:
  - Provjera IBAN-a: prva dva znaka moraju biti slova, ostatak brojevi.
  - Ostala osnovna kontrola tipa podataka.
- 📦 Podaci se čuvaju u H2 memorijskoj bazi.
- 🌐 Jednostavno web sučelje (index.html).

## 🛠️ Tehnologije

- Java 17  
- Spring Boot 3.5.3  
- Spring Web  
- Spring Data JPA  
- H2 baza podataka  
- Jakarta Validation  
- Maven  

## ▶️ Pokretanje aplikacije
### 1. Kloniraj repozitorij
### 2. Uđi u projektni direktorij
### 3. Build aplikacije
	./mvnw clean install
### 4. Pokreni aplikaciju
	./mvnw spring-boot:run
### 5. Otvori aplikaciju u pregledniku
	http://localhost:8081
