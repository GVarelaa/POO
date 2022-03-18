import java.time.LocalDate;

public class Exercicio3 {
    private LocalDate[] datas; // Array de datas
    private int capacidade; // Capacidade do array
    private int indice; // Indice do ultimo elemento

    public Exercicio3(){
        this.capacidade = 10;
        this.datas = new LocalDate[this.capacidade];
        this.indice = 0;
    }

    private void duplicaArray(){
        LocalDate[] novoArray = new LocalDate[this.capacidade*2];
        System.arraycopy(this.datas, 0, novoArray, 0, this.capacidade);
        this.capacidade = this.capacidade*2;
    }

    public void insereData(LocalDate data){
        if(this.capacidade == this.indice) this.duplicaArray();

        this.datas[this.indice] = data;
        this.indice++;
    }

    public LocalDate dataMaisProxima(LocalDate data){
        LocalDate min = this.datas[0];

        for(int i = 1; i < this.indice; i++){
            if(Math.abs(this.datas[i].compareTo(data)) < Math.abs(min.compareTo(data))){
                min = this.datas[i];
            }
        }

        return min;
    }

    public String toString(){
        String string = "";

        for(int i = 0; i < this.indice; i++){
            string = string + this.datas[i].toString() + " ";
        }

        return string;
    }

}























