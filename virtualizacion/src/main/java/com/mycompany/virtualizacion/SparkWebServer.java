/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.virtualizacion;

import static spark.Spark.*;
/**
 *
 * @author daniel.perez-b
 */
public class SparkWebServer {
    
    public static void main(String... args){
          port(getPort());
          
          get("hello", (req,res) -> "Hello Docker!");
          //get("sin", (req,res) ->  Math.sin(Double.parseDouble("res")));
          
          get("/sin/:number", (request, response) -> {
               String number = request.params(":number");
               return Math.sin(Double.parseDouble(number));
           });
          
          get("/cos/:number", (request, response) -> {
               String number = request.params(":number");
               return Math.cos(Double.parseDouble(number));
           });
          
          get("/palidromo/:palabra", (request, response) -> {
               String palabraEsPalindrome = request.params(":palabra");
               return comprobarPalindromo(palabraEsPalindrome);
           });
     
    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
    
    public static String comprobarPalindromo(String palabra)
    {
  
        int n = palabra.length();
  
        palabra = palabra.toLowerCase();
  
        for (int i = 0; i < n; i++, n--)
        {
            if (palabra.charAt(i) != palabra.charAt(n - 1))
                return "false";
        }
  
        return "true";
    }
  

    
}
