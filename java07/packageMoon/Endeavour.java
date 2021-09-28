package packageMoon;
public class Endeavour {
    public String name = "Endeavour";
    private String owner = "Nishino";
    protected String country = "packageMoon";
    String color="black";

    public void showOwner(){
        String message = 
        String.format("%s : %s : %s", this.country, this.name, this.owner);
        System.out.println(message);
    }
}
