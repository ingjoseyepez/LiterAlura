package com.aluraChallegen.LiterAlura.principal;

import com.aluraChallegen.LiterAlura.modelo.DatosLibros;
import com.aluraChallegen.LiterAlura.service.ConsumiApi;
import com.aluraChallegen.LiterAlura.service.ConviertesDatos;

import java.util.Scanner;

public class Principal {
    private Scanner entrada = new Scanner(System.in);
    private ConsumiApi consumiApi = new ConsumiApi();
    private final String URL = "https://gutendex.com/books/?search=Bobby+in+Movieland";
    private ConviertesDatos conversor = new ConviertesDatos();

    public void muestraElMenu() {
        var json = consumiApi.obtenerDatos(URL);
        System.out.println("JSON response: " + json);  // Añade esta línea para depuración
        DatosLibros datos = conversor.obtenerDatos(json, DatosLibros.class);
        System.out.println(datos);
        System.out.println("***********************");
    }
}

