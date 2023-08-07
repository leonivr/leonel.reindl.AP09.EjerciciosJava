package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
        ejercicio6();
        ejercicio7();
        ejercicio8();
        ejercicio9();
        ejercicio10();
        ejercicio11();
        ejercicio12();*/
        ejercicio13();
    }

    public static void ejercicio1(){
        String name, last_name;
        int age;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name:");
        name=input.next();
        System.out.println("Enter your lastname:");
        last_name=input.next();
        System.out.println("Enter your age");
        age=input.nextInt();
        greet(name,last_name,age);
    }
    public static void ejercicio2(){
        int number1,number2,number3;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        number1=input.nextInt();
        System.out.println("Enter the second number:");
        number2=input.nextInt();
        System.out.println("Enter the third number:");
        number3=input.nextInt();
        System.out.println("the greatest number is: "+ mayorDeTres(number1,number2,number3));
    }
    public static void ejercicio3(){
        System.out.println("Enter un number para saber si es par o no:");
        int number;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        if(esPar(number)){
            System.out.println("El number " + number + " es Par");
        }else{
            System.out.println("El number " + number + " es No par");
        }
    }
    public static void ejercicio4(){
        String string1,string2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter la primer string:");
        string1 = input.next();
        System.out.println("Enter la second string:");
        string2 = input.next();
        if (cadenasIguales(string1,string2)){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }
    }
    public static void ejercicio5(){
        ArrayList<Integer> myArray =new ArrayList<>();
        Scanner input= new Scanner(System.in);
        int condition;
        do{
            System.out.println("Ingreso de números, para salir Ingrese 0:");
            condition = input.nextInt();
            if(condition != 0){
                myArray.add(condition);
            }
        }while (condition != 0);

        for(int i=0;i<myArray.size();i++){
            System.out.println("element "+i+":"+myArray.get(i));
        }
    }
    public static void ejercicio6(){
        welcome();
    }
    private static void welcome() {
        System.out.println("Hello, Bienvenido...");
    }

    private static boolean cadenasIguales(String string1, String string2) {
        return string1.equals(string2);
    }

    private static boolean esPar(int number) {
        return number % 2 == 0;
    }

    private static int mayorDeTres(int number1, int number2, int number3) {
        if (number1>number2 && number1>number3){
            return number1;
        } else if (number2>number1 && number2>number3) {
            return number2;
        }else{
            return number3;
        }
    }

    public static void greet(String nom, String ape, int edad) {
        System.out.println("Hello " + nom + " " + ape + ", tienes " + edad + " años.");
    }
    public static void ejercicio7(){
        ejercicio3();
    }
    public static boolean esPrimo(int num){
        int divisor=2;//posible divisor comenzando desde 2
        while (divisor <=Math.sqrt(num) && num%divisor!=0){//mientras el posible divisor no supere una cantidad, ni encuentre otro divisor aparte de 1 y el mismo número//
            divisor++;//avanza con el siguiente posible divisor
        }
        //si no encuentra más divisores hasta llegar a raiz del número, es primo, sino no es primo
        return divisor > Math.sqrt(num) && num != 1;
    }
    public static void ejercicio8(){
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Ingrese un número para saber si es primo o no:");
        number = input.nextInt();
        if(esPrimo(number)){
            System.out.println("El número "+number+" es Primo");
        }else{
            System.out.println("El número "+number+" No es Primo");
        }
    }
    public static ArrayList<Integer> getList(){ //Para Ej.9
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> collection =new ArrayList<>();
        int condition;
        do{
            System.out.println("Ingreso de números, para salir Ingrese 0:");
            condition = input.nextInt();
            if(condition != 0){
                collection.add(condition);
            }
        }while (condition != 0);

        return collection;
    }

    public static int sumaImpares(ArrayList<Integer> lista){//Para Ej.9
        int suma=0;
        for (Integer integer : lista) {
            if (integer % 2 != 0) {
                suma += integer;
            }
        }
        return suma;
    }

    public static void ejercicio9(){
        ArrayList<Integer> list;
        list = getList();
        System.out.println("La suma de los números impares de la lista es:"+sumaImpares(list));
    }

    //para ej.10
    public static void printPares(ArrayList<Integer> list){
        for(Integer element:list){
            if(element%2==0) {
                System.out.println("Números pares:"+element);
            }
        }
    }
    private static void printSumaPrimos(ArrayList<Integer> list) {
        int suma = 0;
        for (Integer element:list
             ) {
            if(esPrimo(element)){
                suma+=element;
            }
        }
        System.out.println("Suma de los números primos:"+suma);
    }
    public static void ejercicio10(){
        ArrayList<Integer> list = getList();
        printPares(list);
        printSumaPrimos(list);
    }
    public static int ejercicio11(){
        Scanner input = new Scanner(System.in);
        int condition;
        do{
            System.out.println("----------MENÚ----------");
            System.out.println("-----SELECCIONE LA OPERACIÓN-----");
            System.out.println("1-SUMA");
            System.out.println("2-RESTA");
            System.out.println("3-MULTIPLICACIÓN");
            System.out.println("4-DIVISIÓN");
            System.out.println("0-SALIR");
            System.out.println("Ingrese opción:");
            condition = input.nextInt();
            switch (condition){
                case 1:
                    System.out.println("Sumar");
                    break;
                case 2:
                    System.out.println("Restar");
                    break;
                case 3:
                    System.out.println("Multiplicar");
                    break;
                case 4:
                    System.out.println("Dividir");
                    break;
                case 0:
                    System.out.println("Ha salido");
                    break;
                default:
                    System.out.println("Opción Incorrecta");
                    break;
            }
        }while(condition < 0 || condition > 4);
        return condition;
    }
    public static void ejercicio12(){
        int opcion = ejercicio11();
        int num1,num2;
        Scanner input = new Scanner(System.in);
        switch (opcion){
            case 1:
                System.out.println("Ingrese el 1° número a sumar:");
                num1 = input.nextInt();
                System.out.println("Ingrese el 2° número a sumar:");
                num2 = input.nextInt();
                System.out.println("La suma "+num1+"+"+num2+" es: "+(num1+num2));
                break;
            case 2:
                System.out.println("Ingrese el 1° número a restar:");
                num1 = input.nextInt();
                System.out.println("Ingrese el 2° número a restar:");
                num2 = input.nextInt();
                System.out.println("La resta "+num1+"-"+num2+" es: "+(num1-num2));
                break;
            case 3:
                System.out.println("Ingrese el 1° número a multiplicar:");
                num1 = input.nextInt();
                System.out.println("Ingrese el 2° número a multiplicar:");
                num2 = input.nextInt();
                System.out.println("La multiplicación "+num1+"*"+num2+" es: "+(num1*num2));
                break;
            case 4:
                System.out.println("Ingrese el 1° número a dividir:");
                num1 = input.nextInt();
                do{
                    System.out.println("Ingrese el 2° número a dividir (Debe ser distinto de cero):");
                    num2 = input.nextInt();
                }while(num2==0);
                System.out.println("La división "+num1+"/"+num2+" es: "+(num1/num2));
                break;
        }
    }

    public static int menu(){
        Scanner input = new Scanner(System.in);
        System.out.println("--MENU--");
        System.out.println("1-INGRESO DE DATOS--");
        System.out.println("2-CAPACIDAD DISPONIBLE");
        System.out.println("3-DINERO RECAUDADO");
        System.out.println("4-SALIR");
        System.out.println("Ingrese Opción:");
        int opcion = input.nextInt();
        return opcion;
    }
    public static void ejercicio13(){
        int op = menu();
        switch (op){
            case 1:
                System.out.println("Ingreso de Datos");
                break;
            case 2:
                System.out.println("Capacidad Disponible");
                break;
            case 3:
                System.out.println("Dinero Recaudado");
                break;
            case 4:
                System.out.println("Ha salido");
                break;
            default:
                System.out.println("Opción Incorrecta");
                break;
        }
    }
}

