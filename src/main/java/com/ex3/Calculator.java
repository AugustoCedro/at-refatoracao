package com.ex3;

public class Calculator {

    public double calculatePrice(double basePrice, CostumerType customerType, boolean isHoliday) {
        double customerDiscount = getCustomerTypeDiscount(customerType);
        double holidayDiscount = getHolidayDiscount(isHoliday);

        double totalDiscount = customerDiscount + holidayDiscount;

        return applyDiscount(basePrice,totalDiscount);
    }

    private double getCustomerTypeDiscount(CostumerType customerType){
        switch( customerType ) {
            case DEFAULT:
                return 0.1;
            case PREMIUM:
                return 0.15;
            default:
                return 0;
        }
    }

    private double getHolidayDiscount(boolean isHoliday){
        return isHoliday ? 0.05 : 0.0;
    }

    private double applyDiscount(double price,double discountRate){
        return price * (1 - discountRate);
    }
}
