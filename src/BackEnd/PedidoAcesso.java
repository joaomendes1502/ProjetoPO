package BackEnd;

import java.io.Serializable;

public class PedidoAcesso implements Serializable {

	private TipoParque tipoParque;
	private Utente utente;
	private EstadoPedido estado;
        private Parque parque;
        private int num_lugar;
        
        //TipoParque, Utente, Parque e um  int num_lugar
        public PedidoAcesso (TipoParque tipoParque, Utente utente, Parque parque) {
            this.tipoParque = tipoParque;
            this.utente = utente;
            this.estado = EstadoPedido.PENDENTE;
            this.parque = parque;
        }

    public TipoParque getTipoParque() {
        return tipoParque;
    }

    public void setTipoParque(TipoParque tipoParque) {
        this.tipoParque = tipoParque;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public Parque getParque() {
        return parque;
    }
        
    public void setParque (Parque parque) {
        this.parque = parque;
    } 
    
    public int getNum_lugar() {
        return num_lugar;
    }
    
    public void setNum_lugar (int num_lugar){
        this.num_lugar = num_lugar;
    }

}

