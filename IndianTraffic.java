public class IndianTraffic implements CentralTraffic{
    public static void main(String[] args)
    {
            CentralTraffic IT = new IndianTraffic();
            IT.Green();
            IT.Red();
            IT.Yellow();
            IndianTraffic IT1 = new IndianTraffic();
            IT1.Zebracrossing();
    }

    public void Zebracrossing(){
        System.out.println("This is the Zebra Crossing");
    }

    @Override
    public void Red() {
        System.out.println("Printed Red");
    }

    @Override
    public void Green() {
        System.out.println("Printed Green");
    }

    @Override
    public void Yellow() {
        System.out.println("Yellow");
    }
}
