package com.example.quanlytoanha.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class BuildingSearchRequestDTO {
    String name ;
    Integer floorArea ;
    String district ;
    String ward ;
    String street  ;
    Integer numberOfBasement ;
    String direction ;
    String level ;
    Integer rentAreaFrom ;
    Integer rentAreaTo ;
    Integer rentPriceFrom ;
    Integer rentPriceTo ;
    String managerName ;
    String phoneNumber ;
    Long staffId ;
    String status ;
    @DateTimeFormat(iso=DateTimeFormat.ISO.DATE)
    LocalDate createDateFrom ;
    @DateTimeFormat(iso=DateTimeFormat.ISO.DATE)
    LocalDate createDateTo ;
    List<String> types ;
}
