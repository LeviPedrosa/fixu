public class Celerity extends Disciplinas{

    boolean[] poderes = new boolean[9];

    public Celerity(){
        for (int i = 0; i < poderes.length; i++) {
            poderes[i] = false;
        }
    }

    public void escolherPoder(int idPoder){
        poderes[idPoder] = true;
    }

}
