public class Membru {
    private String nume;
    private String prenume;
    private int varsta;
    private double salariu;
    private double experienta;

    Membru (String nume, String prenume, int varsta, double salariu, double experienta){
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.salariu = salariu;
        this.experienta = experienta;
    }

    public String getNume(){
        return nume;
    }
    public String getPrenume(){
        return prenume;
    }
    public int getVarsta(){
        return varsta;
    }
    public double getExperienta(){
        return experienta;
    }
    public boolean equals(Object o){
        if(!(o instanceof Membru)){
            return false;
        }

        if(o == null){
            return false;
        }
        Membru membruAux = (Membru) o;
        return this.getNume().equals(membruAux.getNume())
                && this.getPrenume().equals(membruAux.getPrenume())
                && this.getVarsta() == ((Membru)o).getVarsta()
                && this.getExperienta() == ((Membru)o).getExperienta();
    }

    @Override
    public String toString() {
        return "Membru{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", varsta=" + varsta +
                ", salariu=" + salariu +
                ", experienta=" + experienta +
                '}';
    }
}
