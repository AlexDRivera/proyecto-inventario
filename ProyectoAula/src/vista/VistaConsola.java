/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import entidades.Licores;
import logica.LogicaInventario;

/**
 *
 * @author DELL
 */
public class VistaConsola {
    private LogicaInventario logica;

    public VistaConsola() {
        this.logica = new LogicaInventario();
    }

    public void mostrarMenu() {
        System.out.println("");
        System.out.println("| ## SOFTWARE Inventario Licoreria ## |");
        System.out.println("--------------------------------------");
        System.out.println("1. Registrar Producto");
        System.out.println("2. Listar Producto");
        System.out.println("3. Buscar Producto");
        System.out.println("4. Salir\n");

    }

    public void ejecutarMenu() {
        int opcionSeleccionada;
        do {

            this.mostrarMenu();
            opcionSeleccionada = Entrada.leerInt("Seleccione una opcion");
            switch (opcionSeleccionada) {

                case 1:
                    this.opcionRegistrarLicor();
                    break;
                case 2:
                    this.opcionConsultarLicores();
                    break;
                case 3:
                    this.opcionBuscarLicor();
                    break;
                case 4:
                    System.out.println("!! Aplicacion finalizada con exito ¡¡");
                    break;
                default:
                    System.out.println("!! Opcion no valida ¡¡\n");

            }

        } while (opcionSeleccionada != 4);
    }
    /**
     *
     */
    
public void opcionRegistrarLicor(){
        int continuar;
        do {
            System.out.println("");
            System.out.println("| ## 1. REGISTRO DE Licor ## |");
            System.out.println("--------------------------------");
            Licores nuevoLicor;
            String NomLicor = Entrada.leerLinea("Nombre Licor");
            double ValorLicor = Entrada.leerDouble("Cantidad Licores");
            int CantidadStock = Entrada.leerInt("Valor Licor");
            nuevoLicor = new Licores(NomLicor, CantidadStock, ValorLicor);
            this.logica.RegistrarLicor(nuevoLicor);
            System.out.println("!! Licor Registrado ¡¡");
            continuar = Entrada.leerInt("Desea registrar otro Licor [1->Si][Otro->No]");
        } while (continuar == 1);   
    }

public void opcionConsultarLicores() {
        int continuar;

        System.out.println("");
        System.out.println("| ## 2. LISTADO DE Licores ## |");
        System.out.println("--------------------------------");
        System.out.printf("%10s %15s %15s %15s\n",
                           "No Factura", "Nombre Licor", "Valor Licor","Cantidad en el Stock");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
        for (Licores f : this.logica.ConsultarLicores()) {
            System.out.println(f);
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Total Licores Registrados : " + this.logica.ConsultarLicores().size());
        System.out.println("");
        continuar = Entrada.leerInt("Presiona cualquier numero para volver al menu ");
    }

public void opcionBuscarLicor() {
        
        int continuar;
        do {
            System.out.println("");
            System.out.println("| ## 3. BUSQUEDA DE Licores ## |");
            System.out.println("--------------------------------");
            Licores licorBuscado;
            int noLicor = Entrada.leerInt("No Licor");
            
            licorBuscado = this.logica.buscarLicor(noLicor);
            System.out.println("---------------------------------");
            if(licorBuscado==null){
                System.out.println("!! El licor no ha sido registrada ¡¡\n ");
            }
            else{
                System.out.printf("%10s %15s %15s %15s\n",
                           "No Factura", "Nombre Licor", "Valor Licor","Cantidad en el Stock");
                 System.out.println(licorBuscado.toString());
            }
            System.out.println("");     
            continuar = Entrada.leerInt("Desea buscar otro Licor [1->Si][Otro->No]");
        } while (continuar == 1);

    }

}