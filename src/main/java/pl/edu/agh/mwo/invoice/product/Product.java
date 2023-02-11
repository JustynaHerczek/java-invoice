package pl.edu.agh.mwo.invoice.product;

import java.math.BigDecimal;

public abstract class Product {
    private final String name;

    private final BigDecimal price;

    private final BigDecimal taxPercent;

    protected Product(String name, BigDecimal price, BigDecimal tax) {
        if (name.equals("")){
            throw new IllegalArgumentException();
        }
            this.name = name;
            this.price = price;
            this.taxPercent = tax;
    }


    public String getName() {
        return this.name;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public BigDecimal getTaxPercent() {
        return taxPercent;
    }

    public BigDecimal getPriceWithTax() {
        BigDecimal priceWithTax = this.price.add(this.price.multiply(this.taxPercent));
        return priceWithTax;
    }
}
