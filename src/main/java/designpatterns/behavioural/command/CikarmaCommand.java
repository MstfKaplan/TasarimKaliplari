package main.java.designpatterns.behavioural.command;

import java.math.BigDecimal;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class CikarmaCommand implements Islem {

    @Override
    public BigDecimal islem(BigDecimal sayi1, BigDecimal sayi2) {
        return sayi1.subtract(sayi2);
    }
}
