package com.longtv.btlon1.entity.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Role {
    @Id
    private String id;
    private String name;


    public Role(String name) {
        this.name = name;
    }
}