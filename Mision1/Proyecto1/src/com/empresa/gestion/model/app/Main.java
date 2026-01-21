package com.empresa.gestion.model.app;
import com.empresa.gestion.model.model.*;
import com.empresa.gestion.model.service.*;

public class Main {
    public static void main(String[] args) { 
        Empleado empleado1 = new Empleado("Juan", 30, 5000.0);
        Gerente gerente1 = new Gerente("Ana", 40, 8000, "Ventas");
        empleado1.presentarse();
        gerente1.presentarse();
        NominaService nomina = new NominaService();
        System.out.println("Salario anual: $"+nomina.calcularSalarioAnual(empleado1));
        System.out.println("Salario anual: $"+nomina.calcularSalarioAnual(gerente1));

    } 
}
