public class Animalism extends Disciplinas{

    boolean[] poderes = new boolean[9];

    public Animalism(){
        for (int i = 0; i < poderes.length; i++) {
            poderes[i] = false;
        }
    }

    public void escolherPoder(int idPoder){
        poderes[idPoder] = true;
    }

    //System.out.println("When Blood Bonding an animal, the vampire can make it a famulus, forming a mental link with it and facilitating the use of other Ani- malism powers. While this power alone does not allow two-way com- munication with the animal, it can follow simple verbal instructions such as “stay” and “come here. It attacks in defense of itself and its master but cannot otherwise be persuaded to fight something it would not normally attack.");
    //System.out.println("Dice Pool: Charisma + Animal Ken");


}
