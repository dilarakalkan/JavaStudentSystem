package com.example.studentsystem.dto;

public class CompanyDTO {
    private Long id;
    private String companyName;
    private String sector;
    private String location;

//Bu constructor, CompanyDTO sınıfı için, doğrudan tüm alanları alarak bir nesne oluşturmanı sağlar.
    public CompanyDTO(Long id,String companyName, String sector,String location){
        this.id=id;
        this.companyName=companyName;
        this.sector=sector;
        this.location=location;
    }
}
