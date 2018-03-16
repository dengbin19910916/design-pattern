package com.runoob.visitor;

public interface ComputerPart {

    void accept(ComputerPartVisitor computerPartVisitor);
}
