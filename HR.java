public class HR extends Echipa {


    HR(String numeEchipa, int nrMaximMembri) {
        super(numeEchipa, nrMaximMembri);
    }

    @Override
    public double getCost() {
        double suma;
        suma = 1350 + super.getLider().getExperienta() * 300;

        for(Membru membru:membri){
            double procent = 0;
            if(membru.getExperienta() >= 2 && membru.getExperienta() < 5) procent = 25/100;
            if(membru.getExperienta() >= 5) procent = 50/100;
            suma += 1000 + procent * 1000;
        }
        return  suma;
    }
}