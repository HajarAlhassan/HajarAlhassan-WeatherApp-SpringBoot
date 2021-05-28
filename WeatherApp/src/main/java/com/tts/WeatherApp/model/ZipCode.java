package com.tts.WeatherApp.model;

import javax.persistence.*;


@Entity

public class ZipCode {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }



    @Column(unique=true)
    private String zipCode;

    public String getZipCode() {
        return zipCode;
    }

    public ZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public ZipCode() {
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
