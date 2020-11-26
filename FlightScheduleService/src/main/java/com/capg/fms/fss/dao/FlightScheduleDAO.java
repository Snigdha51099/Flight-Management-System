package com.capg.fms.fss.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.fms.fss.dto.FlightSchedule;
@Repository
public interface FlightScheduleDAO  extends JpaRepository<FlightSchedule,String>
{

}
