public class Array20 {
    public static void main(String[] args) {
        //20. Un vector de caracteres de 100 elementos está cargado con vocales de manera aleatoria. Contar e imprimir el número de veces que aparece cada vocal. Nota: se puede utilizar un vector de frecuencias de repetición para las 5 vocales.

        char[] vocales = new char[100];
        int[] frecuencias = new int[5]; // Índices: 0 - 'a', 1 - 'e', 2 - 'i', 3 - 'o', 4 - 'u'

        // Rellenar el array con vocales aleatorias
        for (int i = 0; i < vocales.length; i++) {
            int randomIndex = (int) (Math.random() * 5);
            switch (randomIndex) {
                case 0:
                    vocales[i] = 'a';
                    break;
                case 1:
                    vocales[i] = 'e';
                    break;
                case 2:
                    vocales[i] = 'i';
                    break;
                case 3:
                    vocales[i] = 'o';
                    break;
                case 4:
                    vocales[i] = 'u';
                    break;
            }
        }

        // Contar las frecuencias de cada vocal
        for (char vocal : vocales) {
            switch (vocal) {
                case 'a':
                    frecuencias[0]++;
                    break;
                case 'e':
                    frecuencias[1]++;
                    break;
                case 'i':
                    frecuencias[2]++;
                    break;
                case 'o':
                    frecuencias[3]++;
                    break;
                case 'u':
                    frecuencias[4]++;
                    break;
            }
        }

        // Imprimir los resultados
        System.out.println("Frecuencia de cada vocal:");
        System.out.println("a: " + frecuencias[0]);
        System.out.println("e: " + frecuencias[1]);
        System.out.println("i: " + frecuencias[2]);
        System.out.println("o: " + frecuencias[3]);
        System.out.println("u: " + frecuencias[4]);
    }
}
