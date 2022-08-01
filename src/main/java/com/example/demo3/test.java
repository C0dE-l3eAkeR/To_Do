package com.example.demo3;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Date;

public class test {



    public static void main(String[] args) {
        ObservableList<Tasks> a = FXCollections.observableArrayList();

        Tasks b = new Tasks("acx", "xas", new Date(2323223232L));
         a.add(b);
         System.out.println(a.get(0).getTaskDate());

    }
}
