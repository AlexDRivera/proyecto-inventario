/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia;

import entidades.Licores;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public interface IInventario {
    
    public void adicionarLicor(Licores f);
    public ArrayList<Licores> obtenerLicores();
    public Licores buscarLicor(int noLicor);
}
