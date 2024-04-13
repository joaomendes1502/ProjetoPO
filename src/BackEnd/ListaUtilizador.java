package BackEnd;

import java.io.Serializable;
import java.util.ArrayList;

public class ListaUtilizador implements Serializable {

	private ArrayList<Utilizador> listaUtilizadores = new ArrayList<>();
       
        public ArrayList<Seguranca> listaSegurancas(){
            ArrayList<Seguranca> listaSeguranca = new ArrayList<>();
            for (Utilizador u: listaUtilizadores){
                if (u instanceof Seguranca){
                    listaSeguranca.add((Seguranca) u);
                }
            }
            return listaSeguranca;
        }
        
        public void adionarUtilizador (String username, String password, String nome) {
            Utilizador u = new Utilizador (username, password, nome);
            listaUtilizadores.add(u);
        }
        
        public void adicionarUtente (String username, String password, String nome) {
            Utente u = new Utente (username, password, nome);
            listaUtilizadores.add(u);
        }
        
        public void adicionarSeguranca(String username, String password, String nome){
            Seguranca s = new Seguranca(username, password, nome);
            //fazer validaçoes no frontend
            listaUtilizadores.add(s);
        }
        
        public void removerSeguranca(String username){
            for(int i=0; i<listaUtilizadores.size(); i++) {
                Utilizador u = listaUtilizadores.get(i);
                if(u.getUsername().equals(username))
                    listaUtilizadores.remove(u);
            }
                
        }
        
        public boolean existeUtilizador(String username) {
            for (Utilizador u : listaUtilizadores) {
                if (u != null && u.getUsername().equals(username)) {
                    return true;
                }
            }
            return false;
        }
        
        public Utilizador getUtilizador(String username) {
            for (Utilizador u : listaUtilizadores) {
                if (u != null && u.getUsername().equals(username)) {
                    return u;
                }
            }
            return null;
        }
}
