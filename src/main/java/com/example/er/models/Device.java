package com.example.er.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "device")
public class Device {
  @Id
  @GeneratedValue
  private int id;
  private String name;
  private String type; //phone or computer or tablet
  private String status; //connected or disconnected

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "wifi_id")
  @JsonIgnore
  private WIFI wifi;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public WIFI getWifi() {
    return wifi;
  }

  public void setWifi(WIFI wifi) {
    this.wifi = wifi;
  }

  @Override
  public String toString() {
    return "Device{" +
      "id=" + id +
      ", name='" + name + '\'' +
      ", type='" + type + '\'' +
      ", status='" + status + '\'' +
      ", wifi=" + wifi +
      '}';
  }
}
