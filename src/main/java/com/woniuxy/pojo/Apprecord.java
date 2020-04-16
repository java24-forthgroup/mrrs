package com.woniuxy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Apprecord {
    private Integer apprecordId;
    private Integer empId;
    private Integer projectId;
    private Integer patientId;
    private String attendStatus;
    private String costStatus;
    private Emp emp;
    private Project project;
    private Patient patient;
    private Skillgroup skillgroup;
    private Aroom aroom;
    private Schedule schedule;
}