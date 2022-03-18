public class Exercicio5 {
    private String[] array;

    public void Exercicio5(String[] array, int capacidade){
        this.array = new String[capacidade];
        this.array = array.clone();
    }

    private boolean pertenceArray(String[] array, int i, String elem){
        for(int j = i; j < array.length; j++){
            if(array[j].equals(elem)) return true;
        }
        return false;
    }

    public String[] semRepeticoes(){
        String[] aux = new String[this.array.length];
        int pos = 0;

        for(int i = 0; i < this.array.length; i++){
            if(!pertenceArray(this.array, i+1, this.array[i])) aux[pos++] = this.array[i];
        }

        String[] ret = new String[pos];
        System.arraycopy(aux, 0, ret, 0, pos);

        return ret;
    }

    public String maiorString(){
        String ret = "";
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < this.array.length; i++){
            if(this.array[i].length() > max){
                max = this.array[i].length();
                ret = this.array[i];
            }
        }

        return ret;
    }

    public String[] comRepetidos(){
        String[] aux = new String[this.array.length];
        int pos = 0;

        for(int i = 0; i < this.array.length; i++){
            if(pertenceArray(this.array, i+1, this.array[i])) aux[pos++] = this.array[i];
        }

        String[] ret = new String[pos];
        System.arraycopy(aux, 0, ret, 0, pos);

        return ret;
    }

    public int quantasVezes(String str){
        int ret = 0;

        for(String elem : this.array){
            if(elem.equals(str)) ret++;
        }

        return ret;
    }
}
