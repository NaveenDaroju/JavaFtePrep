package com.practise.com.daroju.fte;

import java.math.BigDecimal;

public class POJO {
    BigDecimal sales;

    public POJO(BigDecimal sales) {
        this.sales = new BigDecimal(0.0);
    }

    public BigDecimal getSales() {
        return this.sales;
    }

    public void setSales(BigDecimal sales) {
        this.sales = sales;
    }
}
