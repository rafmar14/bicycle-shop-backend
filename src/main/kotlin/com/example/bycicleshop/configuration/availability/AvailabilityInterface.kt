package com.example.bicycleshop.configuration.availability

import com.example.bicycleshop.product.model.Product

interface AvailabilityInterface {
    fun available(): Product;

    fun unAvailable(): Product;
}