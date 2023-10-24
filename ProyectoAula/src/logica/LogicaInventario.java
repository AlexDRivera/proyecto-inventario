/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import entidades.Licores;
import java.util.ArrayList;
import persistencia.*;
/**
 *
 * @author DELL
 */
public class LogicaInventario {
    
    private IInventario data;
    
        public LogicaInventario() {
        this.data = new ListaProductos();
        }
        
        public void RegistrarLicor(Licores f) {
        this.data.adicionarLicor(f);
        }
        
        public ArrayList<Licores> ConsultarLicores(){
        return this.data.obtenerLicores();
        } 
        
        public Licores buscarLicor(int noLicor){
           Licores f = this.data.buscarLicor(noLicor);
           return f;
        }
    }
        
