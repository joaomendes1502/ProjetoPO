package BackEnd;

import java.io.Serializable;
import java.util.Objects;

public class Parque implements Serializable {

	private TipoParque tipo;
	private double preco;
	private String nome;
	private int numLugaresMax;
        private String codigo;
        private int numLugaresDisponiveis;
        
        //quando adicionarmos o preço ao enum TipoParque temos de tirar o preço deste construtor 
        public Parque (TipoParque tipo, String nome, int numLugaresMax, String codigo) {
            this.tipo = tipo;
            this.nome = nome;
            this.numLugaresMax = numLugaresMax;
            this.codigo = codigo;
            this.numLugaresDisponiveis = numLugaresMax;
            
            if(tipo.equals(TipoParque.LIVRE)){
                this.preco = 22.5;
            } else if (tipo.equals(TipoParque.CONDICIONADO)) {
                this.preco = 50;
            } else {
                this.preco = 100;
            }
            }

    public TipoParque getTipo() {
        return tipo;
    }

    public void setTipo(TipoParque tipo) {
        this.tipo = tipo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumLugaresMax() {
        return numLugaresMax;
    }

    public void setNumLugaresMax(int numLugaresMax) {
        this.numLugaresMax = numLugaresMax;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNumLugaresDisponiveis(int numLugaresDisponiveis) {
        this.numLugaresDisponiveis = numLugaresDisponiveis;
    }

    public int getNumLugaresDisponiveis() {
        return numLugaresDisponiveis;
    }

  

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
        final Parque other = (Parque) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }
    
    

    @Override
    public String toString() {
        return "Parque{" + "tipo=" + tipo + ", preco=" + preco + ", nome=" + nome + ", numLugaresMax=" + numLugaresMax + '}';
    }
        
        

}
