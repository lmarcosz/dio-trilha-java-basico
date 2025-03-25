public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTV smartTv = new SmartTV();

        smartTv.mostrarStatus();
        smartTv.trocarEstado();
        smartTv.mostrarStatus();
        
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.mostrarStatus();

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.mostrarStatus();
        smartTv.definirCanal(13);
        smartTv.mostrarStatus();

    }
}
