package demo;

public class TextBlocks {

    public static void main(String[] args) {
        String eyeTest = "\"Java Study Guide\"\n"
                + " by Author";
//        System.out.println(eyeTest);

        String textBlock = """
                "Java Study Guide"
                 by Author
                """;
//        System.out.println(textBlock);

        String pyramid = """
                    *
                  *   *
                *   *   *    
                """;
//        System.out.println(pyramid);

//        String block = """doe""";
        String block = """
                doe \
                deer""";
//        System.out.println(block);

        String block2 = """
                doe \n
                deer""";
//        System.out.println(block2);

        String block3 = """
                "doe\"\"\"
                \"deer\"""
                """;
        System.out.println("*"+ block3 + "*");
    }
}
