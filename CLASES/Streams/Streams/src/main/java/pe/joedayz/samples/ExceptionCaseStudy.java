package pe.joedayz.samples;

import java.io.IOException;
import java.util.List;
import java.util.function.Supplier;

public class ExceptionCaseStudy {

    public static void main(String[] args) throws IOException {
        ExceptionCaseStudy study = new ExceptionCaseStudy();
        study.good();
    }
    private static List<String> create() throws IOException {
        throw new IOException();
    }

    private static List<String> createSafe()  {
        try{
            return ExceptionCaseStudy.create();
        }catch (IOException ex){
            throw new RuntimeException(ex);
        }
    }

    public void good() throws IOException{
        ExceptionCaseStudy.create().stream().count();
    }

    public void bad() throws IOException{
//        Supplier<List<String>> s = ExceptionCaseStudy::create; // NO COMPILA
    }

    public void uglu(){
        Supplier<List<String>> s = () -> {
            try{
                return ExceptionCaseStudy.create();
            }catch (IOException ex){
                throw new RuntimeException(ex);
            }
        };
    }

    public void wrapped(){
        Supplier<List<String>> s = ExceptionCaseStudy::createSafe;
    }


}
