package com.starlink.monitoringoperations.model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "satellite_info")
public class SatelliteInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "satellite_id")
    private Integer satelliteId;

    @Column(name = "satellite_name")
    private String satelliteName;

    @Column(name = "launched_country")
    private String launchedCountry;

    @CreationTimestamp
    @Column(name = "launched_time", nullable = false, updatable = false)
    private Date launchedTime = new Date();

    @Column(name = "orbited_time")
    private Date orbitedTime;

    @Column(name = "targeted_altitude")
    private Double targetedAltitude;

    @Column(name = "targeted_latitude")
    private Double targetedLatitude;

    @Column(name = "targeted_longitude")
    private Double targetedLongitude;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Type status;

    public Integer getSatelliteId() {
        return satelliteId;
    }

    public void setSatelliteId(Integer satelliteId) {
        this.satelliteId = satelliteId;
    }

    public String getSatelliteName() {
        return satelliteName;
    }

    public void setSatelliteName(String satelliteName) {
        this.satelliteName = satelliteName;
    }

    public String getLaunchedCountry() {
        return launchedCountry;
    }

    public void setLaunchedCountry(String launchedCountry) {
        this.launchedCountry = launchedCountry;
    }

    public Date getLaunchedTime() {
        return launchedTime;
    }

    public void setLaunchedTime(Date launchedTime) {
        this.launchedTime = launchedTime;
    }

    public Date getOrbitedTime() {
        return orbitedTime;
    }

    public void setOrbitedTime(Date orbitedTime) {
        this.orbitedTime = orbitedTime;
    }

    public Double getTargetedAltitude() {
        return targetedAltitude;
    }

    public void setTargetedAltitude(Double targetedAltitude) {
        this.targetedAltitude = targetedAltitude;
    }

    public Double getTargetedLatitude() {
        return targetedLatitude;
    }

    public void setTargetedLatitude(Double targetedLatitude) {
        this.targetedLatitude = targetedLatitude;
    }

    public Double getTargetedLongitude() {
        return targetedLongitude;
    }

    public void setTargetedLongitude(Double targetedLongitude) {
        this.targetedLongitude = targetedLongitude;
    }

    public Type getStatus() {
        return status;
    }

    public void setStatus(Type status) {
        this.status = status;
    }

    public enum Type {
        LAUNCHED, ORBITED, DE_ORBITED, CONSTELLATED, DECOMMISSIONED;
    }
}
