package com.serke.inventory.models;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Device {

    private Long id;

    private Date purchase;

    private String computer;

    private String brand;

    private String model;

    private String location;

    private String workStation;

    private String category;

    private Long owner;

    private String technicalState;

    private String serviceTag;

    private Boolean doNotShow;

    private Long links;

    private String ip;

    private String mac;

}
