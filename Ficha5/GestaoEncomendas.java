import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class GestaoEncomendas {
    private Map<Integer, Encomenda> gestao;

    public GestaoEncomendas(){
        this.gestao = new TreeMap<>();
    }


    public GestaoEncomendas(Map<Integer, Encomenda> gestao){
        this.setGestao(gestao);
    }

    
    public GestaoEncomendas(GestaoEncomendas gestao_enc){
        this.gestao = gestao_enc.getGestao();
    }


    //Getters
    public Map<Integer, Encomenda> getGestao(){
        Map<Integer, Encomenda> res = new TreeMap<>();
        for(int nr : this.gestao.keySet()){
            res.put(nr, this.gestao.get(nr).clone());
        }

        return res;
    }


    //Setters
    public void setGestao(Map<Integer, Encomenda> gestao){
        this.gestao = new TreeMap<>();

        for(int nr : gestao.keySet()){
            this.gestao.put(nr, gestao.get(nr).clone());
        }
    }


    //Equals
    public boolean equals(Object o){
        if(o == this) return true;
        if(o == null || o.getClass() != this.getClass()) return false;

        GestaoEncomendas gestao = (GestaoEncomendas) o;

        return this.gestao.equals(gestao.gestao);
    }


    //Clone
    public GestaoEncomendas clone(){
        return new GestaoEncomendas(this);
    }


    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append(this.gestao.toString());

        return sb.toString();
    }


    //1
    public Set<Integer> todosCodigosEnc(){
        return new TreeSet<>(this.gestao.keySet());
    }

    //2
    public void addEncomenda(Encomenda enc){
        this.gestao.put(enc.getNEnc(), enc.clone());
    }

    //3
    public Encomenda getEncomenda(Integer codEnc){
        return this.gestao.get(codEnc).clone();
    }

    //4
    public void removeEncomenda(Integer codEnc){
        this.gestao.remove(codEnc);
    }

    //5
    public Integer encomendaComMaisProdutos(){
        int nr = 0;
        int max = INTEGER.MIN_VALUE;

        for(int ind : this.gestao.keySet()){
            int num = this.gestao.get(ind);
            if(num > max){
                max = num;
                nr = ind;
            }
        }

        return nr;
    }

    //6
    public Set<Integer> encomendasComProduto(Integer codProd){
        Set<Integer> res = new TreeSet<>();

        for(int ind : this.gestao.keySet()){
            if(ind == codProd) res.add(ind);
        }

        return res;
    }

    //7
    public Set<Integer> encomendasAposData(LocalDate d){
        Set<Integer> set = new TreeSet<>();

        for(int ind : this.gestao.keySet()){
            LocalDate d1 = this.gestao.get(ind).getData();
            if(d1.compareTo(d) > o) set.add(ind);
        }
        
        return set;
    }

    //8
    public Set<Encomenda> encomendasValorDecrescente(){
        Set<Encomenda> set = new TreeSet<>((a1,a2) -> a1.calculaValorTotal().compareTo(a2.calculaValorTotal()));

        for(int ind : this.gestao.keySet()){
            set.add(this.gestao.get(ind).clone());
        }

        return set;
    } 
}



