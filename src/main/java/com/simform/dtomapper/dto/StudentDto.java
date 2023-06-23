package com.simform.dtomapper.dto;

public class StudentDto {

  String dtoName;
  String dtoStack;

  public StudentDto() {
  }

  public StudentDto(String dtoName, String dtoStack) {
    this.dtoName = dtoName;
    this.dtoStack = dtoStack;
  }

  public String getDtoName() {
    return dtoName;
  }

  public void setDtoName(String dtoName) {
    this.dtoName = dtoName;
  }

  public String getDtoStack() {
    return dtoStack;
  }

  public void setDtoStack(String dtoStack) {
    this.dtoStack = dtoStack;
  }
}
