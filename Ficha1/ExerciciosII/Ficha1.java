import java.time.LocalDateTime;

public class Ficha1 {
    public double celsiustoFarenheit(double degrees){
        double result = 1.8 * degrees + 32;
        return result;
    }

    public int maximoNumeros(int a, int b){
        int result = a;

        if(b>a) result = b;

        return result;
    }

    public String criaDescricaoConta(String nome, double saldo){
        String result = "Nome: " + nome + ", Saldo: " + saldo;
        return result;
    }

    public double eurosParaLibras(double valor, double taxaConversao){
        double result = valor * taxaConversao;
        return result;
    }

    public long factorial(int num){
        long result = 1;

        while(num != 0){
            result = num * result;
            num--;
        }

        return result;
    }

    public long tempoGasto(){
        LocalDateTime start = LocalDateTime.now();
        long start_time = start.getNano();
        long factorial_result = factorial(5000);
        LocalDateTime end = LocalDateTime.now();
        long end_time = end.getNano();

        return (end_time - start_time) / 1000000;
    }
}
