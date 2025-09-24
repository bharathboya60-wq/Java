public class parentClass {
    public String Tyres = "Four wheeler";
    public void color(){
        System.out.println("Color is red");
    }
    public void brake(){
        System.out.println("Brakes are oil brakes");
    }

    public void audio(){
        System.out.println("audio is dual speaker");
    }
    public static void main (String[] args)
    {
        parentClass p = new parentClass();
        p.color();
    }
    
}
