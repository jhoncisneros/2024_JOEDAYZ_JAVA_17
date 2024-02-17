package org.example.topico;

public class Apple extends RuntimeException{ // (unchecked)

}

class Orange extends Exception{ // (checked)

}

class Banana extends Error{ // (unchecked)

}

class Pear extends Apple{ //(unchecked)

}

class Tomato extends Orange{ // (checked)

}

class Peach extends Throwable{ // (checked)

}

