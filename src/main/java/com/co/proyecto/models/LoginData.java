package com.co.proyecto.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class LoginData {

    String username;
    String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static List<LoginData> setData(DataTable table){
        List<LoginData> datos = new ArrayList<>();
        List<Map<String, String>> maps = table.asMaps();
        for (Map<String, String> i : maps) {
            datos.add(new ObjectMapper().convertValue(i, LoginData.class));
        }
        return datos;
    }
}
