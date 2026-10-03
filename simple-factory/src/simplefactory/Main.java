package simplefactory;

public class Main {
    public static void main(String[] args) {
        FabricaContrato fabrica = new FabricaContrato();

        Contrato fijo = fabrica.crearContrato("FIJO");
        Contrato temporal = fabrica.crearContrato("TEMPORAL");
        Contrato factura = fabrica.crearContrato("FACTURA");

        System.out.println("Contrato fijo (" + ((ContratoFijo) fijo).type + "): " + fijo.calcularSueldo());
        System.out.println("Contrato temporal (" + ((ContratoTemporal) temporal).type + "): " + temporal.calcularSueldo());
        System.out.println("Contrato factura (" + ((ContratoFactura) factura).type + "): " + factura.calcularSueldo());
    }
}
