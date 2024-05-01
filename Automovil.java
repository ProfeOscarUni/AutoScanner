import java.util.Scanner;

public class Automovil {
    String marca;
    int modelo;
    int velocidadMaxima;
    int velocidadActual;
    enum tipoAuto{
        CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV
    }
    tipoAuto tipoAutomovil;
    enum tipoCom{
        GASOLINA, BIOETANOL, DIESEL, BIODIESEL, GAS_NATURAL
    }    
    tipoCom tipoCombustible;
    public Automovil(String marca, int modelo, int velocidadMaxima, int velocidadActual,
            Automovil.tipoAuto tipoAutomovil, Automovil.tipoCom tipoCombustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
        this.velocidadActual = velocidadActual;
        this.tipoAutomovil = tipoAutomovil;
        this.tipoCombustible = tipoCombustible;
    }
    public int getVelocidadActual() {
        return velocidadActual;
    }
    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
    void acelerar(int aumentoVelocidad){
        if (velocidadActual+aumentoVelocidad>velocidadMaxima) {
            System.out.println("No se puede exceder la velocidad máxima");
        } else {
            velocidadActual=velocidadActual+aumentoVelocidad;
        }
        }
    void desacelerar(int disminucionVelocidad){
        if (velocidadActual-disminucionVelocidad<0) {
            System.out.println("No se puede disminuir a una velocidad menor que cero");
        } else {
            velocidadActual=velocidadActual-disminucionVelocidad;
        }
        }
    void frenar(){
        velocidadActual=0;
    }
    double calcularTiempoLlegada(int distancia){
        return distancia/velocidadActual;
    }

    void imprimir(){
        System.out.println("Marca = " +marca);
        System.out.println("Modelo = "+ modelo);
        System.out.println("Velocidad Máxima = " +velocidadMaxima);
        System.out.println("Tipo de combustible = " +tipoCombustible);
        System.out.println("Tipo de Automovil = " +tipoAutomovil);
        System.out.println("Velocidad Actual = " +velocidadActual);
    }

    public static void main(String[] args) {
        /*Automovil automovil1 = new Automovil("Ford", 2014, 240, 0, tipoAuto.CIUDAD, tipoCom.GASOLINA);
        System.out.println("Los datos del automovil 1 son los siguientes:");
        automovil1.imprimir();
        automovil1.setVelocidadActual(100);
        System.out.println("La velocidad Actual es igual a = "+automovil1.velocidadActual);
        automovil1.acelerar(20);
        System.out.println("La velocidad Actual es igual a = "+automovil1.velocidadActual);
        automovil1.desacelerar(50);
        System.out.println("La velocidad Actual es igual a = "+automovil1.velocidadActual);
        automovil1.frenar();
        System.out.println("La velocidad Actual es igual a = "+automovil1.velocidadActual);
        automovil1.desacelerar(10);*/
        Scanner vehiculo = new Scanner(System.in);
        System.out.println("Ingrese los datos del automovil 2:");
        System.out.println("Ingrese la marca del vehiculo");
        String marcaMain = vehiculo.nextLine();
        System.out.println("Ingrese el modelo del vehiculo");
        int modeloMain = vehiculo.nextInt();
        System.out.println("Ingrese la velocidad máxima del vehiculo");
        int velocidadMaximaMain = vehiculo.nextInt();
        System.out.println("Ingrese la velocidad actual del vehiculo");
        int velocidadActualMain = vehiculo.nextInt();
        System.out.println("Escoja el tipo de combustible de su vehiculo");
        System.out.println("\t 0-Gasolina.  1-Bioetanol     2-Diesel    3-Biodiesel     4-Gas Natural");
        tipoCom tipoCombustibleMain = tipoCom.values()[vehiculo.nextInt()];
        System.out.println("Escoja el tipo de automovil");
        System.out.println("\t 0-Ciudad.  1-Subcompacto     2-Compacto    3-Familiar     4-Ejecutivo    5-SUV");
        tipoAuto tipoAutomovilMain = tipoAuto.values()[vehiculo.nextInt()];

        Automovil automovil2 = new Automovil(marcaMain, modeloMain, velocidadMaximaMain, velocidadActualMain, tipoAutomovilMain, tipoCombustibleMain);
        automovil2.imprimir();
        automovil2.setVelocidadActual(100);
        System.out.println("La velocidad Actual es igual a = "+automovil2.velocidadActual);
        automovil2.acelerar(20);
        System.out.println("La velocidad Actual es igual a = "+automovil2.velocidadActual);
        automovil2.desacelerar(50);
        System.out.println("La velocidad Actual es igual a = "+automovil2.velocidadActual);
        automovil2.frenar();
        System.out.println("La velocidad Actual es igual a = "+automovil2.velocidadActual);
        automovil2.desacelerar(10);


        




    }

    
    
}