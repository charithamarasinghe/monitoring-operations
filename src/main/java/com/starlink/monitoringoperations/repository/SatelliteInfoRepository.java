package com.starlink.monitoringoperations.repository;

import com.starlink.monitoringoperations.model.SatelliteInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SatelliteInfoRepository extends JpaRepository<SatelliteInfo, Long> {


    @Query(value="SELECT * FROM satellite_info where satellite_id = ?1", nativeQuery = true)
    SatelliteInfo findBySatelliteId(Integer satelliteId);

    @Query(value="SELECT * FROM satellite_info where satellite_name = ?1", nativeQuery = true)
    List<SatelliteInfo> findBySatelliteName(String satelliteName);

    @Query(value="DELETE FROM satellite_info where satellite_id = ?1", nativeQuery = true)
    void deleteBySatelliteId(Integer satelliteId);

}
