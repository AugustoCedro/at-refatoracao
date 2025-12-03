package com.ex1;

public class ValueClassifier {

    private static final int SPECIAL_CASE_VALUE = -9999;

    public Classification classifyValue(int value){
        if(isSpecialValue(value)){
            return Classification.CASO_RARO;
        }
        if(isMediumValue(value)){
            return Classification.MEDIO;
        }
        if(isHighValue(value)){
            return Classification.ALTO;
        }
        return Classification.BAIXO;
    };

    private boolean isSpecialValue(int value){
        return value == SPECIAL_CASE_VALUE;
    }
    private boolean isHighValue(int value){
        return value > 10;
    }
    private boolean isMediumValue(int value){
        return value == 10;
    }


    public void printClassification(Classification classification){
        System.out.println(classification.toString());
    }
}