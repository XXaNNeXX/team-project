package de.neuefische.backend;

import org.springframework.stereotype.Repository;

@Repository
public class Repo {

    private final Record helloworld = new Record("Hello World");

    public String getString() {
        return helloworld.hello();
    }
}
