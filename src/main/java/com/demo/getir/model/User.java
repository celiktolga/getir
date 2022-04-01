package com.demo.getir.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "users")
@Data
@Builder
@EqualsAndHashCode(callSuper = true)
public class User extends MainEntity {

    private String firstName;
    private String lastName;
}
