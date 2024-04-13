package BackEnd;

import java.io.Serializable;
import java.util.ArrayList;

public class Utente extends Utilizador implements Serializable {

	private ArrayList <Viatura> viaturasUtente;
        

         public Utente (String username, String password, String nome) {
            super(username, password, nome);
            this.viaturasUtente = new ArrayList<>();
         }

         
         
    public ArrayList <Viatura> getViatura() {
        return viaturasUtente;
    }

    public void adicionarViatura (Viatura viatura) {
        if (!viaturasUtente.contains(viatura)) {
            viaturasUtente.add(viatura);
        }
    }
    
    public void removerViatura(Viatura viatura) {
        if(viaturasUtente.contains(viatura)){
            viaturasUtente.remove(viatura);
        }
    }
    
    public Viatura procurarViatura(String matricula)  {
        for(Viatura v : viaturasUtente){
            if(v.getMatricula().equals(matricula)){
                return v;
            }
        }
        return null;
    }
    
    
   
         
         
}

