package BackEnd;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class ListaViaturas implements Serializable {

    private ArrayList<Viatura> listaViaturas = new ArrayList<>();

    public void adicionarViatura(Viatura v) {
        listaViaturas.add(v);
    }

    public void removerViatura(Viatura v) {
        listaViaturas.remove(v);
    }

    //percorre a nossa lista de viaturas, verifica o tipo de combustivel e calcula a percentagem
    public float percPorTipoCombustivel(String combustivel) {

        float soma = 0;

        for (Viatura v : listaViaturas) {
            if (v.getCombustivel().equalsIgnoreCase(combustivel)) {
                soma++;
            }
        }
        return (soma / listaViaturas.size()) * 100;
    }

    //percorre a nossa lista de viaturas, verificamos pela matricula se a viatura consta no sistema, caso sim
    //retorna essa viatura
    public Viatura obterViatura(String matricula) {
        for (Viatura v : listaViaturas) {
            if (v.getMatricula().equals(matricula)) {
                return v;
            }
        }
        return null;
    }

    //mesma coisa, mas é um boleano(usado para validações)
    public boolean existeMatricula(String matricula) {
        for (Viatura v : listaViaturas) {
            if (v.getMatricula().equals(matricula)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Viatura> listarViaturas() {
        return listaViaturas;
    }

}
