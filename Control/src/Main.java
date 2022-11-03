public class Main {
    public static void main(String[] args) throws Exception {

        // seccion if
        System.out.println("Seccion IF");
        int numero = 10;
        if (numero == 10) {
            System.out.println("El numero es 10");
        } else if (numero == 5) {
            System.out.println("El numero es 5");
        } else {
            System.out.println("El numero no es 10 ni 5");
        }

        // seccion while
        System.out.println("Seccion WHILE");
        int numero3 = 0;
        while (numero3 < 10) {
            System.out.println("El numero es: " + numero3);
            numero3++;
        }

        // seccion do while
        System.out.println("Seccion DO WHILE");
        int numero4 = 0;
        do {
            System.out.println("El numero es: " + numero4);
            numero4++;
        } while (numero4 < 10);
        
        // seccion  for
        System.out.println("Seccion FOR");
        for (int i = 0; i < 10; i++) {
            System.out.println("El numero es: " + i);
        }

        // for each
        System.out.println("Seccion FOR EACH");
        String[] nombres = { "Juan", "Pedro", "Maria" };
        for (String nombre : nombres) {
            System.out.println("El nombre es: " + nombre);
        }

        // seccion switch
        System.out.println("Seccion SWITCH");
        int numero2 = 10;
        switch (numero2) {
            case 10:
                System.out.println("El numero es 10");
                break;
            case 5:
                System.out.println("El numero es 5");
                break;
            default:
                System.out.println("El numero no es 10 ni 5");
                break;
        }

        // seccion break
        System.out.println("Seccion BREAK");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("El numero es: " + i);
        }

        // seccion continue
        System.out.println("Seccion CONTINUE");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println("El numero es: " + i);
        }
    }

}
