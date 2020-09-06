package com.example.designpattern.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputerPartVisitorTest {

    @Test
    void visitor(){
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }

}