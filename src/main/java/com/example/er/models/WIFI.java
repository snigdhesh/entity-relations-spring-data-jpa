package com.example.er.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "wifi")
public class WIFI {
  @Id
  @GeneratedValue
  private int id;
  private String name;
  private String category; //public or private
  private String description; //home network or free wifi

  @OneToMany(cascade = CascadeType.ALL,mappedBy = "wifi")
  private List<Device> deviceList=new ArrayList<>();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public List<Device> getDeviceList() {
    return deviceList;
  }

  public void setDeviceList(List<Device> deviceList) {
    this.deviceList = deviceList;
  }

  @Override
  public String toString() {
    return "WIFI{" +
      "id=" + id +
      ", name='" + name + '\'' +
      ", category='" + category + '\'' +
      ", description='" + description + '\'' +
      ", deviceList=" + deviceList +
      '}';
  }
}
