package BackEnd;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class ListaControlo implements Serializable {

    private ArrayList<EntradaSaida> listaControlo;

    public ListaControlo() {
        listaControlo = new ArrayList<>();
    }

    
    //primeiro verifica se o parque tem lugares disponiveis, se tiver vai adicionar a entrada da viatura à
    //lista controlo e decrementa o n de lugares disponiveis
    public void entradaViatura(EntradaSaida p) {
        if (p.getParque().getNumLugaresDisponiveis() == 0) {
            System.out.printf("O parque já se encontra cheio!");
        } else {
            listaControlo.add(p);
            int ndisponiveis = p.getParque().getNumLugaresDisponiveis();
            p.getParque().setNumLugaresDisponiveis(--ndisponiveis);
        }

    }
    
    //vamos percorrer a nossa lista de controlo, se a viatura for igual à viatura que queremos introduzir
    //e nao houver data de saida, é porque ainda nao saiu do parque
    public EntradaSaida obterEntrada(Viatura viatura){
        
        for(EntradaSaida e : listaControlo){
            if(e.getViatura().equals(viatura) && e.getDataSaida() == null){
                return e;
            }
        } 
        return null;  
    }
  
    //mesma coisa da entrada, mas aqui ao remover a viatura a data de saida vai ser a nossa hora atual
    //e o n de lugares disponiveis aumenta
    public void saidaViatura(EntradaSaida p) {

        if (p.getParque().getNumLugaresDisponiveis() == p.getParque().getNumLugaresMax()) {
            System.out.print("O parque está vazio!");
        } else {
            p.setDataSaida(LocalDateTime.now());
            int ndisponiveis = p.getParque().getNumLugaresDisponiveis();
            p.getParque().setNumLugaresDisponiveis(++ndisponiveis);
        }
    }

    //se a viatura ainda nao saiu de algum parque, vai ser inserida na tabela
    public ArrayList<EntradaSaida> getViaturasAtuais() {

        ArrayList<EntradaSaida> listaViaturas2 = new ArrayList<>();

        for (EntradaSaida e : listaControlo) {

            if (e.getDataSaida() == null) {
                listaViaturas2.add(e);
            }

        }
        return listaViaturas2;

    }

    //se a data que introduzirmos for igual à data dos parametros, adiciona a viatura à tabela
    public ArrayList<EntradaSaida> getViaturasPorData(LocalDate d) {

        ArrayList<EntradaSaida> listaViaturas3 = new ArrayList<>();

        for (EntradaSaida z : listaControlo) {

            if (z.getDataEntrada().toLocalDate().equals(d)) {
                listaViaturas3.add(z);
            }

        }
        return listaViaturas3;
    }

    
    //mesma coisa, só que com parque
    public ArrayList<EntradaSaida> getViaturasPorDataEParque(LocalDate d, Parque p) {

        ArrayList<EntradaSaida> listaViaturas4 = new ArrayList<>();

        for (EntradaSaida z : listaControlo) {

            if (z.getDataEntrada().toLocalDate().equals(d) && z.getParque().equals(p)) {
                listaViaturas4.add(z);
            }
        }

        return listaViaturas4;
    }

    //verificar se um parque está disponivel
    public boolean temDisponibilidade(Parque p) {

        if (p.getNumLugaresDisponiveis() == 0) {
            return false;
        } else {
            return true;

        }
    }
    
    
    
    
    

}
