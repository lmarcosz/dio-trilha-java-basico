public class SmartTV {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mostrarStatus(){
        System.out.println("TV ligada? " + (this.ligada ? "Sim" : "Não"));
        System.out.println("Volume: " + this.volume);
        System.out.println("Canal: " + this.canal); 
    }

    public void trocarEstado(){
        ligada = !ligada;
    }

    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }

    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }
    public void definirCanal(int canal){
        this.canal = canal;
    }

}