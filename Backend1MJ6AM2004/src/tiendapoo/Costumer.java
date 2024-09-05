package tiendapoo;

public class Costumer extends User{
    //Atributos
    String costumerType;
    int experiencePoints;

    //Metodos


    @Override
    public void createUser() {
        super.createUser();
        System.out.println("Ingrese el tipo de usuario");
        costumerType = sc.nextLine();
        System.out.println("Asigne los puntos");
        experiencePoints = sc.nextInt();
    }

    @Override
    public void selectorUsers() {
        super.selectorUsers();
    }

    @Override
    public void selectUsersByid(int Userid) {
        super.selectUsersByid(Userid);
    }

    @Override
    public void deleteUsers(int Userid) {
        super.deleteUsers(Userid);
    }
}
