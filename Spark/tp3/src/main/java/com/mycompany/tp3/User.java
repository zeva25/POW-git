package com.mycompany.tp3;

import lombok.Data;

@Data
public class User {
    private int id;
    private String email;
    private String pass;

    Object getId() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    Object getEmail() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
