import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

public abstract class Echipa {
    private Membru lider;
    protected List <Membru> membri = new ArrayList<>();
    private String nume;
    private int nrMaxMembri;



    Echipa (String numeEchipa, int nrMaximMembri){
        nume = numeEchipa;
        nrMaxMembri = nrMaximMembri;
    }

    public boolean setLeader(Membru liderNou){
        if(liderNou.getExperienta() >= 5){
            this.lider = liderNou;
            return true;
        }else{
            return false;
        }

    }

    public Membru getLider() {
        return lider;
    }

    public boolean addMember(Membru member){
        if(membri.size() + 1 > nrMaxMembri){
            return false;
        }else{
            membri.add(member);
            return true;
        }
    }
    Membru removeMember(Membru member){
        for(int i = 0; i < membri.size(); i++){
            if(member.equals(membri.get(i)))
            {
                membri.remove(i);
                return member;
            }

        }
        return null;
    }

    public String toString(){

        String aux = "Lider echipa: " + lider + ", Membri: ";
        for(Membru membru: membri){
            aux += membru.toString();
        }
        return aux;
    }

    public abstract double getCost();

    public void setNrMaxMembri(int nrMaxMembri, Membru membru) {
        if(membru.equals(lider))
            this.nrMaxMembri = nrMaxMembri;
        else
            System.out.println("Nu esti lider, nu poti sa schimbi");
    }

    public void setNume (String nume, Membru membru) {
        if(membru.equals(lider))
            this.nume = nume;
        else
            System.out.println("Nu esti lider, nu poti sa schimbi");
    }


}
