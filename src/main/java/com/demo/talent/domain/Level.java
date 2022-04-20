package com.demo.talent.domain;

public enum Level {
  고수(3)
  ,  중수(2)
  ,  하수(1);

  private final int grade;

  private Level(int grade){
    this. grade = grade;
  }

  public int getGrade(){
    return grade;
  }

}
