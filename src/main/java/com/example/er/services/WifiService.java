package com.example.er.services;

import com.example.er.models.WIFI;
import com.example.er.repositories.WifiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WifiService {

  @Autowired
  private WifiRepository wifiRepository;

  public List<WIFI> save(List<WIFI> wifiList) {
    return wifiRepository.saveAll(wifiList);
  }

  public List<WIFI> getWifiProfiles() {
    return wifiRepository.findAll();
  }
}
