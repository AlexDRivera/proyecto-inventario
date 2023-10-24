/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import entidades.Licores;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class ListaProductos implements IInventario {
    private List<Licores> listaProductos;
    
    public ListaProductos(){
       this.listaProductos= new ArrayList();
    }
    
    @Override
    public void adicionarLicor(Licores f) {
        this.listaProductos.add(f);
    }
    
    @Override
    public ArrayList<Licores> obtenerLicores() {
        ArrayList<Licores> lista = new ArrayList(this.listaProductos);
        return lista;
    }
    
    @Override
    public Licores buscarLicor(int noLicor) {
            Licores licorBuscado = null;
            for(Licores f: this.listaProductos){
                if(f.getConsecutivo() == noLicor){
                    licorBuscado = f;
                    break;
                }

            }
            return licorBuscado;
    }
}
