package factory;

public class CreadorContratoFijo extends CreadorContrato {
    public String type;

    public CreadorContratoFijo(String type) {
        this.type = type;
    }

    @Override
    public Contrato crearContrato() {
        return crearContrato(type);
    }

    public Contrato crearContrato(String type) {
        ContratoFijo contrato = new ContratoFijo();
        contrato.type = type;
        return contrato;
    }
}
