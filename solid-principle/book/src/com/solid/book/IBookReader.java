package com.solid.book;

public interface IBookReader extends IBook {
    // all of methods in interface are abstract, hence no need for add abstract modifier to below methods.
    void printToScreen();
}
