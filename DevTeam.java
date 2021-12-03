public class DevTeam extends Echipa {


    DevTeam(String numeEchipa, int nrMaximMembri) {
        super(numeEchipa, nrMaximMembri);
    }

    @Override
    public double getCost() {

        double suma = 2500 + super.getLider().getExperienta() * 250;

        for(Membru membru:membri){
            double procent = 0;
            if(membru.getExperienta() >= 2 && membru.getExperienta() < 5) procent = 25/100;
            if(membru.getExperienta() >= 5) procent = 50/100;
            suma += 1500 + procent * 1500;
        }
        return  suma;
    }
}
