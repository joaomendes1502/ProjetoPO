package BackEnd;

import java.io.Serializable;

public class Sistema implements Serializable{

	private ListaUtilizador listaUtilizador;
	private ListaViaturas listaViaturas;
	private ListaParques listaParques;
	private ListaPedidos listaPedidos;
	private ListaControlo listaControlo;
        private Utilizador utilizadorligado;

    public Sistema(){
        this.listaUtilizador = new ListaUtilizador();
        this.listaViaturas = new ListaViaturas();
        this.listaParques = new ListaParques();
        this.listaPedidos = new ListaPedidos();
        this.listaControlo = new ListaControlo();
    }

    public ListaUtilizador getListaUtilizador(){
        return listaUtilizador;
    }

    public void setListaUtilizador(ListaUtilizador listaUtilizador){
        this.listaUtilizador = listaUtilizador;
    }

    public ListaViaturas getListaViaturas(){
        return listaViaturas;
    }

    public void setListaViaturas(ListaViaturas listaViaturas){
        this.listaViaturas = listaViaturas;
    }

    public ListaParques getListaParques(){
        return listaParques;
    }

    public void setListaParques(ListaParques listaParques){
        this.listaParques = listaParques;
    }

    public ListaPedidos getListaPedidos(){
        return listaPedidos;
    }

    public void setListaPedidos(ListaPedidos listaPedidos){
        this.listaPedidos = listaPedidos;
    }

    public ListaControlo getListaControlo(){
        return listaControlo;
    }

    public void setListaControlo(ListaControlo listaControlo){
        this.listaControlo = listaControlo;
    }

    public Utilizador getUtilizadorligado(){
        return utilizadorligado;
    }

    public void setUtilizadorligado(Utilizador utilizadorligado){
        this.utilizadorligado = utilizadorligado;
    }

    public boolean autenticarUtilizador(String username, String password){
        if (listaUtilizador.existeUtilizador(username)){
            try{
                Utilizador u = listaUtilizador.getUtilizador(username);
                if (u.getPassword().equals(password)){
                    utilizadorligado = u;
                    return true;
                }
            } catch (Exception e){
            }
        }
        return false;
    }
    
    public void inicializar (){
    listaUtilizador.adionarUtilizador("adm", "adm", "RuiMarianaJoão");
    //Administrador x = (Administrador) listaUtilizador.getUtilizador("admin");
    listaUtilizador.adicionarSeguranca("s1", "s1", "Rui Coelho");
    
    listaUtilizador.adicionarUtente("u1", "u1", "Mariana Araujo");
    
    Parque parque1 = new Parque (TipoParque.LIVRE, "Parque1", 100, "p1");
    listaParques.registarParque(parque1);
    Parque parque2 = new Parque (TipoParque.CONDICIONADO, "Parque2", 100, "p2");
    listaParques.registarParque(parque2);
    Parque parque3 = new Parque (TipoParque.LUGAR_ASSEGURADO, "Parque3", 100, "p3");
    listaParques.registarParque(parque3);
    
    Utente u2 = new Utente("u2", "u2", "u2");
    Utente u3 = new Utente("u3", "u3", "u3");
    Utente u4 = new Utente("u4", "u4", "u4");
    
    PedidoAcesso pedido1 = new PedidoAcesso (TipoParque.LIVRE, u2, null);
     listaPedidos.addPedido(pedido1);
    PedidoAcesso pedido2 = new PedidoAcesso (TipoParque.CONDICIONADO, u3, null);
     listaPedidos.addPedido(pedido2);
    PedidoAcesso pedido3 = new PedidoAcesso (TipoParque.LUGAR_ASSEGURADO, u4, parque3);
    listaPedidos.addPedido(pedido3);
    listaPedidos.concederLugar(pedido3);
     
     Viatura viatura1 = new Viatura ("14-41-PT", "Gasoleo", "megane", "renault");
     listaViaturas.adicionarViatura(viatura1);
     Viatura viatura2 = new Viatura ("16-36-ZM", "Eletrico", "C200", "Mercedes Benz");
     listaViaturas.adicionarViatura(viatura2);
     Viatura viatura3 = new Viatura ("33-91-SB", "Gasolina", "clio", "renault");
     listaViaturas.adicionarViatura(viatura3);
     Viatura viatura4 = new Viatura ("00-VX-07", "GPL", "V40", "VOLVO");
     listaViaturas.adicionarViatura(viatura4);
    
    }
}