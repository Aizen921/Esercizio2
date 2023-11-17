public class Auto {
    public String cilindrata;

    public String targa;

    public String marca;

    public String modello;

    public Auto(String cilindrta, String targa, String marca, String modello){
        this.cilindrata=cilindrta;
        this.targa=targa;
        this.marca=marca;
        this.modello=modello;
    }

    public String getCilindrata(){
        return cilindrata;
    }
    public String getTarga(){
        return targa;
    }

    public String getMarca(){
        return marca;
    }

    public String getModello(){
        return modello;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "cilindrata='" + cilindrata + '\'' +
                ", targa='" + targa + '\'' +
                ", marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                '}';
    }
}
