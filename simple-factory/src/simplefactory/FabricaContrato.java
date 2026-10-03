package simplefactory;

public class FabricaContrato {

    public Contrato crearContrato(String type) {
        switch (type) {
            case "FIJO":
                ContratoFijo fijo = new ContratoFijo();
                fijo.type = type;
                return fijo;
            case "TEMPORAL":
                ContratoTemporal temporal = new ContratoTemporal();
                temporal.type = type;
                return temporal;
            case "FACTURA":
                ContratoFactura factura = new ContratoFactura();
                factura.type = type;
                return factura;
            default:
                throw new IllegalArgumentException("Tipo de contrato no soportado: " + type);
        }
    }
}
