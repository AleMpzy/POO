public class Geladeira{
    private boolean on;

    public void ligar(){
        this.on = true;
    }

    public void desligar(){
        this.on = false;
    }

    public boolean isLigado(){
        return on;
    }

    public void observar(){
        if(this.on == true)
            System.out.println("Geladeira ligada!");
        else
            System.out.println("Geladeira desligada!");
    }
}