package org.project.springawsrds.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ImageController {
  @GetMapping("/main")
  public String hello() {
    return "index.html";
  }
}
