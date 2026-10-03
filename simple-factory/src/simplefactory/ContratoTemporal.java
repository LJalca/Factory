package simplefactory;

import java.math.BigDecimal;

public class ContratoTemporal implements Contrato {
    public String type;

    @Override
    public BigDecimal calcularSueldo() {
        return new BigDecimal("1800000.00");
    }
}
