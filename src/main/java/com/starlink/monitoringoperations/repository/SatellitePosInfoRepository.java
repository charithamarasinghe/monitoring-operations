package com.starlink.monitoringoperations.repository;

import com.starlink.monitoringoperations.model.SatellitePosInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SatellitePosInfoRepository extends JpaRepository<SatellitePosInfo, Long> {


    @Query(value="SELECT * FROM satellite_pos_info where satellite_id = ?1", nativeQuery = true)
    SatellitePosInfo findBySatelliteId(Integer satelliteId);

    @Query(value="SELECT * FROM satellite_pos_info where satellite_name = ?1", nativeQuery = true)
    SatellitePosInfo findBySatelliteName(Integer satelliteName);
}
