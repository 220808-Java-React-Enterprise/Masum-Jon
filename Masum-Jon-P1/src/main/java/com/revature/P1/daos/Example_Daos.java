package com.revature.P1.Daos;

import java.io.IOException;

public class Example_Daos<U> {
    String reim_ID;
    static String reim_details;

    public interface exampleDaos<T> {

        void save(T obj);
        void update(T obj);
        void delete(T obj);


    }
}
