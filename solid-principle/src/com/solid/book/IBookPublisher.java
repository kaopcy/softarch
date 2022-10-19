package com.solid.book;

public interface IBookPublisher extends IBook {
    // all of methods in interface are abstract, hence no need for add abstract modifier to below methods.
    void printToFile();
}
