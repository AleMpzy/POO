public class Sala{
    private Tv tv;
    private HomeTheater hometheater;
    private VideoGame videogame;

    public Sala(Tv tv, HomeTheater hometheater, VideoGame videogame){
        this.tv = tv;
        this.hometheater = hometheater;
        this.videogame = videogame;
    }

    public void ligar(){
        tv.ligar();
        hometheater.ligar();
        videogame.ligar();
    }

    public void desligar(){
        tv.desligar();
        hometheater.desligar();
        videogame.desligar();
    }
}