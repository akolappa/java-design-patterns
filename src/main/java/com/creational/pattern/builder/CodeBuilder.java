package com.creational.pattern.builder;

import com.creational.pattern.ocp.specification.Color;

public class CodeBuilder
{
    StringBuilder sb = new StringBuilder();
    public CodeBuilder(String className)
    {
        sb.append(String.format("public class %s",className)).append(System.lineSeparator()).append("{").append(System.lineSeparator());
    }

    public CodeBuilder addField(String name, String type)
    {
        sb.append(String.format("  public %s %s;",type,name)).append(System.lineSeparator());
        return this;
    }

    @Override
    public String toString()
    {
        return sb.append("}").toString();
    }

    public static void main(String[] args) {
        CodeBuilder codeBuilder = new CodeBuilder("Person")
                .addField("name", "String")
                .addField("age", "int");

        System.out.println(codeBuilder);
    }
}
