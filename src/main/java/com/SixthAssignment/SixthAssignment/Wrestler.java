package com.SixthAssignment.SixthAssignment;

public class Wrestler {
    private String name;
    private String birthday;
    private String height;
    private String weight;
    private String bloodType;
    private String birthPlace;
    private String admissionTheme;
    private String signatureMove;

    public Wrestler(String name, String birthday, String height, String weight, String bloodType, String birthPlace, String admissionTheme, String signatureMove) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
        this.bloodType = bloodType;
        this.birthPlace = birthPlace;
        this.admissionTheme = admissionTheme;
        this.signatureMove = signatureMove;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getAdmissionTheme() {
        return admissionTheme;
    }

    public void setAdmissionTheme(String admissionTheme) {
        this.admissionTheme = admissionTheme;
    }

    public String getSignatureMove() {
        return signatureMove;
    }

    public void setSignatureMove(String signatureMove) {
        this.signatureMove = signatureMove;
    }
}
