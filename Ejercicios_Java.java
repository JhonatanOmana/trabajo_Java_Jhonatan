package TrabajoJava;

/**
 *
 * @author Jhonatan Omaña
 */
import java.util.Scanner;

public class Ejercicios_Java {
    
    // complemento ejercicio 18
    public static int mcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    // complemento ejercicio 23
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) fact *= i;
        return fact;
    }
    
    // complemento ejercicio 36 
    public static String obtenerComplementoA1(String binario) {
        StringBuilder complemento = new StringBuilder();
        for (char bit : binario.toCharArray()) {
            complemento.append(bit == '0' ? '1' : '0');
        }
        return complemento.toString();
    }
    
    // complemento ejercicio 37 
    public static String obtenerComplementoA2(String binario) {
        StringBuilder complemento = new StringBuilder();
        for (char bit : binario.toCharArray()) {
            complemento.append(bit == '0' ? '1' : '0');
        }
        StringBuilder resultado = new StringBuilder(complemento.toString());
        int carry = 1;
        for (int i = resultado.length() - 1; i >= 0; i--) {
            if (resultado.charAt(i) == '1' && carry == 1) {
                resultado.setCharAt(i, '0');
            } else if (carry == 1) {
                resultado.setCharAt(i, '1');
                carry = 0;
                break;
            }
        }
         if (carry == 1) {
            resultado.insert(0, '1');
        }
        return resultado.toString();
    }
    
    // complemento ejercicio 45 
    public static void obtenerFactoresPrimos(int numero) {
        while (numero % 2 == 0) {
            System.out.print(2 + " ");
            numero /= 2;
        }
        for (int i = 3; i <= Math.sqrt(numero); i += 2) {
            while (numero % i == 0) {
                System.out.print(i + " ");
                numero /= i;
            }
        }
        if (numero > 2) {
            System.out.print(numero);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("");
            System.out.println("\nSeleccione una opción del 1 al 45 para ver el ejercicio:");
            System.out.println("0. Salir");
            System.out.println("");
            System.out.print("Ingrese su elección: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 0) break;

            switch (opcion) {
                case 1:
                    System.out.println("1. Imprimir todos los números naturales del 1 al n.");
                    System.out.print("Ingrese un número n: ");
                    int n = scanner.nextInt();
                    for (int i = 1; i <= n; i++) {
                        System.out.print(i + " ");
                    }
                    break;    
                case 2:
                    System.out.println("2. Imprimir todos los números naturales en orden inverso.");
                    System.out.print("Ingrese un número n: ");
                    int b = scanner.nextInt();
                    for (int i = b; i >= 1; i--) {
                        System.out.print(i + " ");
                    }
                case 3:
                    System.out.println("3. Imprimir tablas de multiplicar.");
                    System.out.print("Ingrese un número: ");
                    int a = scanner.nextInt();
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(a + " x " + i + " = " + (a * i));
                    }
                    break;
                case 4:
                    System.out.println("4. Imprimir tablas de multiplicar en orden inverso.");
                    System.out.print("Ingrese un número: ");
                    int c = scanner.nextInt();
                    for (int i = 10; i >= 1; i--) {
                        System.out.println(c + " x " + i + " = " + (c * i));
                    }
                    break;
                case 5:
                    System.out.println("5. Imprimir todas las letras del alfabeto de la 'a' a la 'z'.");
                    for (char d = 'a'; d <= 'z'; d++) {
                        System.out.print(d + " ");
                    }
                    break;
                case 6:
                    System.out.println("6. Imprimir el alfabeto en orden inverso, de la 'Z' a la 'A'.");
                    for (char e = 'Z'; e >= 'A'; e--) {
                        System.out.print(e + " ");
                    }
                    break;
                case 7:
                    System.out.println("7. Imprimir todos los números pares entre 1 y 100.");
                    for (int i = 2; i <= 100; i += 2) {
                        System.out.print(i + " ");
                    }
                    break;
                case 8:
                    System.out.println("8. Imprimir todos los números impares entre 1 y 100.");
                    for (int i = 1; i <= 100; i += 2) {
                        System.out.print(i + " ");
                    }
                    break;
                case 9:
                    System.out.println("9. Encontrar la suma de todos los números naturales entre 1 y n.");
                    System.out.print("Ingrese un número n: ");
                    int f = scanner.nextInt();
                    int suma = 0;
                    for (int i = 1; i <= f; i++) {
                        suma += i;
                    }
                    System.out.println("Suma: " + suma);
                    break;
                case 10:
                    System.out.println("10. Encontrar la suma de todos los números pares entre 1 y n.");
                    System.out.print("Ingrese un número n: ");
                    int h = scanner.nextInt();
                    int suma1 = 0;
                    for (int i = 2; i <= h; i += 2) {
                        suma1 += i;
                    }
                    System.out.println("Suma: " + suma1);
                    break;
                case 11:
                    System.out.println("11. Encontrar la suma de todos los números impares entre 1 y n.");
                    System.out.print("Ingrese un número n: ");
                    int j = scanner.nextInt();
                    int suma2 = 0;
                    for (int i = 1; i <= j; i += 2) {
                        suma2 += i;
                    }
                    System.out.println("Suma: " + suma2);
                    break;
                case 12:
                    System.out.println("12. Imprimir los valores ASCII");
                    for (int i = 0; i <= 255; i++) {
                        System.out.println(i + " -> " + (char) i);
                    }
                    break;
                case 13:
                    System.out.println("13. Encontral el factorial de cualquier número.");
                    System.out.print("Ingrese un número: ");
                    int l = scanner.nextInt();
                    long factorial = 1;
                    for (int i = 1; i <= l; i++) {
                        factorial *= i;
                    }
                    System.out.println("Factorial: " + factorial);
                    break;
                case 14:
                    System.out.println("14. Calcular el valor de un número elevado a la potencia de otro.");
                    System.out.print("Ingrese la base: ");
                    int base = scanner.nextInt();
                    System.out.print("Ingrese el exponente: ");
                    int exp = scanner.nextInt();
                    long resultado = (long) Math.pow(base, exp);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 15:
                    System.out.println("15. Invertir los dígitos de un número dado. ");
                    System.out.print("Ingrese un número: ");
                    int num = scanner.nextInt();
                    int invertido = 0;
                    while (num > 0) {
                        invertido = invertido * 10 + num % 10;
                        num /= 10;
                    }
                    System.out.println("Número invertido: " + invertido);
                    break;
                case 16:
                    System.out.println("16. Calcular la suma de los dígitos de un número.");
                    System.out.print("Ingrese un número: ");
                    int num2 = scanner.nextInt();
                    int suma3 = 0;
                    while (num2 > 0) {
                        suma3 += num2 % 10;
                        num2 /= 10;
                    }
                    System.out.println("Suma de los dígitos: " + suma3);
                    break;
                case 17:
                    System.out.println("17. Verificar si un número dado es primo o no.");
                    System.out.print("Ingrese un número: ");
                    int num3 = scanner.nextInt();
                    boolean esPrimo = num3 > 1;
                    for (int i = 2; i * i <= num3; i++) {
                        if (num3 % i == 0) {
                            esPrimo = false;
                            break;
                        }
                    }
                    System.out.println(num3 + (esPrimo ? " es primo." : " no es primo."));
                    break;
                case 18:
                    System.out.println("18. Calcular el MCD (Máximo Común Divisor) de dos números dados.");
                    System.out.print("Ingrese un número: ");
                    int a1 = scanner.nextInt();
                    System.out.print("Ingrese un número: ");
                    int b1 = scanner.nextInt();
                    System.out.println("MCD: " + mcd(a1, b1));
                    break;
                case 19:
                    System.out.println("19. Ingresar números hasta que el usuario lo desee y, al final, muestre la\n" + "cantidad de números positivos, negativos y ceros ingresados.");
                    int positivos = 0, negativos = 0, ceros = 0;
                    System.out.println("Ingrese números (cierra con -999):");
                    while (true) {
                        int num4 = scanner.nextInt();
                        if (num4 == -999) break;
                        if (num4 > 0) positivos++;
                        else if (num4 < 0) negativos++;
                        else ceros++;
                    }
                    System.out.println("Positivos: " + positivos + ", Negativos: " + negativos + ", Ceros: " + ceros);
                    break;
                case 20:
                    System.out.println("20. Ingresar números hasta que el usuario lo desee y, al final, muestre el\n" + " número más grande y el más pequeño ingresados.");
                    int mayor = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
                    System.out.println("Ingrese números (cierra con -999):");
                    while (true) {
                        int num5 = scanner.nextInt();
                        if (num5 == -999) break;
                        if (num5 > mayor) mayor = num5;
                        if (num5 < menor) menor = num5;
                    }
                    System.out.println("Mayor: " + mayor + ", Menor: " + menor);
                    break;
                case 21:
                    System.out.println("21. Encontrar los números y la suma de todos los enteros entre 100 y 200 que sean\n" + "divisibles por 9.");
                    int suma4 = 0;
                    System.out.println("Números divisibles por 9 entre 100 y 200:");
                    for (int i = 100; i <= 200; i++) {
                        if (i % 9 == 0) {
                            System.out.println(i);
                            suma4 += i;
                        }
                    }
                    System.out.println("Suma total: " + suma4);
                    break;
                case 22:
                    System.out.println("22. Convertir un número binario a decimal sin usar arreglos, funciones ni bucles\n" + "while.");
                    System.out.print("Ingrese un número binario: ");
                    int binario = scanner.nextInt();
                    int decimal = 0, potencia = 1;
                    for (; binario > 0; binario /= 10) {
                        decimal += (binario % 10) * potencia;
                        potencia *= 2;
                    }
                    System.out.println("Número decimal: " + decimal);
                    break;
                case 23:
                    System.out.println("23. Verificar si un número es un Número Fuerte o no.");
                    System.out.print("Ingrese un número: ");
                    System.out.print("Ingrese un número: ");
                    int num6 = scanner.nextInt(), suma6 = 0, temp = num6;
                    while (temp > 0) {
                        suma6 += factorial(temp % 10);
                        temp /= 10;
                    }
                    System.out.println(num6 + (suma6 == num6 ? " es" : " no es") + " un Número Fuerte.");
                    break;
                case 24:
                    System.out.println("24. Convertir un número hexadecimal a decimal");
                    System.out.print("Ingrese un número hexadecimal: ");
                    String hex = scanner.nextLine();
                    System.out.println("Decimal: " + Integer.parseInt(hex, 16));
                    break;
                case 25:
                    System.out.println("25. convertir un número hexadecimal a octal.");
                    System.out.print("Ingrese un número hexadecimal: ");
                    hex = scanner.nextLine();
                    System.out.println("Octal: " + Integer.toOctalString(Integer.parseInt(hex, 16)));
                    break;
                case 26:
                    System.out.println("26. convertir un número hexadecimal a binario.");
                    System.out.print("Ingrese un número hexadecimal: ");
                    hex = scanner.nextLine();
                    System.out.println("Binario: " + Integer.toBinaryString(Integer.parseInt(hex, 16)));
                    break;
                case 27:
                    System.out.println("27. convertir un número decimal a hexadecimal.");
                    System.out.print("Ingrese un número decimal: ");
                    int decimal1 = scanner.nextInt();
                    System.out.println("Hexadecimal: " + Integer.toHexString(decimal1));
                    break;
                case 28:
                    System.out.println("28. convertir un número decimal a octal.");
                    System.out.print("Ingrese un número decimal: ");
                    decimal = scanner.nextInt();
                    System.out.println("Octal: " + Integer.toOctalString(decimal));
                    break;
                case 29:
                    System.out.println("29. cconvertir un número decimal a binario.");
                    System.out.print("Ingrese un número decimal: ");
                    decimal = scanner.nextInt();
                    System.out.println("Binario: " + Integer.toBinaryString(decimal));
                    break;
                case 30:
                    System.out.println("30. convertir un número binario a octal.");
                    System.out.print("Ingrese un número binario: ");
                    String bin = scanner.nextLine();
                    System.out.println("Octal: " + Integer.toOctalString(Integer.parseInt(bin, 2)));
                    break;
                case 31:
                    System.out.println("31. convertir un número binario a decimal.");
                    System.out.print("Ingrese un número binario: ");
                    bin = scanner.nextLine();
                    System.out.println("Decimal: " + Integer.parseInt(bin, 2));
                    break;
                case 32:
                    System.out.println("32. convertir un número binario a hexadecimal.");
                    System.out.print("Ingrese un número binario: ");
                    bin = scanner.nextLine();
                    System.out.println("Hexadecimal: " + Integer.toHexString(Integer.parseInt(bin, 2)));
                    break;
                case 33:
                    System.out.println("33. convertir un número octal a binario.");
                    System.out.print("Ingrese un número octal: ");
                    String octal = scanner.nextLine();
                    System.out.println("Binario: " + Integer.toBinaryString(Integer.parseInt(octal, 8)));
                    break;
                case 34:
                    System.out.println("34. convertir un número octal a decimal.");
                    System.out.print("Ingrese un número octal: ");
                    octal = scanner.nextLine();
                    System.out.println("Decimal: " + Integer.parseInt(octal, 8));
                    break;
                case 35:
                    System.out.println("35. convertir un número octal a hexadecimal.");
                    System.out.print("Ingrese un número octal: ");
                    octal = scanner.nextLine();
                    System.out.println("Hexadecimal: " + Integer.toHexString(Integer.parseInt(octal, 8)));
                    break;
                case 36:
                    System.out.println("36. Complento a1 de un numero en Java");
                    System.out.print("Ingrese un número entero: ");
                    int numero = scanner.nextInt();

                    String binario1 = Integer.toBinaryString(numero);
                    String complemento = obtenerComplementoA1(binario1);

                    System.out.println("Número en binario: " + binario1);
                    System.out.println("Complemento a 1: " + complemento);
                    break;
                case 37:
                    System.out.println("37. Complento a2 de un numero binario en Java");
                    System.out.print("Ingrese un número binario: ");
                    String binario2 = scanner.nextLine();

                    String complementoA2 = obtenerComplementoA2(binario2);
                    System.out.println("El complemento a 2 es: " + complementoA2);
                    break;
                case 38:
                    System.out.println("38. Iimprimir la serie de Fibonacci hasta n términos.");
                    System.out.print("Ingrese el número de términos de la serie de Fibonacci: ");
                    int k = scanner.nextInt();

                    int first = 0, second = 1;
                    System.out.println("Serie de Fibonacci hasta " + k + " términos:");

                    for (int i = 1; i <= k; i++) {
                        System.out.print(first + " ");
                        int next = first + second;
                        first = second;
                        second = next;
                    }
                    break;
                case 39:
                    System.out.println("39. Verificar si un número es un Número Fuerte o no.");
                    System.out.println("Ingrese el número que desea revisar si es fuerte");
                    String fort1 = scanner.nextLine();

                    int ver1 = 0;
                    for(int i=0; i<fort1.length(); i++){
                        int fo1 = fort1.charAt(i)-'0';

                        int sumFact1 = 1;
                        for(int x=fo1; x>0; x--){
                            sumFact1 = sumFact1*x;
                        }
                        ver1+=sumFact1;
                    }

                    if(ver1 == Integer.parseInt(fort1)){
                        System.out.println(fort1+" es un número fuerte");
                    }else{
                        System.out.println(fort1+" no es un número fuerte");
                    }
                    break;
                case 40:
                     System.out.println("40. Imprimir todos los Números Fuertes del 1 al 100000.");
                
                    for(int i=1; i<100000; i++){
                        int pruebaFuerte = 0;
                        String probar = Integer.toString(i);
                        for(int y=0; y<probar.length(); y++){
                            int prob = probar.charAt(y)-'0';

                            int sumFa = 1;
                            for(int x=prob; x>0; x--){
                                sumFa = sumFa*x;
                            }
                            pruebaFuerte += sumFa;
                            if(pruebaFuerte == Integer.parseInt(probar)){
                                System.out.println(probar);
                            }
                        }
                    }
                    break;
                case 41:
                     System.out.println("41. Imprimir todos los Números Perfectos del 1 al 10000.");
                
                    for(int i=1; i<100000; i++){
                        int verificacion = 0;
                        for(int x=1; x<10000; x++){
                            if(i%x==0 && i!=x){
                                verificacion += x;
                            }
                        }
                        if(verificacion == i){
                            System.out.println(i);
                        }
                    }
                    break;
                case 42:
                    System.out.println("42. verificar si un número es un Número Perfecto o no."); 
                    System.out.println("Ingrese el número que desea comprobar que sea perfecto");
                    int perfecto = scanner.nextInt();

                    int verif = 0;
                    for(int i=1; i<10000; i++){
                        if(perfecto%i==0 && i!= perfecto){
                            verif+=i;
                        }
                    }

                    if(perfecto == verif){
                        System.out.println(perfecto+" es un número perfecto");
                    }else{
                        System.out.println(perfecto+" no es un número perfecto");
                    }
                    break;
                case 43:
                    System.out.println("43. Imprimir todos los Números de Armstrong entre 1 y 1000.");
                    for(int p=1; p<1000; p++){
                        String toStr = Integer.toString(p);
                        int contArms = toStr.length();
                        int toArms = 0;

                        for(int i=0; i<contArms; i++){
                            int foArms = toStr.charAt(i)-'0';
                            int toFoArms =(int) Math.pow(foArms, contArms);
                            toArms += toFoArms;
                        }
                        if(toArms == Integer.parseInt(toStr)){
                            System.out.println(toStr);
                        }
                    }
                    break;
                case 44:
                    System.out.println("44. Verificar si un número es un Número de Armstrong o no.");
                    System.out.println("Ingrese el numero que desea comprobar si es de Armstrong: ");
                    String Arm = scanner.nextLine();
                    int contArm = Arm.length();

                    int toArm = 0;
                    for(int i=0; i<contArm; i++){
                        int foArm = Arm.charAt(i)-'0';
                        int toFoArm = (int) Math.pow(foArm, contArm);
                        toArm += toFoArm;
                    }       
                    if(toArm == Integer.parseInt(Arm)){
                        System.out.println(Arm+" es un número de Armstrong");
                    }else{
                        System.out.println(Arm+" no es un número de Armstrong");
                    }
                    break;
                case 45:
                    System.out.println("45. Imprimir los factores primos en Java.");
                    System.out.print("Ingrese un número entero: ");
                    int numero2 = scanner.nextInt();

                    System.out.print("Los factores primos de " + numero2 + " son: ");
                    obtenerFactoresPrimos(numero2);
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }
}
