package ejerciciospracticos_semana3;

public class NOTAS {
    
    double notas1;
     double notas2;
     double notas3;
    
    public NOTAS(){
        
    }

    public NOTAS(double notas1, double notas2, double notas3) {
        this.notas1 = notas1;
        this.notas2 = notas2;
        this.notas3 = notas3;
    }

    public double getNOTAS1() {
        return notas1;
    }

    public void setNOTAS1(double nota1) {
        this.notas1 = notas1;
    }

    public double getNota2() {
        return notas2;
    }

    public void setNota2(double nota2) {
        this.notas2 = nota2;
    }

    public double getNota3() {
        return notas3;
    }

    public void setNota3(double nota3) {
        this.notas3 = nota3;
    }
    
    
}