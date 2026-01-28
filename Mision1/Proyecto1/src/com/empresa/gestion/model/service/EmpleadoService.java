package com.empresa.gestion.model.service;
import com.empresa.gestion.model.model.Empleado;
import java.util.ArrayList;

public class EmpleadoService {
    private ArrayList<Empleado> empleados = new ArrayList<>();
    //Agregar
    public void agregarEmpleado(Empleado emp) {
        empleados.add(emp);
        System.out.println("Empleado agregado");
    }
}
