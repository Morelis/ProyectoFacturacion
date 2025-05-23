package com.sisfacturation.demo.invoice.models;

import java.io.Serializable;
import java.sql.Date;

import com.sisfacturation.demo.customer.models.Customer;
import com.sisfacturation.demo.users.models.Users;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Invoice implements Serializable {
 
@Id 
@GeneratedValue (strategy = GenerationType.IDENTITY)
 private Long id;

@ManyToOne
@JoinColumn(name = "customer_id" , nullable = false)
 private Customer customer;

@ManyToOne
@JoinColumn(name = "user_id", nullable = false)
private Users users;


 private Date created;
 private String description;
 public Long getId() {
    return id;
 }

 
 public Invoice(Long id, Customer customer, Users users, Date created, String description) {
    this.id = id;
    this.customer = customer;
    this.users = users;
    this.created = created;
    this.description = description;
}


 public void setId(Long id) {
    this.id = id;
 }
 public Customer getCustomer() {
    return customer;
 }
 public void setCustomer(Customer customer) {
    this.customer = customer;
 }
 public Users getUsers() {
    return users;
 }
 public void setUsers(Users users) {
    this.users = users;
 }
 public Date getCreated() {
    return created;
 }
 public void setCreated(Date created) {
    this.created = created;
 }
 public String getDescription() {
    return description;
 }
 public void setDescription(String description) {
    this.description = description;
 }


}
