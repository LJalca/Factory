package simplefactory;

import java.math.BigDecimal;

public class ContratoFactura implements Contrato {
    public String type;

    @Override
    public BigDecimal calcularSueldo() {
        return new BigDecimal("3200000.00");
    }
}
