Voici un exemple simple d'un programme Java pour la gestion des employés qui permet d'enregistrer, de supprimer, de modifier et d'afficher des employés avec les attributs `id`, `nom`, `poste` et `salaire` :

```java
import java.util.ArrayList;
import java.util.Scanner;

class Employes {
    int id;
    String nom;
    String poste;
    double salaire;

    Employes(int id, String nom, String poste, double salaire) {
        this.id = id;
        this.nom = nom;
        this.poste = poste;
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nom: " + nom + ", Poste: " + poste + ", Salaire: " + salaire;
    }
}

public class GestionEmploye {
    static ArrayList<Employe> employes = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nMenu de gestion des employés :");
            System.out.println("1. Enregistrer un employé");
            System.out.println("2. Supprimer un employé");
            System.out.println("3. Modifier un employé");
            System.out.println("4. Afficher tous les employés");
            System.out.println("5. Quitter");
            System.out.print("Choisissez une option : ");
            int choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    enregistrerEmploye();
                    break;
                case 2:
                    supprimerEmploye();
                    break;
                case 3:
                    modifierEmploye();
                    break;
                case 4:
                    afficherEmployes();
                    break;
                case 5:
                    System.out.println("Sortie du programme...");
                    System.exit(0);
                default:
                    System.out.println("Option invalide.");
            }
        }
    }

    public static void enregistrerEmploye() {
        System.out.print("Entrez l'ID : ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consomme la nouvelle ligne
        System.out.print("Entrez le nom : ");
        String nom = scanner.nextLine();
        System.out.print("Entrez le poste : ");
        String poste = scanner.nextLine();
        System.out.print("Entrez le salaire : ");
        double salaire = scanner.nextDouble();

        Employe employe = new Employe(id, nom, poste, salaire);
        employes.add(employe);
        System.out.println("Employé enregistré avec succès.");
    }

    public static void supprimerEmploye() {
        System.out.print("Entrez l'ID de l'employé à supprimer : ");
        int id = scanner.nextInt();
        Employe employeASupprimer = null;

        for (Employe e : employes) {
            if (e.id == id) {
                employeASupprimer = e;
                break;
            }
        }

        if (employeASupprimer != null) {
            employes.remove(employeASupprimer);
            System.out.println("Employé supprimé avec succès.");
        } else {
            System.out.println("Employé introuvable.");
        }
    }

    public static void modifierEmploye() {
        System.out.print("Entrez l'ID de l'employé à modifier : ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consomme la nouvelle ligne
        Employe employeAModifier = null;

        for (Employe e : employes) {
            if (e.id == id) {
                employeAModifier = e;
                break;
            }
        }

        if (employeAModifier != null) {
            System.out.print("Entrez le nouveau nom : ");
            String nom = scanner.nextLine();
            System.out.print("Entrez le nouveau poste : ");
            String poste = scanner.nextLine();
            System.out.print("Entrez le nouveau salaire : ");
            double salaire = scanner.nextDouble();

            employeAModifier.nom = nom;
            employeAModifier.poste = poste;
            employeAModifier.salaire = salaire;

            System.out.println("Employé modifié avec succès.");
        } else {
            System.out.println("Employé introuvable.");
        }
    }

    public static void afficherEmployes() {
        if (employes.isEmpty()) {
            System.out.println("Aucun employé enregistré.");
        } else {
            System.out.println("Liste des employés :");
            for (Employe e : employes) {
                System.out.println(e);
            }
        }
    }
}
```

### Explication :
- **Enregistrement d'un employé** : Permet d'ajouter un nouvel employé à la liste `employes`.
- **Suppression d'un employé** : Supprime un employé en fonction de son `id`.
- **Modification d'un employé** : Permet de modifier les détails d'un employé existant.
- **Affichage des employés** : Affiche tous les employés enregistrés dans le système.

Le programme tourne dans une boucle infinie, permettant à l'utilisateur de continuer à effectuer des opérations jusqu'à ce qu'il choisisse de quitter le programme.
