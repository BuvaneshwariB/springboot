package com.example.springboot;
public class Person {

 private int id;
 private String name;
 private String email;

 public Person() {

 }

 public String getId() {
  return id;
 }

 public void setId(int id) {
  this.id= id;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public String getEmail() {
  return email;
 }

 public void setEmail(String email) {
  this.email = email;
 }

}
