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

        for(int i = 0; i < length; i++){
            array_return[i] = array[ind_min + i];
        }

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

        int[] array_return = new int[length];

        for(int i = 0; i < array1.length; i++){
            for(int j = 0; j < array2.length; j++){
                if(array2[j] == array1[i]){
                    if(!verifica_elemento(array_return, array2[j])){
                        array_return[pos] = array2[j];
                        pos++;
                    }
                }
            }
        }

        return array_return;
    }
}
