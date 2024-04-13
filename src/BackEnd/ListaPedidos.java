package BackEnd;

import java.io.Serializable;
import java.util.ArrayList;


public class ListaPedidos implements Serializable {
    private ArrayList<PedidoAcesso> listaPedidos; 
    
    public ListaPedidos(){
        listaPedidos = new ArrayList<>();
    }
    
    public void addPedido(PedidoAcesso p){
        listaPedidos.add(p); 
    }
    
    
    //percorre a nossa lista de pedidos, como um utente pode efetuar mais de um pedido, se esse utente já estiver
    //feito um pedido e esse for aprovado, remove o pedido e substitui pelo novo
    public void aprovarPedidoAcesso(PedidoAcesso pedido){
        for(PedidoAcesso p : listaPedidos){
            if(p.getUtente().equals(pedido.getUtente()) && p.getEstado().equals(EstadoPedido.APROVADO)){
                listaPedidos.remove(p);
            }
        }
        pedido.setEstado(EstadoPedido.APROVADO);
    }
    
    //mesma coisa do outro
    public void recusarPedido(PedidoAcesso pedido){
        for(PedidoAcesso p : listaPedidos){
            if(p.getUtente().equals(pedido.getUtente()) && p.getEstado().equals(EstadoPedido.APROVADO)){
                listaPedidos.remove(p);
            }
        }
        pedido.setEstado(EstadoPedido.RECUSADO);
    }
    
    
  
    //como temos de atribuir um numero se o parque for do tipo assegurado, vamos percorrer a nossa lista de pedidos
    //e caso o pedido esteja aprovado, atribui um numero
    public void concederLugar(PedidoAcesso pedido){
        int contador = 0; //Numero de pessoas que ja tem acesso ao parque do pedido dado como argumento
        for(PedidoAcesso p : listaPedidos){
            if(p.getEstado().equals(EstadoPedido.APROVADO) && p.getParque().equals(pedido.getParque())){
                contador++;
            }
        }
        pedido.setNum_lugar(contador+1);  
    }
    
    //verifica o estado do pedido
    public EstadoPedido verEstadoPedido(PedidoAcesso pedido){
        return pedido.getEstado();
    }
    
    //lista os pedidos por estado
    public ArrayList<PedidoAcesso> listarPedidosPorEstado(EstadoPedido estado){
        ArrayList<PedidoAcesso> pedidos = new ArrayList<>();
        for(PedidoAcesso p : listaPedidos){
            if(p.getEstado().equals(estado)){
                pedidos.add(p);
            }
        }
        return pedidos; 
    }
    
    //calcula o valor gerado dos parques, este valor so é adicionado se o pedido for aprovado
    public double calcValorGlobal(){
        double total = 0; 
        for(PedidoAcesso p : listaPedidos){ //Percorre a lista de pedidos
            if(p.getEstado().equals(EstadoPedido.APROVADO)){
                if(p.getTipoParque().equals(TipoParque.LIVRE)){
                    total += 22.5; //total = total + 22.5
                }else if(p.getTipoParque().equals(TipoParque.CONDICIONADO)){
                    total += 50; 
                } else{
                    total += 100; 
                }
            }
        }
        return total; 
    }
    
    //calcula o valor por tipo de parque, o pedido precisa de ser aprovado pelo administrador tambem
    public double calcValorPorTipo(TipoParque tipo){
        double total = 0; 
        double preco; 
        if(tipo.equals(TipoParque.LIVRE)){
            preco = 22.5;
        }else if(tipo.equals(TipoParque.CONDICIONADO)){
            preco = 50; 
        } else{
            preco = 100; 
        }
        for(PedidoAcesso p : listaPedidos){ //Percorre a lista de pedidos
            if(p.getEstado().equals(EstadoPedido.APROVADO)){
                if(p.getTipoParque().equals(tipo)){
                    total += preco;
                }
            }
        }
        return total; 
    }
    
    //verifica se uma matricula tem acesso a um parque
    public boolean temAcesso(String matricula, Parque parque){
        TipoParque tipo = parque.getTipo(); 
        //se for assegurado temos que verificar o parque, tal como diz no enunciado
        //se 2 parques forem assegurados, ele só vai ter acesso ao parque que escolheu no solicitar compra
        //mas caso um parque for livre ou condicionado, ele vai ter acesso a todos os parques desses tipos
        if(tipo.equals(TipoParque.LUGAR_ASSEGURADO)){
            for(PedidoAcesso p : listaPedidos){
                if(p.getTipoParque().equals(tipo) && p.getParque().equals(parque)){
                    ArrayList<Viatura> viaturas = p.getUtente().getViatura(); 
                    for(Viatura v : viaturas){
                        if(v.getMatricula().equals(matricula)){
                            return true;  
                    }
                }
                }
            }
            return false;
        }else{
            for(PedidoAcesso p : listaPedidos){
                if(p.getTipoParque().equals(tipo)){
                    ArrayList<Viatura> viaturas = p.getUtente().getViatura(); 
                    for(Viatura v : viaturas){
                        if(v.getMatricula().equals(matricula)){
                            return true;  
                    }
                }
                }
            }
            return false;
        }     
    }
    
    //percorre a nossa lista de pedidos, se o pedido for feito por aquele utente(verificamos pelo username),
    //retorna esse pedido
    public PedidoAcesso pesquisarPorUtente (String username) {
        for (PedidoAcesso pedido : listaPedidos) {
            if ((pedido.getUtente().getUsername().equals(username))) {
                 return pedido;
            }     
        }
        return null;
    }
    
}
