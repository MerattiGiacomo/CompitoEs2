public class Museo {
    private int limite = 3;
    private int personeAttuali = 0;


    public Museo() {
    }

    public int getLimite() {
        return this.limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public int getPersoneAttuali() {
        return this.personeAttuali;
    }

    public void setPersoneAttuali(int personeAttuali) {
        this.personeAttuali = personeAttuali;
    }

    public Museo limite(int limite) {
        setLimite(limite);
        return this;
    }

    public Museo personeAttuali(int personeAttuali) {
        setPersoneAttuali(personeAttuali);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " limite='" + getLimite() + "'" +
            ", personeAttuali='" + getPersoneAttuali() + "'" +
            "}";
    }

    public synchronized void entro() throws InterruptedException{
        personeAttuali++;
        System.out.println(Thread.currentThread().getName() + " e' entrato");
        while(limite == personeAttuali){
            System.out.println(Thread.currentThread().getName() + " aspetta il tuo turno");
            wait();
        }
    }

    public synchronized void esco(){
        personeAttuali--;
        System.out.println(Thread.currentThread().getName() + " ha finito di visitare");
        notify();
    }
}
