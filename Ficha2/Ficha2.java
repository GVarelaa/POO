public class Ficha2 {
    public int min_array(int[] array){
        int min = array[0];

        for(int i=1; i < array.length; i++){
            if(array[i] < min) min = array[i];
        }

        return min;
    }


    public int[] ler_array(int[] array, int ind_min, int ind_max){
        int length = ind_max - ind_min + 1;
        int[] array_return = new int[length];

        System.arraycopy(array, ind_min, array_return, 0, length);

        return array_return;
    }


    private boolean verifica_elemento(int[] array, int elemento){
        for(int i = 0; i < array.length; i++){
            if(array[i] == elemento) return true;
        }

        return false;
    }


    public int[] array_comum(int[] array1, int[] array2){
        int length1 = array1.length;
        int length2 = array2.length;
        int pos = 0;

        int length = length1;
        if(length2 < length1) length = length2;

        int[] array_aux = new int[length];

        for(int i = 0; i < array1.length; i++){
            for(int j = 0; j < array2.length; j++){
                if(array2[j] == array1[i]){
                    if(!verifica_elemento(array_aux, array2[j])){
                        array_aux[pos] = array2[j];
                        pos++;
                    }
                }
            }
        }

        int[] array_return = new int[pos];
        System.arraycopy(array_aux, 0, array_return, 0, length);

        return array_return;
    }


    public int soma_notas(int[][] array, int uc){
        int soma = 0;

        for(int i = 0; i < 5; i++){
            soma += array[i][uc];
        }

        return soma;
    }


    public int media_notas(int[][] array, int aluno){
        int media = 0;

        for(int i = 0; i < 5; i++){
            media += array[aluno][i];
        }

        return media/5;
    }


    public int media_uc(int[][] array, int uc){
        int media = 0;

        for(int i = 0; i < 5; i++){
            media += array[i][uc];
        }

        return media/5;
    }


    public int max_nota(int[][] array){
        int max = Integer.MIN_VALUE;

        for(int j = 0; j < 5; j++){
            for(int i = 0; i < 5; i++){
                if(array[j][i] > max) max = array[j][i];
            }
        }

        return max;
    }


    public int min_nota(int[][] array){
        int max = Integer.MIN_VALUE;

        for(int j = 0; j < 5; j++){
            for(int i = 0; i < 5; i++){
                if(array[j][i] > max) max = array[j][i];
            }
        }

        return max;
    }


    public int[] acima_nota(int[][] array, int nota){
        int[] array_aux = new int[25];
        int length = 0;

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(array[i][j] > nota){
                    array_aux[length] = array[i][j];
                    length++;
                }
            }
        }

        int[] array_return = new int[length];
        System.arraycopy(array_aux, 0, array_return, 0, length);

        return array_return;
    }
}
