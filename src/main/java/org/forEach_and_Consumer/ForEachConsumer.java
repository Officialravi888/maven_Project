package org.forEach_and_Consumer;

        import java.util.*;
        import java.util.function.Consumer;
        import java.util.stream.Stream;

public class ForEachConsumer {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("abc", "java", "python");
        Stream<String> stream = Stream.of("abc", "java", "python");

        // convert a String to a Hex
        Consumer<String> printTextInHexConsumer = (String x) -> {
            StringBuilder sb = new StringBuilder();
            for (char c : x.toCharArray()) {
                String hex = Integer.toHexString(c);
                sb.append(hex);
            }
            System.out.print(String.format("%n%-10s:%s", x, sb.toString()));
        };

        // pass a Consumer
        list.forEach(printTextInHexConsumer);

        stream.forEach(printTextInHexConsumer);

    }

}