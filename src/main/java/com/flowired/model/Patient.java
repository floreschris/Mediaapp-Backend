package com.flowired.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Patient {

    private Integer idPatient;
    private String firstName;
    private String lastName;
    private String dni;
    private String address;
    private String phone;
    private String email;


}
