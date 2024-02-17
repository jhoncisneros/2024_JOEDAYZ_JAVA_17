package pe.joedayz.samples;

//@FunctionalInterface
public interface Soar { //NO ES SAM

    abstract String toString();
}

//@FunctionalInterface
interface Dive { //SI ES SAM
    String toString();
    public boolean equals(Object o);
    public abstract int hashCode();
    public void dive();
}

//@FunctionalInterface
interface Hibernate { //NO ES SAM
    String toString();
    public boolean equals(Hibernate o);
    public abstract int hashCode();
    public void rest();
}
