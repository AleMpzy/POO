public class Robo implements Falante{
    @Override
    public void falar(){
        System.out.println("Hi, I'm a robot!");
    }

    @Override
    public String seuIdioma(){
        return "English";
    }

    public void reboot(){
        System.out.println("Rebooting...");
    }
}