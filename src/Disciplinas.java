abstract class Disciplinas implements Disciplina {
    int id;
    String nome;
    int nivel;
    int nivelNgasto;

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public int getNivel() {
        return 0;
    }

    @Override
    public String getNome() {
        return "";
    }

    @Override
    public void addNivel() {

    }

    @Override
    public void subNivel() {

    }

    @Override
    public int getNivelNgasto() {
        return 0;
    }

    @Override
    public void addNivelNgasto() {

    }

    @Override
    public void subNivelNgasto() {

    }

    @Override
    public void getHabilidades() {

    }
}
