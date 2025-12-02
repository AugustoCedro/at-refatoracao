package com.ex6;

public class Main {
    public static void main(String[] args) {

        Document pdf = DocumentFactory.create("pdf");
        Document html = DocumentFactory.create("html");
        Document other = DocumentFactory.create("DOCX");

        pdf.print();
        html.print();
        other.print();
    }
}
