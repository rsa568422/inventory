package com.serke.inventory.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "devices")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Device {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private Date purchase;

    private String computer;

    private String brand;

    private String model;

    private String location;

    @Column(name = "work_station")
    private String workStation;

    private String category;

    private Long owner;

    @Column(name = "technical_state")
    private String technicalState;

    @Column(name = "service_tag")
    private String serviceTag;

    @Column(name = "do_not_show")
    private Boolean doNotShow;

    private Long links;

    private String ip;

    private String mac;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Device device = (Device) o;
        return id != null && Objects.equals(id, device.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
