public class Visitatore extends Thread{
    private String nome;
    private Museo museo;


    public Visitatore() {
    }

    public Visitatore(String nome, Museo museo) {
        this.nome = nome;
        setName(this.nome);
        this.museo = museo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Museo getMuseo() {
        return this.museo;
    }

    public void setMuseo(Museo museo) {
        this.museo = museo;
    }

    public Visitatore nome(String nome) {
        setNome(nome);
        return this;
    }

    public Visitatore museo(Museo museo) {
        setMuseo(museo);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", museo='" + getMuseo() + "'" +
            "}";
    }
    

    public void run(){
            try {
                museo.entro();
                sleep(500);
                museo.esco();
                
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
}

    

