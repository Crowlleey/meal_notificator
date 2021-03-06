package com.mealnotificator.model;
// Generated Dec 21, 2017 4:42:31 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name="user"
    ,catalog="MealManager"
)
public class User  implements java.io.Serializable {


     private Integer idUser;
     private Address address;
     private Instituition instituition;
     private String name;
     private String email;

    public User() {
    }

    public User(Address address, Instituition instituition, String name, String email) {
       this.address = address;
       this.instituition = instituition;
       this.name = name;
       this.email = email;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idUser", unique=true, nullable=false)
    public Integer getIdUser() {
        return this.idUser;
    }
    
    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idAddress")
    public Address getAddress() {
        return this.address;
    }
    
    public void setAddress(Address address) {
        this.address = address;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idInstituition")
    public Instituition getInstituition() {
        return this.instituition;
    }
    
    public void setInstituition(Instituition instituition) {
        this.instituition = instituition;
    }

    
    @Column(name="name", length=50)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="email", length=75)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }




}


