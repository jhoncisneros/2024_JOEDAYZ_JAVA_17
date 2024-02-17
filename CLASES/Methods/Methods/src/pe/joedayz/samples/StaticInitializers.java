package pe.joedayz.samples;

public class StaticInitializers {

    private static final int NUM_SECONDS_PER_MINUTE;

    private static final int NUM_MINUTES_PER_HOUR;

    private static final int NUM_SECONDS_PER_HOUR;

    static{
        NUM_SECONDS_PER_MINUTE = 60;
        NUM_MINUTES_PER_HOUR = 60;
    }

    static {
        NUM_SECONDS_PER_HOUR = NUM_SECONDS_PER_MINUTE * NUM_MINUTES_PER_HOUR;
    }
}
