package com.capg.fms.as.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.fms.as.dao.AirportDAO;
import com.capg.fms.as.dto.Airport;


@Service
public class AirportService
{
@Autowired
private AirportDAO airportdao;
public void setAirportdao(AirportDAO airportdao) { this.airportdao=airportdao;}

//view airport by Id
@Transactional(readOnly=true)
public Optional<Airport> getAirport(String airportId)
{
return airportdao.findById(airportId);
}

//view airport list
@Transactional(readOnly=true)
public List<Airport> getAirports()
{
return airportdao.findAll();
}

//add airport
@Transactional
public Airport addAirport(Airport airport)
{
return airportdao.save(airport);
}

//update airport by Id
@Transactional
public void updateAirport(Airport airport)
{
Airport a = airportdao.findById(airport.getAirportId()).get();
a.setAirportName(airport.getAirportName());
a.setArea(airport.getArea());
}

//delete airport by Id
@Transactional
public void deleteAirport(String airportId)
{
airportdao.deleteById(airportId);
}
}
