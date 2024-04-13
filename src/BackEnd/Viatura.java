package BackEnd;

import java.io.Serializable;
import java.util.Objects;

public class Viatura implements Serializable {

	private String matricula;
	private String combustivel;
	private String modelo;
	private String marca;
        
        public Viatura (String matricula, String combustivel, String modelo, String marca) {
            this.matricula = matricula;
            this.combustivel = combustivel;
            this.modelo = modelo;
            this.marca = marca;
        }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    /*@Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }*/

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Viatura other = (Viatura) obj;
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        return true;
    }
    
    

    @Override
    public String toString() {
        return "Viatura{" + "matricula=" + matricula + ", combustivel=" + combustivel + ", modelo=" + modelo + ", marca=" + marca + '}';
    }

        
}