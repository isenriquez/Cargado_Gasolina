/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cargado_gasolina;

/**
 *
 * @author ENRIQUEZ ISRAEL
 */
class Cargado_Gasolina1 {

        //ATRIBUTO
    private String calidad;
    private int octanaje;
    private String precio;
    private int tempEvaporacion;

        //CONSTRUCTOR
    public Cargado_Gasolina1(String eCalidad, int eOctanaje, String ePrecio, int eTempEvaporacion){

        calidad=eCalidad;
        octanaje=eOctanaje;
        precio=ePrecio;
        tempEvaporacion=eTempEvaporacion;
    }
        //METODOS
    public String getCalidad(){
        return calidad;
    }
    public void setCalidad(String calidad){
        this.calidad=calidad; //puntero this invoca al atributo privado codigo
    }
    public int getOctanaje(){
        return octanaje;
    }
    public void setOctanaje(int octanaje){
        this.octanaje=octanaje;
    }
    public String getPrecio(){
        return precio;
    }
     public void setPrecio(String precio){
        this.precio=precio;
    }
    public int getTempEvaporacion(){
        return tempEvaporacion;
    }
    public void setTempEvaporacion(int tempEvaporacion){
        this.tempEvaporacion=tempEvaporacion;
    }
    @Override
    public String toString(){
        return "La carga de gasolina"+calidad+" con Octanaje: "+octanaje+"--"
               + "con el precio de "+precio+ "se evapora a una Temperaturade: "
               +tempEvaporacion+"grados";
    }
}
public class Cargado_Gasolina {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // creamoslos objetos
    Cargado_Gasolina1 carga1=new Cargado_Gasolina1("Super", 92 ," 2.90 USD ", 10 );
    Cargado_Gasolina1 carga2=new Cargado_Gasolina1("Extra", 87 ," 1.85 USD ", 12 );

    //Mostramos su estado
    System.out.println(carga1.toString());
    System.out.println(carga2.toString());

    //Modificamos el atributo octanaje de carga1
    carga1.setOctanaje(80);

    //comparamos quien tiene mas valor
    if(carga1.getOctanaje()<carga2.getOctanaje()){
        System.out.println(carga1.getCalidad()+ " tiene mas valor");
    }else {
            System.out.println(carga2.getCalidad()+ " tiene mas valor");
    }
    }

}
