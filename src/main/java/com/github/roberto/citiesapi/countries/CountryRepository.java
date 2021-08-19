package com.github.roberto.citiesapi.countries;

import com.github.roberto.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long>{
}
