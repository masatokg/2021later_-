package packageMoon;

class Discovery {
    public String name = "Discovery";
    private String owner = "Kuga";
    protected String country = "PackageEarth";
    String color="white";

    public void showOwner(){
        String message = 
        String.format("%s : %s : %s", this.country, this.name, this.owner);
        System.out.println(message);
    }
}
