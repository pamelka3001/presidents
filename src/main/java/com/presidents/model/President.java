package com.presidents.model;

import lombok.*;

import java.sql.Timestamp;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class President {

    private Long id;

    private String name;

    private String surname;

    private Timestamp termFrom;

    private Timestamp termTo;

    private  String politicalParty;

}

