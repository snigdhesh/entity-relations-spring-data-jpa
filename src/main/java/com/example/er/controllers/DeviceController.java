package com.example.er.controllers;

import com.example.er.models.Device;
import com.example.er.models.WIFI;
import com.example.er.services.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeviceController {

  @Autowired
  private DeviceService deviceService;

  @RequestMapping(value = "/device", method = RequestMethod.POST)
  public List<Device> createDeviceProfile(@RequestBody List<Device> deviceList) {
    return deviceService.save(deviceList);
  }

  @RequestMapping(value = "/device", method = RequestMethod.GET)
  public List<Device> getDeviceProfiles() {
    return deviceService.getDeviceProfiles();
  }
}
