

//7. Predicate in Object

package org.Java_8_Consumer_Examples.Java_8_Predicate_Examples;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import java.security.PrivateKey;

public class Hosting {
    private int Id;
    private String name;
    private String url;

    public Hosting(int i, String amazon, String s) {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Hosting{" + "Id=" + Id + ", name='" + name + '\'' + ", url='" + url + '\'' + '}';
    }
}
