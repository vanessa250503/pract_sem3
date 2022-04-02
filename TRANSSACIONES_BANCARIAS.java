package ejerciciospracticos_semana3;

import ejerciciospracticos_semana3.CUENTA_BANCARIA;


public class TRANSSACIONES_BANCARIAS {
    
    public static void main(String[] args) {
       
        CUENTA_BANCARIA CUENTA = new CUENTA_BANCARIA();
        Sccanner leer = new Sccanner(System.in);
        
        
        String duiCliente,nombreCliente;
        long telefonoCliente;
        
        double abono, retiro;
        System.out.println("Igresesar los datos que se le solicita acontinuacion:");
        System.out.println("Nombre del propietario:");
        duiCliente=leer.nextLine();
        
        System.out.println("NumeroDe DUI:");
        nombreCliente=leer.nextLine();
        
        System.out.println(" Numero De Telefono: ");
        telefonoCliente=leer.nextLong(); 
        
        Cliente propietario = new Cliente(duiCliente,nombreCliente,telefonoCliente);
        
        System.out.println("Ingrese la cantidad a abonar: ");
        CUENTA.abonar(abono =leer.nextDouble());
        
        System.out.println("Ingrese cantidad a retirar");
        CUENTA.retirar(retiro=leer.nextDouble());
        
        System.out.println("Su saldo de la cuenta es: " + CUENTA.saldoCuenta);
        
        //obtener la informacion del propietario
        System.out.println("Datos del propietario : \n" + CUENTA.datosPropietarioCuenta());
    }
}
