/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innnovacis.mavenproject3.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author innnovacis
 */
@Entity
@Table(name = "archivos")
public class Archivo implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    
    @Column(name = "title")
    private String title;
    
    @Column(name = "image")
    private byte[] image;
    
    @Column(name = "url")
    private String url;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title=title;
    }
 
    
    public byte[] getImage() {
        return image;
    }
    public void setImage(byte[]  image) {
        this.image = image;
    }
    
    public String getUrl() {
        return url;
    }
    public void setUrl(String  url) {
        this.url = url;
    }
    
}