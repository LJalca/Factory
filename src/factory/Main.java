package factory;

public class Main {
    public static void main(String[] args) {
        CreadorContrato creadorFijo = new CreadorContratoFijo("FIJO");
        CreadorContrato creadorTemporal = new CreadorContratoTemporal("TEMPORAL");
        CreadorContrato creadorFactura = new CreadorContratoFactura("FACTURA");

        Contrato fijo = creadorFijo.crearContrato();
        Contrato temporal = creadorTemporal.crearContrato();
        Contrato factura = creadorFactura.crearContrato();

        System.out.println("Contrato fijo (" + ((ContratoFijo) fijo).type + "): " + fijo.calcularSueldo());
        System.out.println("Contrato temporal (" + ((ContratoTemporal) temporal).type + "): " + temporal.calcularSueldo());
        System.out.println("Contrato factura (" + ((ContratoFactura) factura).type + "): " + factura.calcularSueldo());
    }
}
