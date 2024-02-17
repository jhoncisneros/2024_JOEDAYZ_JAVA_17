package org.example.sobreescritura;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Bear2 {

    public static void eat() throws IOException {
        System.out.println("Bear is eating");
    }
}

class Panda extends Bear2{

    public static void eat() {

        System.out.println("Panda is eating");
    }

    public static void main(String[] args) {
        eat();
//        Bear2.eat();

    }
}
