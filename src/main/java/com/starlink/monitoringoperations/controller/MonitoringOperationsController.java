package com.starlink.monitoringoperations.controller;

import com.starlink.monitoringoperations.model.SatelliteInfo;
import com.starlink.monitoringoperations.model.SatellitePosInfo;
import com.starlink.monitoringoperations.service.MonitoringOperationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/MO")
public class MonitoringOperationsController {

    @Autowired
    MonitoringOperationsService monitoringOperationsService;

    @GetMapping("/healthCheck")
    public String healthCheck() {
        return "BLUE-SUCCESS";
    }

    @GetMapping("/testDeploy")
    public String testDeploy() {
        return "TEST SUCCESS";
    }

    @GetMapping("/getAllSatPosInfo")
    public Iterable<SatellitePosInfo> getAllConstellationSatInfo() {
        return monitoringOperationsService.getAllSatPosInfo();
    }

    @GetMapping("/getAllSatInfo")
    public Iterable<SatelliteInfo> getAllSatInfo() {
        return monitoringOperationsService.getAllSatInfo();
    }

    @GetMapping("/getSatPosInfoBySatId")
    public SatellitePosInfo getSatPosInfoBySatId(@RequestBody Integer satId) {
        return monitoringOperationsService.findSatPosInfoBySatId(satId);
    }

    @GetMapping("/getSatInfoBySatId")
    public SatelliteInfo getConInfoByConId(@RequestBody Integer satId) {
        return monitoringOperationsService.findSatInfoBySatId(satId);
    }

    @PutMapping("/addPosInfo")
    public SatellitePosInfo addPosInfo(@RequestBody SatellitePosInfo satellitePosInfo) {
        monitoringOperationsService.addPosInfo(satellitePosInfo);
        return satellitePosInfo;
    }

    @PutMapping("/addSatellite")
    public SatelliteInfo addConstellation(@RequestBody SatelliteInfo satelliteInfo) {
        monitoringOperationsService.addSatellite(satelliteInfo);
        return satelliteInfo;
    }

    @GetMapping("/deleteSatBySatId")
    public String deleteSatellite(@RequestBody Integer satId) {
        monitoringOperationsService.deleteSatellite(satId);
        return "DELETE SUCCESS";
    }

}
