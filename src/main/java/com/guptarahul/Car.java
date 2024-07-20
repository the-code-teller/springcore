package com.guptarahul;

public class Car implements Vehicle {

    private DiscountService discountService;

    public Car() {
    }

    public Car(DiscountService discountService) {
        this.discountService = discountService;
    }

    public void setDiscountService(DiscountService discountService) {
        this.discountService = discountService;
    }

    @Override
    public String getMileage() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getMileage'");
        return "30 kmpl";
    }

    @Override
    public String getDiscountMessage() {
        return "Car: " + discountService.getMessage();
    }

}
