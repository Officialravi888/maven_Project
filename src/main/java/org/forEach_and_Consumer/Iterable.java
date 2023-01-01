//package org.forEach_and_Consumer;
//
//import java.util.Objects;
//import java.util.function.Consumer;
//import java.util.stream.BaseStream;
//
//public interface Iterable {
//    default void forEach(Consumer<? super T> action) {
//        Objects.requireNonNull(action);
//        for (T t : this) action.accept(t);
//    }
//}

