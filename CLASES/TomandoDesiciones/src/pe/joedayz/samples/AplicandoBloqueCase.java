package pe.joedayz.samples;

public class AplicandoBloqueCase {

    public static void main(String[] args) {
        int fish = 5;
        int length = 12;

        String var = "var";
        String yield = "123";
        String Public = "abc";

        var name = switch (fish){
          case 1 -> "Goldfish";
          case 2 -> {yield "Trout";}
          case 3 -> {
              if(length > 10){
                  yield "Blofish";
              }else{
                  yield "Green";
              }
          }
//          case 4 -> {} //NO COMPILA
//          case 5 -> { //NO COMPILA
//              if(length > 10)
//                  yield "Blfish";
//          }
          default -> "Swordfish";
        };
    }
}
