package com.example.zipcodecity.service;

public class City {

  private int zipCode;
  private String city;

  public int getZipCode() {
    return zipCode;
  }

  public String getCity() {
    return city;
  }

  public City(int zipCode, String city) {
    this.zipCode = zipCode;
    this.city = city;
  }

  public City() {
  }

  @Override
  public String toString() {

    return "City: " + city + ". Zipcode: "+ zipCode;

  }
}
