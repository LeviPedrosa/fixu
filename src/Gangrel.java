public class Gangrel extends Clan {

    String nome = "Gangrel";

    @Override
    public void perdicao() {
        System.out.println("Vício em Sangue – quando um dos Juízes prova o Sangue de outro Cainita, é muito difícil para eles parar.");

    }

    @Override
    public void compulsao(){
        System.out.println("Julgamento – o vampiro é compelido a punir qualquer um que pareça transgredir suas crenças pessoas, tomando seu sangue como uma vingança justa pelo crime.");
    }

    @Override
    public void descreverClan() {
        System.out.println("O Clã da Caça, Assassinos, Filhos de Haqim, Sarracenos, Mediadores, Legisladores, Assamitas");
        System.out.println("Os juízes dos Banu Haqim estão divididos entre sua sede hereditária por Sangue vampírico e sua paixão pela justiça. Árbitros severos, eles são ferozmente devotados a manter um código moral e Abraçar mortais capazes de avaliar e lidar com ameaças, fazer cumprir as leis e tradições e punir transgressores.");
    }

    @Override
    public void mostrarDisciplinas() {
        System.out.println("Animalismo, Fortitude, Proteanismo");

    }
}
