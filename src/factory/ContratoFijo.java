package factory;

import java.math.BigDecimal;

public class ContratoFijo implements Contrato {
    public String type;

    @Override
    public BigDecimal calcularSueldo() {
        return new BigDecimal("2500000.00");
    }
}
