package org.Java_8_Consumer_Examples.Java_8_Predicate_Examples;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class HostingRespository {
    public static List<Hosting> filterHosting(List<Hosting> hosting,
                                              Predicate<Hosting> predicate) {
        return hosting.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }

}


