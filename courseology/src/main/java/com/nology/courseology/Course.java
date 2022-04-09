package com.nology.courseology;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String name;
  private String location;
  private String price;
  private String duration;
  private String summary;
  private String imgSrc;

  public Course(
      String name, String location, String price, String duration, String summary, String imgSrc) {
    this.name = name;
    this.location = location;
    this.price = price;
    this.duration = duration;
    this.summary = summary;
    this.imgSrc = imgSrc;
  }

  public Course() {}

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getLocation() {
    return location;
  }

  public String getPrice() {
    return price;
  }

  public String getDuration() {
    return duration;
  }

  public String getSummary() {
    return summary;
  }

  public String getImgSrc() {
    return imgSrc;
  }
}
