import java.util.Scanner;

public class TestePrograma {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Ficha2 ficha2 = new Ficha2();

        System.out.println("Insira exercicio: ");
        int ex = sc.nextInt();

        if(ex == 1){
            System.out.println("Insira alínea: ");
            String alinea = sc.next();

            System.out.println("Indicar tamanho do array ");
            int array_size = sc.nextInt();

            int[] array = new int[array_size];
            for(int i = 0; i < array_size; i++){
                array[i] = sc.nextInt();
            }

            switch(alinea){
                case "a":
                    int minimo = ficha2.min_array(array);
                    System.out.println("Minimo : " + minimo);
                case "b":
                    System.out.println("Indique indice minimo : ");
                    int ind_min = sc.nextInt();
                    System.out.println("Indique indice maximo : ");
                    int ind_max = sc.nextInt();

                    int[] array_b = ficha2.ler_array(array, ind_min, ind_max);
                    for(int b = 0; b < array_b.length; b++){
                        System.out.print(array_b[b] + " ");
                    }
                case "c":
                    System.out.println("Indicar tamanho do array ");
                    int array_size_c = sc.nextInt();

                    int[] array_c = new int[array_size];
                    for(int i = 0; i < array_size_c; i++){
                        array_c[i] = sc.nextInt();
                    }

                    int[] array_3 = ficha2.array_comum(array, array_c);
                    for(int c = 0; c < array_3.length; c++){
                        System.out.print(array_3[c] + " ");
                    }

            }
        }

    }
}
