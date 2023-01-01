//package org.Java_8_Consumer_Examples.Java_8_BiConsumer_Examples;
//
//import java.util.ConcurrentModificationException;
//import java.util.function.BiConsumer;
//
//public class JavaBiConsumer4 {
//    public static void main(String[] args) {
//        default void forEach(BiConsumer<? super K, ? super V> action) {
//            Objects.requireNonNull(action);
//            for (Map.Entry<K, V> entry : entrySet()) {
//                K k;
//                V v;
//                try {
//                    k = entry.getKey();
//                    v = entry.getValue();
//                } catch (IllegalStateException ise) {
//                    // this usually means the entry is no longer in the map.
//                    throw new ConcurrentModificationException(ise);
//                }
//                action.accept(k, v);
//        }
//    }
//}
