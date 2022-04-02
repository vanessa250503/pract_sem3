package ESTUDIANTE;

public class ESTUDIANTE {
    int EDAD=0;
    String NOMBRES;
    String APELLIDOS;
    String DIRECCION;
    int CARNET;
    
  
    
    
    public ESTUDIANTE(){
        
    }

    public ESTUDIANTE(String NOMBRES, String APELLIDOS) {
        this.NOMBRES = NOMBRES;
        this.APELLIDOS = APELLIDOS;
    }

    public ESTUDIANTE(String NOMBRES , String APELLIDOS, String DIRECCION, int CARNET) {
        this.NOMBRES = NOMBRES;
        this.APELLIDOS = APELLIDOS;
        this.DIRECCION = DIRECCION;
        this.CARNET = CARNET;
    }

    public String getAPELLIDOS() {
        return APELLIDOS;
    }

    public void setAPELLIDOS(String APELLIDOS) {
        this.APELLIDOS = APELLIDOS;
    }

    public int getEDAD() {
        return EDAD;
    }

    public int setEDAD (int EDAD) {
        this.EDAD = EDAD;
        return 0;
    }

    public String getDIRECCION() {
        return DIRECCION;
    }

    public void setDireccion(String direccion) {
        this.DIRECCION = DIRECCION;
    }

    public int getCarnet() {
        return CARNET;
    }

    public void setCARNET(int CARNET) {
        this.CARNET = CARNET;
    }
    
    
    
}