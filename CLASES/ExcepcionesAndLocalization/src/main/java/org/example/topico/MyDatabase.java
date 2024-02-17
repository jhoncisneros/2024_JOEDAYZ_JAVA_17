package org.example.topico;

public class MyDatabase {

    public static void connectToDatabase() throws Problem{
        throw new YesProblem();
    }

    public static void main(String[] args) throws Exception{
        connectToDatabase();
    }

}

class Problem extends Exception{
    public Problem(){

    }
}

class YesProblem extends Problem {

}