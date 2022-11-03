
public class Main {
    public static void main(String[] args) throws Exception {

        Variables var = new Variables();
        System.out.println(var.getVar_string());
        System.out.println(var.getVar_char());
        System.out.println(var.getVar_int());
        System.out.println(var.getVar_float());
        System.out.println(var.getVar_double());
        System.out.println(var.getVar_short());
        System.out.println(var.getVar_long());
        System.out.println(var.getVar_byte());
        System.out.println(var.getVar_boolean());
        var.setVar_int(var.getVar_int() + var.getVar_int());    
        
        // Operadores aritmeticos
        System.out.println("Seccion de operadores aritmeticos");
        int suma = 10 + 5;
        int resta = 10 - 5;
        int multiplicacion = 10 * 5;
        int division = 10 / 5;
        int modulo = 10 % 5;
        System.out.println("suma: " + suma);
        System.out.println("resta: " + resta);
        System.out.println("multiplicacion: " + multiplicacion);
        System.out.println("division: " + division);
        System.out.println("modulo: " + modulo);
        
        // Operadores de asignacion
        System.out.println("Seccion operadores de asignacion");
        int numero2 = 10;
        numero2 += 5;
        System.out.println("numero2 + " + numero2);
        numero2 -= 5;
        System.out.println("numero2 - " + numero2);
        numero2 *= 5;
        System.out.println("numero2 * " + numero2);
        numero2 /= 5;
        System.out.println("numero2 / " + numero2);
        numero2 %= 5;
        System.out.println("numero2 % " + numero2);

        // Operadores de comparacion
        System.out.println("Seccion operadores de comparacion");
        int numero3 = 10;
        int numero4 = 5;
        boolean comparacion = numero3 == numero4;
        boolean comparacion2 = numero3 != numero4;
        boolean comparacion3 = numero3 > numero4;
        boolean comparacion4 = numero3 < numero4;
        boolean comparacion5 = numero3 >= numero4;
        boolean comparacion6 = numero3 <= numero4;
        System.out.println("numero3 == numero4: " + comparacion);
        System.out.println("numero3 != numero4: " + comparacion2);
        System.out.println("numero3 > numero4: " + comparacion3);
        System.out.println("numero3 < numero4: " + comparacion4);
        System.out.println("numero3 >= numero4: " + comparacion5);
        System.out.println("numero3 <= numero4: " + comparacion6);
        
        // Operadores logicos
        System.out.println("Seccion operadores logicos");
        boolean verdadero = true;
        boolean falso = false;
        boolean resultado = verdadero && falso;
        boolean resultado2 = verdadero || falso;
        boolean resultado3 = !verdadero;
        System.out.println("verdadero && falso: " + resultado);
        System.out.println("verdadero || falso: " + resultado2);
        System.out.println("!verdadero: " + resultado3);

        // Operadores de incremento y decremento
        numero3++;
        numero3--;
        
        // Operadores ternarios
        System.out.println("Seccion operadores ternarios");
        int numero6 = 10;
        int numero7 = 5;
        int resultado4 = numero6 > numero7 ? numero6 : numero7;
        System.out.println(numero6 );
        System.out.println(numero7 );
        System.out.println("numero6 > numero7 ? numero6 : numero7: " + resultado4);
        
    }
}
