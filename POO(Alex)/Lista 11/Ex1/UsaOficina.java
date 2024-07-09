public class UsaOficina{
    public static void main(String[] args){
        Oficina oficina = new Oficina();
        Veiculo veiculo;

        for(int i = 0; i < 4; i++){
            veiculo = oficina.proximo();
            oficina.revisar(veiculo);
        }
    }
}

/* 
    1 - Cria oficina
    2 - Define veiculo
    3 - Puxa o metodo proximo -> Se o numero aleatorio for par ele sera um Automovel e se for impar ele sera uma Bicicleta
    4 - Puxa o metodo revisar -> Verifica, ajusta e limpar o veiculo. Seja um automovel ou uma bicicleta

 */