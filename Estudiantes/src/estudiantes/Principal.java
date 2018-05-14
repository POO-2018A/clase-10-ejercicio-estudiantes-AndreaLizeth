/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiantes;

/**
 *
 * @author Andrea Lizeth
 */
public class Principal {
    public static void main(String[] args) {
        int m1 = 0, m2 = 0, m3 = 0, m4 = 0, m5 = 0;
        System.out.println("##### INFORMACION ESTUDIANTES #####");
        
        Estudiantes [] estudiantes = new Estudiantes[5];
        
        estudiantes[0]= new Estudiantes("Andres", "Lopez", "17243644598");
        String[] e1 ={"M1", "M2"};
            estudiantes[0].setMaterias(e1);
        
        estudiantes[1]= new Estudiantes("Ximena", "Narvaez", "17248744018");
        String[] e2 ={"M1", "M2", "M3"};
            estudiantes[1].setMaterias(e2);
            
        estudiantes[2]= new Estudiantes("Julian", "Beltran", "17374629896");
        String[] e3 ={"M1", "M2", "M4", "M5"};
            estudiantes[2].setMaterias(e3);
            
      estudiantes[3]= new Estudiantes("Nathaly", "Rivadeneria", "1776394173");
        String[] e4 ={"M4", "M2","M5"};
            estudiantes[3].setMaterias(e4);
              
     estudiantes[4]= new Estudiantes("Leonardo", "Zapata", "1728730941");
        String[] e5 ={"M1", "M4"};
            estudiantes[4].setMaterias(e5);
               
        
 for(int i=0; i< 5 ; i++){
     System.out.println("Estudiante " + i);
     System.out.println("Nombre Completo: " + estudiantes[i].getNombre()+ " "+ estudiantes[i].getApellido());
     System.out.println("Cedula: " + estudiantes[i].getCedula()+"\n");
     System.out.println("\nMATERIAS: ");
        String[] materiasEstudiantes = estudiantes[i].getMaterias();
      
        for (int j = 1; j < materiasEstudiantes.length; j++){
            System.out.println(materiasEstudiantes[j]);
           
        
        }
 
    }       
        
 System.out.println("\n #### RESUMEN MATERIAS ####");

        
 
 
 
           } 
    
    
    
    
    
 
 
    }       
    

    
    
    
    
    
    
