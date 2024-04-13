package BackEnd;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class EntradaSaida implements Serializable{

	private LocalDateTime dataEntrada;
	private LocalDateTime dataSaida;
	private Viatura viatura;
	private Parque parque;

    public EntradaSaida(LocalDateTime dataEntrada, Viatura viatura, Parque parque) {
        this.dataEntrada = dataEntrada;
        this.dataSaida = null;
        this.viatura = viatura;
        this.parque = parque;
    }

    public LocalDateTime getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDateTime dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public LocalDateTime getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(LocalDateTime dataSaida) {
        this.dataSaida = dataSaida;
    }

    public Viatura getViatura() {
        return viatura;
    }

    public void setViatura(Viatura viatura) {
        this.viatura = viatura;
    }

    public Parque getParque() {
        return parque;
    }

    public void setParque(Parque parque) {
        this.parque = parque;
    }

    @Override
    public String toString() {
        return "EntradaSaida{" + "dataEntrada=" + dataEntrada + ", dataSaida=" + dataSaida + ", viatura=" + viatura + ", parque=" + parque +'}';
    }

        
}