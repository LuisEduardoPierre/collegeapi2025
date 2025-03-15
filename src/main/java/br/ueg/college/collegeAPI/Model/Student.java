package br.ueg.college.collegeAPI.Model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student
{
    private long id;
    private String name;
    private String registerNumber;
    private String course;
    private String registerDate;
}
