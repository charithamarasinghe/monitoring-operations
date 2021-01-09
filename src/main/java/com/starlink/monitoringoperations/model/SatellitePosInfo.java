package com.starlink.monitoringoperations.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "satellite_pos_info")
public class SatellitePosInfo {
    @Id
    private Integer satelliteId;

    @Column(name = "current_altitude")
    private Double currentAltitude;

    @Column(name = "current_latitude")
    private Double currentLatitude;

    @Column(name = "current_longitude")
    private Double currentLongitude;

    @Column(name = "current_speed")
    private Double currentSpeed;

    @Column(name = "info_receiver_id")
    private String infoReceiverId;

    @UpdateTimestamp
    @Column(name = "last_updated_time", nullable = false, updatable = false)
    private Date lastUpdatedTime;

    public Integer getSatelliteId() {
        return satelliteId;
    }

    public void setSatelliteId(Integer satelliteId) {
        this.satelliteId = satelliteId;
    }

    public Double getCurrentAltitude() {
        return currentAltitude;
    }

    public void setCurrentAltitude(Double currentAltitude) {
        this.currentAltitude = currentAltitude;
    }

    public Double getCurrentLatitude() {
        return currentLatitude;
    }

    public void setCurrentLatitude(Double currentLatitude) {
        this.currentLatitude = currentLatitude;
    }

    public Double getCurrentLongitude() {
        return currentLongitude;
    }

    public void setCurrentLongitude(Double currentLongitude) {
        this.currentLongitude = currentLongitude;
    }

    public Double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(Double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public String getInfoReceiverId() {
        return infoReceiverId;
    }

    public void setInfoReceiverId(String infoReceiverId) {
        this.infoReceiverId = infoReceiverId;
    }

    public Date getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    public void setLastUpdatedTime(Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }
}
