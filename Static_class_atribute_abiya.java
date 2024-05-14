/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.static_class_atribute_abiya;


class Display{
    static String type = "Display";
    private String name;

    Display (String name){
        this.name = name;
        }
    
    void setType(String typeInput){
        // type = typeInput; // ALternatif 1
        // this.type = typeInput; // Alternatif 2
        Display.type = typeInput; // Alternatif 3
        
    }
    void show(){
        System.out.println("Display name =" + this.name);
        }
}
public class Static_class_atribute_abiya {

    public static void main(String[] args) {
       Display display1 = new Display("Monitor");
       display1.show();
       
       Display display2 = new Display("komputer");
       display2.show();
       
       
       display1.setType("Monitor");
       
       System.out.println("Menampilkan static atau class variable");
       System.out.println(display1.type);
       System.out.println(display2.type);
       System.out.println(Display.type);
    }
}
