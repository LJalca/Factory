package factory;

public class CreadorContratoTemporal extends CreadorContrato {
    public String type;

    public CreadorContratoTemporal(String type) {
        this.type = type;
    }

    @Override
    public Contrato crearContrato() {
        return crearContrato(type);
    }

    public Contrato crearContrato(String type) {
        ContratoTemporal contrato = new ContratoTemporal();
        contrato.type = type;
        return contrato;
    }
}
