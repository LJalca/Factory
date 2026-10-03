package factory;

public class CreadorContratoFactura extends CreadorContrato {
    public String type;

    public CreadorContratoFactura(String type) {
        this.type = type;
    }

    @Override
    public Contrato crearContrato() {
        return crearContrato(type);
    }

    public Contrato crearContrato(String type) {
        ContratoFactura contrato = new ContratoFactura();
        contrato.type = type;
        return contrato;
    }
}
