/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author DELL
 */
public class Licores {
    private static int noConsecutivo=0;
    private int consecutivo;
    private String NombreLicor;
    private int CantidadStock;
    private double ValorLicor;
    
        public Licores() {
        
        noConsecutivo++;
        this.consecutivo=noConsecutivo;
    }

    public Licores(String NombreLicor, int CantidadStock, double ValorLicor) {
        this.NombreLicor = NombreLicor;
        this.CantidadStock = CantidadStock;
        this.ValorLicor = ValorLicor;
        noConsecutivo++;
        this.consecutivo=noConsecutivo;
    }

        public int getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(int consecutivo) {
        this.consecutivo = consecutivo;
    }
    
    public String getNombreLicor() {
        return NombreLicor;
    }

    public void setNombreLicor(String NombreLicor) {
        this.NombreLicor = NombreLicor;
    }

    public int getCantidadStock() {
        return CantidadStock;
    }

    public void setCantidadStock(int CantidadStock) {
        this.CantidadStock = CantidadStock;
    }

    public double getValorLicor() {
        return ValorLicor;
    }

    public void setValorLicor(double ValorLicor) {
        this.ValorLicor = ValorLicor;
    }
    
    @Override
    public String toString() {

       return String.format("%10d %15s %15s %15.2f",
                            this.getConsecutivo(),
                            this.getNombreLicor(),
                            this.getCantidadStock(),
                            this.getValorLicor());
    }
   
}
