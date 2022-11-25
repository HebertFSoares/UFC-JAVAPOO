package ufc;

import java.util.Random;

public class Luta {
    private Lutador desafidado; 
    private Lutador desafiante; 
    private int rounds;
    private boolean aprovada;
    
    public void marcarLuta(Lutador l1, Lutador l2){
      if (l1.getCategoria().equals(l2.getCategoria())&& l1 != l2){
          this.aprovada = true;
          this.setDesafidado(l1);
          this.setDesafiante(l2);
      }else{
          this.aprovada = false;
          this.setDesafidado(null);
          this.setDesafiante(null);
      }
    }
    public void lutar(){
        if (this.aprovada){
            System.out.println("--- #DESAFIADO# ---");
            this.desafidado.apresentar();
            System.out.println("--- #DESAFIANTE# ---");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            System.out.println("====== RESULTADO DA LUTA ======");
            switch(vencedor){
                case 0:
                    System.out.println("Empate!");
                    this.desafidado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("VENCEU O " + this.desafidado.getNome());
                    this.desafidado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("VENCEU O " + this.desafiante.getNome());
                    this.desafidado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
            System.out.println("===================");
        }else{
            System.out.println("Luta Nao Aprovada!");
        }
    }

    public Lutador getDesafidado() {
        return desafidado;
    }

    public void setDesafidado(Lutador desafidado) {
        this.desafidado = desafidado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
    
}
