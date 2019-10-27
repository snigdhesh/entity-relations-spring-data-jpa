package com.example.er.services;

import com.example.er.models.Device;
import com.example.er.models.WIFI;
import com.example.er.repositories.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceService {

  @Autowired
  private DeviceRepository deviceRepository;

  public List<Device> save(List<Device> deviceList) {
    return deviceRepository.saveAll(deviceList);
  }

  public List<Device> getDeviceProfiles() {
    return deviceRepository.findAll();
  }
}
