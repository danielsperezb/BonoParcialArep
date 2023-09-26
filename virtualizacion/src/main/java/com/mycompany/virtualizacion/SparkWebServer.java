package com.mycompany.virtualizacion;

import static spark.Spark.*;

/**
 * Esta clase representa un servidor web Spark que ofrece varias rutas para realizar
 * cálculos matemáticos y verificar palíndromos.
 *
 * @author daniel.perez-b
 */
public class SparkWebServer {

    /**
     * Método principal para iniciar la aplicación.
     *
     * @param args Argumentos de línea de comandos (no se utilizan en este caso).
     */
    public static void main(String... args) {
        // Configuración del puerto del servidor
        port(getPort());

        // Configuración de la carpeta para modificar 
        //el Cliente para que se puedan llamar asíncronamente estas funciones, 
        //por ejemplo con una formulario para cada función.
        staticFiles.location("/public");

        // Ruta para saludar
        get("hello", (req, res) -> "Hello Docker!");

        // Ruta para calcular el seno de un número
        get("/sin/:number", (request, response) -> {
            String number = request.params(":number");
            return Math.sin(Double.parseDouble(number));
        });

        // Ruta para calcular el coseno de un número
        get("/cos/:number", (request, response) -> {
            String number = request.params(":number");
            return Math.cos(Double.parseDouble(number));
        });

        // Ruta para verificar si una palabra es un palíndromo
        get("/palindromo/:palabra", (request, response) -> {
            String palabraEsPalindrome = request.params(":palabra");
            return comprobarPalindromo(palabraEsPalindrome);
        });

        // Ruta para calcular la magnitud de un vector
        get("/magnitudVector/:x/:y", (request, response) -> {
            String x = request.params(":x");
            String y = request.params(":y");
            return calcularMagnitud(x, y);
        });
    }

    /**
     * Obtiene el puerto del servidor desde la variable de entorno "PORT".
     * Si no se encuentra, se utiliza el puerto 4567 por defecto.
     *
     * @return El puerto del servidor.
     */
    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }

    /**
     * Verifica si una palabra es un palíndromo.
     *
     * @param palabra La palabra a verificar.
     * @return "true" si la palabra es un palíndromo, "false" de lo contrario.
     */
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

    /**
     * Calcula la magnitud de un vector dado sus componentes x e y.
     *
     * @param x Componente x del vector.
     * @param y Componente y del vector.
     * @return La magnitud del vector.
     */
    public static double calcularMagnitud(String x, String y) {
        double magnitud = Math.sqrt(Double.parseDouble(x) * Double.parseDouble(x) + Double.parseDouble(y) * Double.parseDouble(y));
        return magnitud;
    }
}
