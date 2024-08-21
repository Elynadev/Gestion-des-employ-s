public class Employe {
    String id;
    String nom;
    int salaire;

    public String getId() {
        return this.id;
    };

    public int getSalaire() {
        return this.salaire;
    };

    public String getNom() {
        return this.nom;
    };

    public void setNom(String name) {
        this.nom = name;
    }

    public void setId(String Id) {
        this.id = Id;
    }

    public void setSalaire(int Salaire) {
        this.salaire = Salaire;
    }

    public Employe(String Id, String name, int Salaire) {
        System.out.println("l'employé " + Id + " du nom de  : " + name + " reçoit un salaire de :" + Salaire);
    }
   
}