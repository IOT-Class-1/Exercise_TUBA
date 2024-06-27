package com.example.HR.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity //bu anotasyon ,bu sınıfın bir veritabanı tablosuna karşılık geldiğini belirtir
public class Employee {


    @Id //bu "id "alanının birincil anahtar oldugunu belirtir
    @GeneratedValue(strategy= GenerationType.IDENTITY)//bu "id"alanının otomatik olarak arttıralacagını belirtir
    private Long id;//çalışanın belirsiz kimliği
    //veri tabanını kullandıgımızda @kullanıyoruz


    private String name;
    private String position;

    //getter &setter


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
