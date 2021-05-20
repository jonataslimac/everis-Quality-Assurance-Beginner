package com.github.jonataslimac.ctiesapi.Country.repository;

import com.github.jonataslimac.ctiesapi.Country.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface countryrepository extends JpaRepository<Country,Long>
{
}
