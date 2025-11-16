package edu.icet.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {
    private Integer id;
    private String name;
    private String address;
    private String email;
    private String age;
}
