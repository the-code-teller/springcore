package com.guptarahul;

public class Bus implements Vehicle {

    private DiscountService discountService;

    public Bus(DiscountService discountService) {
        this.discountService = discountService;
    }

    @Override
    public String getMileage() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getMileage'");
        return "20kmpl";
    }

    @Override
    public String getDiscountMessage() {
        return "Bus: " + discountService.getMessage();
    }
}
