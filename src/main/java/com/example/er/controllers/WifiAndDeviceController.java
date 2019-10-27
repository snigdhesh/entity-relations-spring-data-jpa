package com.example.er.controllers;

import com.example.er.models.WIFI;
import com.example.er.services.WifiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class WifiAndDeviceController {

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public void getAppInfo(HttpServletResponse httpServletResponse) throws IOException {
    httpServletResponse.sendRedirect("/actuator/info");
  }
}
