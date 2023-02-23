public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
        
        System.out.println("TV Ligada ? "+ smartTv.ligada);
        System.out.println("Canal: "+ smartTv.canal);
        System.out.println("Volume: "+ smartTv.volume);

        smartTv.ligar();
        System.out.println("TV Ligada ? "+ smartTv.ligada);
        

        smartTv.desligar();
        System.out.println("Tv ligada ? "+ smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        smartTv.mudarDeCanal(13);
        System.out.println("Canal: "+ smartTv.canal); 
        System.out.println("Volume: aumentou 3 "+ smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarCanal();
        System.out.println("Canal: "+ smartTv.canal);
        System.out.println("Volume: diminuiu 3 "+ smartTv.volume);
        
        smartTv.diminuirVolume();
        smartTv.diminuirCanal();
        System.out.println("Canal: "+ smartTv.canal);
        System.out.println("Volume: diminuiu 3 "+ smartTv.volume);

        }
}
