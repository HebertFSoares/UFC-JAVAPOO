package ufc;
public class main {
    public static void main(String[] args) {
        Lutador l []= new Lutador[6]; 
        l[0] = new Lutador("Perty Boy", "Franca" , 31, 1.75f, 68.9f, 11, 2, 1);
        l[1] = new Lutador("Putscript" , "Brasil", 29, 1.68f, 57.8f, 12, 2, 1);
        l[2] = new Lutador("Bertinho", "Brasil" , 18, 1.87f, 65.6f, 12,0,0); 
        
        
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[1], l[2]);
        UEC01.lutar();
        l[1].Status();
        l[2].Status();
        
    }
    
}
