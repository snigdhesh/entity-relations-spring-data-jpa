package com.example.er.controllers;

import com.example.er.models.Device;
import com.example.er.models.WIFI;
import com.example.er.services.WifiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class WIFIController {

  @Autowired
  private WifiService wifiService;

  @RequestMapping(value = "/wifi", method = RequestMethod.POST)
  public List<WIFI> createWifiProfile(@RequestBody List<WIFI> wifiList) {

    /**
     * Basic logic, later the same logic is applied to an array received in request.
     */
     /*List<WIFI> wifiList=new ArrayList<>();

    //create wifi object.
    WIFI wifi=new WIFI();
    wifi.setName("srimana");
    wifi.setDescription("public network");
    wifi.setCategory("public");

    //create device object.
    Device device=new Device();
    device.setName("iphone");
    device.setStatus("connected");
    device.setType("phone");

    // Set wifi object in device object.
    device.setWifi(wifi);

    //set devices in wifi object.
    //wifi.setDeviceList(Arrays.asList(device));
    wifi.getDeviceList().add(device);

    //System.out.println("wifi obj: "+wifi);

    wifiList.add(wifi);

    wifiList.forEach(x->{
      System.out.println("wifi: "+x);
    });*/

    List<WIFI> wifis=new ArrayList<>();

    wifiList.forEach(wifi->{
      WIFI wifi_obj=new WIFI();
      wifi_obj.setName(wifi.getName());
      wifi_obj.setDescription(wifi.getDescription());
      wifi_obj.setCategory(wifi.getCategory());

      wifi.getDeviceList().forEach(device -> {
        Device device_obj=new Device();
        device_obj.setName(device.getName());
        device_obj.setStatus(device.getStatus());
        device_obj.setType(device.getType());
        device_obj.setWifi(wifi_obj);
        wifi_obj.getDeviceList().add(device_obj);
      });
      wifis.add(wifi_obj);

    });


    return wifiService.save(wifis);
  }

  @RequestMapping(value="/wifi", method=RequestMethod.GET)
  public List<WIFI> getWifiProfiles(){
    return wifiService.getWifiProfiles();
  }
}
