/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleado;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class Empleado {
    private String nombre;
    private String apellido;
    public String fecha_ingreso;
    private String fecha_nacimiento;
    private double salario;
    String [] empleados ;
    float [] sueldos ;
    String [] antiguo;
    int n;

    public String[] getAntiguo() {
        return antiguo;
    }

    public void setAntiguo(String[] antiguo) {
        this.antiguo = antiguo;
    }

    
    
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public String[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(String[] empleados) {
        this.empleados = empleados;
    }

    public float[] getSueldos() {
        return sueldos;
    }

    public void setSueldos(float[] sueldos) {
        this.sueldos = sueldos;
    }
    

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    public void mayor_salario (){
       
        int i=0;
    Scanner sc = new Scanner(System.in);
     System.out.println("INGRESE EL NUMERO DE EMPLEADOS");
    n =sc.nextInt();
     empleados = new String[n];
     sueldos = new float[n];
     antiguo =new String[n];
     
     //se lee el primer empleado
        System.out.println("Lectura de nombres y sueldos de empleados: ");
        System.out.print("NOMBRE Empleado " + (i + 1) + ": ");
        empleados[i] = sc.next();
        System.out.println("APELLIDO:");
        apellido = sc.next();
        System.out.println("FECHA INGRESO (yyyy-MM-dd):");
        antiguo[i]= sc.next();
        System.out.println("FECHA NACIMIENTO:");
        fecha_nacimiento = sc.next();
        
        System.out.print("SALARIO: ");
        sueldos[i] = sc.nextFloat();
         
        
        
       
        
   

    
    

    
    
}}
