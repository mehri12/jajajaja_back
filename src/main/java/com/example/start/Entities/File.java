package com.example.start.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class File {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idfile;
    private String titlefile;
    private String typefile;
    @Column(length = 920000)
    private byte[] taillefile;
    private String nomfichier;
    @JsonIgnore
    @ManyToOne
    private Employee emp;
 
    
    public File(String titlefile, String typefile, byte[] taillefile) {
        this.titlefile = titlefile;
        this.typefile = typefile;
        this.taillefile = taillefile;
    }
}
