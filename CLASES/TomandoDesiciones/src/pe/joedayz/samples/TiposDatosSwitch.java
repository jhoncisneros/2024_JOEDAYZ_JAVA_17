package pe.joedayz.samples;

public class TiposDatosSwitch {

    final int getCookies(){
        return 4;
    }

    void feedAnimals(){
        final int bananas = 1;
        int apples = 2;
        int numberOfAnimals = 3;
        final int cookies = getCookies();

        switch (numberOfAnimals){
            case bananas: //SI ES FINAL
//            case apples: //NO ES FINAL
//            case cookies: //NO SE PUEDE RESOLVER EN TIEMPO DE COMPILACION
            case 3: //usando literales
            case 3 * 5: //usando expresion literal
        }
    }

    public static void main(String[] args) {
        TiposDatosSwitch tiposDatosSwitch = new TiposDatosSwitch();
        tiposDatosSwitch.feedAnimals();
    }
}
