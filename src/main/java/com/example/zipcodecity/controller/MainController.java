package com.example.zipcodecity.controller;


import com.example.zipcodecity.service.SearchCity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {

  SearchCity searchCity = new SearchCity();

  @GetMapping("/")
  public String index() {

    return"index";
  }

  @PostMapping("/createresult")
  public String showResult(@RequestParam("zipcode") int zipcode, RedirectAttributes redirectAttributes) {

    redirectAttributes.addAttribute("zipcode", zipcode);

    return "redirect:/createresult";
  }

  @GetMapping("/createresult")
  public String createResultSite(@RequestParam("zipcode") int zipcode, Model model) {

    model.addAttribute("zipcode", zipcode);
    String city = String.valueOf(searchCity.findCity(zipcode));
    model.addAttribute("city", city);

    return "resultsite";

  }

}
