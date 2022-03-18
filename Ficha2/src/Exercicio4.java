public class Exercicio4 {
    private int[] array;

    public void Exercicio4(int[] array, int capacidade){
        this.array = new int[capacidade];
        this.array = array.clone();
    }

    private void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public void ordenaArray(){
        for(int i = 0; i < this.array.length; i++){
            for(int j = 0; j < this.array.length - i; j++){
                if(this.array[j] > this.array[j+1]) swap(this.array, j, j+1);
            }
        }
    }

    public boolean procuraBin(int elem){
        int inicio = 0;
        int fim = this.array.length - 1;
        int meio = (inicio + fim) / 2;

        while(inicio <= fim){
            if(this.array[meio] == elem) return true;
            else if(this.array[meio] > elem) inicio = meio;
            else fim = meio;

            meio = (inicio + fim) / 2;
        }

        return false;
    }
}
