public enum EstadoBrasileiro {
    //Objetos criados dentro da classe
    SAO_PAULO("SP","São Paulo"),
    RIO_JANEIRO("RJ", "Rio de Janeiro"),
    MINAS_GERAIS("MG", "Minas Gerais"),
    ESPIRITO_SANTO("ES", "Espírito Santo");

    //Atributos
    private String nome;
    private String sigla;

    //Construtor
    private EstadoBrasileiro(String sigla, String nome){
        this.sigla = sigla;
        this.nome = nome;
    }

    //Métodos
    public String getSigla(){
        return sigla;
    }
    public String getNome(){
        return nome;
    }
    public String getNomeMaiusculo(){
        return nome.toUpperCase();
    }

}
