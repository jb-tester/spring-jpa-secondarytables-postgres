package com.mytests.spring.bundlesaslibs.springjpasecondarytablespostgres.data;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "people")
@SecondaryTable(name = "details",
                pkJoinColumns = @PrimaryKeyJoinColumn(name = "id"))
public class People {
    @Id @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", length = 30)
    private String name;

    @Column(name = "surname", length = 30)
    private String surname;

    @Column(name = "gender", length = 15)
    private String gender;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    @Column(name = "height", table = "details")
    private Integer height;

    @Column(name = "weight", table = "details")
    private Integer weight;

    @Column(name = "eye_color", length = 15, table = "details")
    private String eyeColor;

    @Column(name = "hair_color", length = 15, table = "details")
    private String hairColor;

    @Column(name = "nationality", length = 15, table = "details")
    private String nationality;

    @Column(name = "occupation", length = 15, table = "details")
    private String occupation;

    @Column(name = "description", length = Integer.MAX_VALUE, table = "details")
    private String description;

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "People{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", surname='" + surname + '\'' +
               ", gender='" + gender + '\'' +
               ", birthDate=" + birthDate +
               ", height=" + height +
               ", weight=" + weight +
               ", eyeColor='" + eyeColor + '\'' +
               ", hairColor='" + hairColor + '\'' +
               ", nationality='" + nationality + '\'' +
               ", occupation='" + occupation + '\'' +
               ", description='" + description + '\'' +
               '}';
    }
}