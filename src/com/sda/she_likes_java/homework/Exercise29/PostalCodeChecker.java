package com.sda.she_likes_java.homework.Exercise29;

public class PostalCodeChecker {
    public static void checkPostalCode(PostalCode postalCode) throws PostalCodeException{
        String postalCodePattern = "^LV\\d{4}$";

        if (!postalCode.getPostalCode().matches(postalCodePattern)){
            throw new PostalCodeException("Invalid postal code format");
        }
    }
}
