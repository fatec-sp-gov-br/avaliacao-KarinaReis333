class Pocao {
    private final String nome; // Adicionado final para tirar o aviso do VS Code
    private final int cura;    // Adicionado final para tirar o aviso do VS Code

    public Pocao(String nome, int cura) {
        this.nome = nome;
        this.cura = cura;
    }

    public String getNome() {
        return this.nome;
    }

    public int getCura() {
        return this.cura;
    }
}