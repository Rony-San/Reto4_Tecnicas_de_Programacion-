package com.mycompany.reto4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Declaración de variables para el panel_i
        String id;
        String serie;
        String descripcion;
        String tipoPanel = "n";
        String modelo;
        int anioFabricacion;
        double precio;
        boolean tipoPanelRespuesta;
        String respuestaPanel;

        // Declaracion de variables para la Venta_i
        String panelId;
        LocalDate fechaVenta;
        String tipoDocumento;
        String documento;
        String nombreComprador;
        double valorVenta;
        String descripcionVenta;

        // Declaracion de variables para el seguro_i
        String panelSeguroId;
        String nombreEmpresa;
        LocalDate fechaInicial;
        LocalDate fechaFinal;
        String descripcionSeguro;

        // ArrayList de paneles 
        ArrayList<Panel> paneles = new ArrayList<>();

        // ArrayList de ventas 
        ArrayList<Venta> ventas = new ArrayList<>();

        // ArrayList de Seguros 
        ArrayList<Seguro> seguros = new ArrayList<>();

        
        // Menu
        
        boolean salida = false;
 
        Scanner sc = new Scanner(System.in);
        String respuesta;
        
        
        
        while (!salida) {

            // Opciones del menu 
            System.out.println("Ingrese la opción que desea elegir");
            System.out.println("1. Ingresar Panel");
            System.out.println("2. Crear Venta");
            System.out.println("3. Crear seguro");
            System.out.println("4. ver paneles");
            System.out.println("5. ver ventas");
            System.out.println("6. ver seguros \n");

            respuesta = sc.nextLine();
            
            switch (respuesta) {
                
                
                
                case "1" -> {       
                    // Creación de un panel con la información dada por el usuario
                    System.out.println("Ingrese los datos del panel ");
                    
                    System.out.println("id ");
                    id = sc.nextLine();
                    System.out.println("serie ");
                    serie = sc.nextLine();
                    System.out.println("descripcion ");
                    descripcion = sc.nextLine();
                    System.out.println("tipoPanel ");
                    System.out.println("modelo ");
                    modelo = sc.nextLine();
                    System.out.println("anioFabricacion ");
                    anioFabricacion = sc.nextInt();
                    System.out.println("precio ");
                    precio = sc.nextDouble();

                    tipoPanelRespuesta = false;
                    
                    // el tipo de panel es restringido según los siguientes 4 tipos
                    while (!tipoPanelRespuesta) {
                        
                        respuestaPanel = sc.nextLine();
                        System.out.println("1. monocristalino");
                        System.out.println("2. policristalino");
                        System.out.println("3. película delgada");
                        System.out.println("4. CVP");
                        
                       switch (respuestaPanel) {
                            case "1" -> {
                                tipoPanel = "monocristalino";
                                tipoPanelRespuesta = true;
                            }
                            case "2" -> {
                                tipoPanel = "policristalino";
                                tipoPanelRespuesta = true;
                            }
                            case "3" -> {
                                tipoPanel = "película delgada";
                                tipoPanelRespuesta = true;
                            }
                            case "4" -> {
                                tipoPanel = "CVP";
                                tipoPanelRespuesta = true;
                            }
                            
                        }
                    }
                    
                    // Se instancia un nuevo panel de la Clase Panel con la información antior para el panel
                    Panel paneli = new Panel(id, serie, descripcion, tipoPanel, modelo, anioFabricacion, precio);
                    // Se agrega el objeto panel creado al ArrayList de paneles
                    paneles.add(paneli);
                    System.out.println("Panel creado con exito \n");
                }
                
                
                
                case "2" -> {
                    // Creación de una venta con la información dada por el usuario 
                    System.out.println("Ingrese los datos de la venta\n");
                    
                    
                    System.out.println("panelId");
                    panelId = sc.nextLine();
                    System.out.println("fechaVenta ejemplo: 2015-02-20");
                    fechaVenta = LocalDate.parse(sc.nextLine());
                    System.out.println("tipoDocumento ");
                    tipoDocumento = sc.nextLine();
                    System.out.println("documento ");
                    documento = sc.nextLine();
                    System.out.println("nombreComprador ");
                    nombreComprador = sc.nextLine();
                    System.out.println("valorVenta ");
                    valorVenta = sc.nextDouble();
                    System.out.println("descripcionVenta ");
                    descripcionVenta = sc.nextLine();
                    
                    // Instanciación de una venta de la clase Venta
                    Venta ventai = new Venta(panelId, fechaVenta, tipoDocumento, documento, nombreComprador, valorVenta, descripcionVenta);
                    // Se agrega el objeto ventai creado al ArrayList de ventas
                    ventas.add(ventai);
                    System.out.println("Venta registrada con exito \n");
                }

                case "3" -> {
                    //Creación de un Seguro con la inforamción dada pro el usario 
                    System.out.println("Ingrese los datos del Seguro\n");

                    System.out.println("panelSeguroId \n");
                    panelSeguroId = sc.nextLine();
                    System.out.println("nombreEmpresa \n");
                    nombreEmpresa = sc.nextLine();
                    System.out.println("fechaInicial ejemplo: 2015-02-20");
                    fechaInicial = LocalDate.parse(sc.nextLine());
                    System.out.println("fechaFinal ejemplo: 2015-02-20");
                    fechaFinal = LocalDate.parse(sc.nextLine());
                    System.out.println("descripcionSeguro \n");
                    descripcionSeguro = sc.nextLine();
                    
                    // Instanciación de un seguro de la clase Seguro
                    Seguro seguroi = new Seguro(panelSeguroId, nombreEmpresa, fechaInicial, fechaFinal, descripcionSeguro);
                    seguros.add(seguroi);
                    // Se agrega el seguroi ventai creado al ArrayList de seguros
                    System.out.println("Seguro registrado con exito \n");
                }
                
                // Se muestran los objetos en el arrayList de paneles, con su información más relevante
                case "4" -> {
                    for (int i = 0; i < paneles.size(); i++) {
                        Panel panel_i = paneles.get(i);
                        System.out.println("ID Panel: " + panel_i.getId() + " " 
                                + "modelo: " + panel_i.getModelo()+  " " +
                                        "precio: " + panel_i.getPrecio());
                        System.out.println(" ");
                    }
                }
                
                // Se muestran los objetos en el arrayList de ventas, con su información más relevante
                case "5" -> {
                    for (int i = 0; i < ventas.size(); i++) {
                        Venta venta_i = ventas.get(i);
                        System.out.println("Documento Cliente: " + venta_i.getDocumento() +
                                " " + "ID Panel: " + venta_i.getPanelId() +
                                "precio: " + venta_i.getValorVenta());
                        System.out.println(" ");

                    }
                }
                // Se muestran los objetos en el arrayList de seguros, con su información más relevante
                case "6" -> {
                    for (int i = 0; i < seguros.size(); i++) {
                        Seguro seguro_i = seguros.get(i);
                        System.out.println("Empresa: " + seguro_i.getNombreEmpresa() + " "
                                + "ID Panel: " + seguro_i.getPanelId());
                        System.out.println(" ");

                    }
                }
                default -> System.out.println("Ingrese una opción adecuada");
            }

        }

   
    }

}
