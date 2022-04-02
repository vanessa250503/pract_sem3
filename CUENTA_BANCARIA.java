package ejerciciospracticos_semana3;

public class CUENTA_BANCARIA {


    long numeroCuenta;
    Cliente propietarioCuenta;
   double saldoCuenta;
    
    public void ABONAR(double cantidad){
        saldoCuenta+= cantidad;//logica de negocio
        
    }
    public void RETIRAR(double cantidad){
        if(cantidad > saldoCuenta){
            System.out.println("Saldo insuficiente");
        }
        saldoCuenta-= cantidad;//logica de negocio
    }
    
    public String DATOSPROPIETARIOCUENTA(){
        String informacion="";
        informacion += "DUI: " + propietarioCuenta.DUICLIENTE + "\n";
        informacion += "NONMBRE: " + propietarioCuenta.NOMBRECLIENTE + "\n";
        informacion += "TELEFONO: " + propietarioCuenta.TELEFONOCLIENTE + "\n";
        return informacion;
    }

    public String datosPropietarioCuenta() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void abonar(double nextDouble) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void retirar(double nextDouble) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
    }