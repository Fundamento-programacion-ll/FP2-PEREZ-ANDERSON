/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MAIN;

import empleado.Empleado;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Empleado_main {

    public static void main(String[] args) {
        Empleado emp = new Empleado();
        String nombreMayor;
        float mayorSueldo;
        int i = 0;
        Scanner sc = new Scanner(System.in);

        emp.mayor_salario();
        String empleados2[] = emp.getEmpleados();
        float sueldos2[] = emp.getSueldos();
        String antiguo2[] = emp.getAntiguo();
        int n2 = emp.getN();
        mayorSueldo = sueldos2[i];
        nombreMayor = empleados2[i];

        for (i = 1; i < n2; i++) {
            System.out.println("EMPLEADO #" + (i + 1));

            System.out.println("NOMBRE:");
            empleados2[i] = sc.next();

            System.out.println("APELLIDO:");
            String apellido = sc.next();
            System.out.println("FECHA INGRESO (yyyy-MM-dd):");
            antiguo2[i] = sc.next();
            System.out.println("FECHA NACIMIERNTO:");
            String fecha_nacimiento = sc.next();
            System.out.println("INGRESE SALARIO");
            sueldos2[i] = sc.nextFloat();
            if (sueldos2[i] > mayorSueldo) {
                mayorSueldo = sueldos2[i];
                nombreMayor = empleados2[i];
            }

            SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
            String strFecha = antiguo2[i];
            Date fecha = null;
            Date fechapr = null;
            Date fecha1 = null;
            boolean fechamx;
            try {

                fecha = formatoDelTexto.parse(strFecha);
                fecha1 = formatoDelTexto.parse("1900-00-00");

                fechamx = fecha1.before(fecha);

                if (fechamx == true) {
                    fechapr = fecha;
                    //System.out.println(""+fechapr);
                }

            } catch (ParseException e) {

                e.printStackTrace();

            }

            System.out.println("fecha del menos antiguo  " + fechapr.toString());

        }

        //  for (String empleados21 : empleados2) {
        //System.out.println("" + empleados21);
        // }
        System.out.println("Empleado con mayor sueldo: " + nombreMayor);
        System.out.println("Sueldo: " + mayorSueldo);

    }
}
