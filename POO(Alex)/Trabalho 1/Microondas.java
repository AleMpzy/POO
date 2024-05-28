public class Microondas{
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
            System.out.println("Microondas ligado!");
        else
            System.out.println("Microondas desligado!");
    }
}