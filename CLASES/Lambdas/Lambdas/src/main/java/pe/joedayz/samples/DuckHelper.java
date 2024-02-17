package pe.joedayz.samples;

public class DuckHelper {

    public static void teacher(String name, LearnToSpeak trainer){
        trainer.speak(name);
    }
}

class Duckling {
    public static void makeSound(String sound){
        // I = lambda implementa
        LearnToSpeak learner = System.out::println;
        DuckHelper.teacher(sound, learner);
    }
}