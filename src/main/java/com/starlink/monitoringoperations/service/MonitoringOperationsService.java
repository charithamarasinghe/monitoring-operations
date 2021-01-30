package com.starlink.monitoringoperations.service;

import com.starlink.monitoringoperations.model.SatelliteInfo;
import com.starlink.monitoringoperations.model.SatellitePosInfo;
import com.starlink.monitoringoperations.repository.SatelliteInfoRepository;
import com.starlink.monitoringoperations.repository.SatellitePosInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MonitoringOperationsService {

    @Autowired
    SatellitePosInfoRepository satellitePosInfoRepository;

    @Autowired
    SatelliteInfoRepository satelliteInfoRepository;

    public Iterable<SatellitePosInfo> getAllSatPosInfo() {
        return satellitePosInfoRepository.findAll();
    }

    public Iterable<SatelliteInfo> getAllSatInfo() {
        return satelliteInfoRepository.findAll();
    }


    public SatellitePosInfo findSatPosInfoBySatId(Integer satId) {
        return satellitePosInfoRepository.findBySatelliteId(satId);
    }

    public SatelliteInfo findSatInfoBySatId(Integer satId) {
        return satelliteInfoRepository.findBySatelliteId(satId);
    }

    public void addPosInfo(SatellitePosInfo satellitePosInfo) {
        // need to add sat id validation

        satellitePosInfoRepository.save(satellitePosInfo);
    }

    public void addSatellite(SatelliteInfo satelliteInfo) {
        satelliteInfoRepository.save(satelliteInfo);
    }

    public void deleteSatellite(Integer satId) {
        satelliteInfoRepository.deleteBySatelliteId(satId);
    }

}
