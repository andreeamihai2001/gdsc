public class Main {
    public static void main(String[] args) {

        Membru membru1 = new Membru("Mihai", "Andreea",20,3000, 5);
        Membru membru2 = new Membru("Toth", "Denisa",21,1000, 2);
        Membru membru3 = new Membru("Capaldi", "Lewis",30,5000, 3);
        Membru membru4 = new Membru("Killa", "Fonic",29,2500, 0);
        Membru lider1 = new Membru("Rus", "Florian",25,1500, 5);

        Membru membru5 = new Membru("Doja", "Cat",20,4000, 5);
        Membru membru6 = new Membru("Don", "Toliver",20,3000, 2);
        Membru membru7 = new Membru("Styles", "Harry",20,3500, 3);
        Membru membru8 = new Membru("Balan", "Andreea",20,1500, 0);
        Membru lider2 = new Membru("Rimes", "Irina",20,3500, 5);


        Echipa DevTeam = new DevTeam("Pisicile", 20);
        DevTeam.setLeader(membru4);
        DevTeam.setLeader(lider1);

        DevTeam.addMember(membru1);
        DevTeam.addMember(membru2);
        DevTeam.addMember(membru3);
        DevTeam.addMember(membru4);

        System.out.println(DevTeam.getCost());
        System.out.println(DevTeam.toString());
        DevTeam.removeMember(membru4);

        System.out.println(DevTeam.getCost());
        System.out.println(DevTeam.toString());

        Echipa HR = new HR("Catelusii", 25);
        HR.setLeader(membru8);
        HR.setLeader(lider2);

        HR.addMember(membru5);
        HR.addMember(membru6);
        HR.addMember(membru7);
        HR.addMember(membru8);

        System.out.println(HR.getCost());
        System.out.println(HR.toString());
        HR.removeMember(membru8);

        System.out.println(HR.getCost());
        System.out.println(HR.toString());




    }
}
