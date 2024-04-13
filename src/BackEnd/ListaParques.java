package BackEnd;

import java.io.Serializable;
import java.util.ArrayList;

public class ListaParques implements Serializable{

    private ArrayList<Parque> listaParques;

    public ListaParques() {
        listaParques = new ArrayList<>();
    }

    //percorremos a nossa lista parque e verificamos se o codigo do parque é igual ao dos parametros(se consta na lista)
    public boolean existeParque(String codigo) {
        for (Parque parque : listaParques) {
            if ((parque.getCodigo().equals(codigo))) {
                 return true;
            }     
        }
        return false;
    }
    
    //se a lista ainda nao tiver os dados do parque que queremos introduzir, regista esse parque
    public void registarParque(Parque parque) {
        if (!listaParques.contains(parque)) {
             listaParques.add(parque);
        }
    }
    
    //retorna a nossa lista
    public ArrayList <Parque> listarParque(){
        return listaParques;
    }
    
    //basicamente igual ao existeParque, mas aqui vai nos devolver o parque, e não um booleano
    public Parque obterParque(String codigo){
        for(Parque p: listaParques){
            if (p.getCodigo().equals(codigo)){
                return p;
            }
        }
        return null;
    }
    
    
    public void removerParque (Parque parque) {
        if (listaParques.contains(parque)) {
             listaParques.remove(parque);
        } 
    }
    
    
    public Parque pesquisarPorCod (String codigo) {
        for (Parque parque : listaParques) {
            if ((parque.getCodigo().equals(codigo))) {
                 return parque;
            }     
        }
        return null;
    }
    
    /*public Parque pesquisarPorTipo (TipoParque tipo) {
        for (Parque parque : listaParques) {
            if ((parque.getTipo().LUGAR_ASSEGURADO)) {
                 return parque;
            }     
        }
        return null;
    }*/
    
    public ArrayList<Parque> listarParques() {
        return listaParques;
    }
    
}
