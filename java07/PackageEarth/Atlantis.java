package PackageEarth;

public class Atlantis {
    public String name = "Atlantis";
    private String owner = "Koide";
    protected String country = "PackageEarth";
    String color="white";

    public void showOwner(){
        String message = 
        String.format("%s : %s : %s", this.country, this.name, this.owner);
        System.out.println(message);
    }
}

