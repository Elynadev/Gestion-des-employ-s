import java.util.ArrayList;
import java.util.Scanner;

public class gestion {
    public static void main(String[] args) {

        Scanner matri = new Scanner(System.in);
        // id
        System.out.println("entrer l' id  de l'employé");
        String Id = matri.nextLine();

        // nom
        System.out.println("entrer le nom  de l'employé");
        String Nom = matri.nextLine();
        // System.out.println(Nom);
        // sailre
        System.out.println("entrer le  salaire  de l'employé");
        int gain = matri.nextInt();
        // System.out.println(gain);

        Employe agent = new Employe(Id, Nom, gain);
        agent.setId(Id);
        agent.setNom(Nom);
        agent.setSalaire(gain);
        System.out.println(agent.getId());

        // string[] emplois = {};
        ArrayList<Employe> gar = new ArrayList<Employe>();
        gar.add(agent);

        // System.out.print(gain);

        // for (int i = 0; i < 5; i++) {
        // System.out.println(agent.toString());
        // }
        for (Employe user : gar) {
            System.out.print("id de l'employé est :" + user.id);
            System.out.print(user.nom);
            System.out.print(user.salaire);
            System.out.print(user);
        }
    }
}
