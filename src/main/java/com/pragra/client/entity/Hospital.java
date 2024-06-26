package com.pragra.client.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hospital {
     Integer nurseID;
     String nurseFirstName;
     String nurseLastName;
     String nursePassword;
     String nursePhoneNo;
     Integer nurseSalary;
}
