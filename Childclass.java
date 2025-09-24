public class Childclass extends parentClass{
    public void showTyres(){
        System.out.println(Tyres);
    }
    public static void main(String[] args) {
        Childclass cc = new Childclass();
        cc.brake();
        cc.showTyres();
        cc.audio();


    }
}