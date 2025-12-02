package com.ex6;

public class DocumentFactory {

    public static Document create(String type) {
        switch (type.toUpperCase()) {
            case "PDF":
                return new PdfDocument();
            case "HTML":
                return new HtmlDocument();
            default:
                return new UnknownDocument();
        }
    }
}