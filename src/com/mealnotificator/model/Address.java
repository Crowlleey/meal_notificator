package com.mealnotificator.model;
// Generated Dec 21, 2017 4:42:31 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Address generated by hbm2java
 */
@Entity
@Table(name="address"
    ,catalog="MealManager"
)
public class Address  implements java.io.Serializable {


     private Integer idAddress;
     private City city;
     private String street;
     private Integer number;
     private Set<Instituition> instituitions = new HashSet<Instituition>(0);
     private Set<User> users = new HashSet<User>(0);

    public Address() {
    }

    public Address(City city, String street, Integer number, Set<Instituition> instituitions, Set<User> users) {
       this.city = city;
       this.street = street;
       this.number = number;
       this.instituitions = instituitions;
       this.users = users;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idAddress", unique=true, nullable=false)
    public Integer getIdAddress() {
        return this.idAddress;
    }
    
    public void setIdAddress(Integer idAddress) {
        this.idAddress = idAddress;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idCity")
    public City getCity() {
        return this.city;
    }
    
    public void setCity(City city) {
        this.city = city;
    }

    
    @Column(name="street", length=50)
    public String getStreet() {
        return this.street;
    }
    
    public void setStreet(String street) {
        this.street = street;
    }

    
    @Column(name="number")
    public Integer getNumber() {
        return this.number;
    }
    
    public void setNumber(Integer number) {
        this.number = number;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="address")
    public Set<Instituition> getInstituitions() {
        return this.instituitions;
    }
    
    public void setInstituitions(Set<Instituition> instituitions) {
        this.instituitions = instituitions;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="address")
    public Set<User> getUsers() {
        return this.users;
    }
    
    public void setUsers(Set<User> users) {
        this.users = users;
    }




}


