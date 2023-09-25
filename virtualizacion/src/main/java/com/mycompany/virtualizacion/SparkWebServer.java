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
          
          get("/palindromo/:palabra", (request, response) -> {
               String palabraEsPalindrome = request.params(":palabra");
               return comprobarPalindromo(palabraEsPalindrome);
           });
          
          get("/magnitudVector/:x/:y", (request, response) -> {
               String x = request.params(":x");
               String y = request.params(":y");
               return  calcularMagnitud(x, y);
           });
     
    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
    
   public static String comprobarPalindromo(String palabra) {
    palabra = palabra.toLowerCase();
    char[] caracteres = palabra.toCharArray();
    int n = caracteres.length;

    for (int i = 0; i < n / 2; i++) {
        if (caracteres[i] != caracteres[n - 1 - i]) {
            return "false";
        }
    }

    return "true";
}

    public static double calcularMagnitud(String x, String y) {

        double magnitud = Math.sqrt(Double.parseDouble(x) * Double.parseDouble(x) + Double.parseDouble(y) * Double.parseDouble(y));
        return magnitud;
    }
  

    
}
