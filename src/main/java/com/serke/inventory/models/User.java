package com.serke.inventory.models;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class User {

    private Long id;

    private String name;

    private String surname1;

    private String surname2;

    private String userName;

    private String email;

}
