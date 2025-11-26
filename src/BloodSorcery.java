public class BloodSorcery extends Disciplinas{


    boolean[] poderes = new boolean[9];

    public BloodSorcery(){
        for (int i = 0; i < poderes.length; i++) {
            poderes[i] = false;
        }
    }

    public void escolherPoder(int idPoder){
        poderes[idPoder] = true;
    }
}
