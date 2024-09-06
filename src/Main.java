public class Main {
    public static void main(String[] args) {
        System.out.println("Computer Factory!");


        ComputerCase theCase = new ComputerCase("2208","Dell",
                "240");
        Monitor theMnitor = new Monitor("27inch Beast", "Acer",
                27,"2540x1140");
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus",
                4,6,"v2.44");
        PersonalComputer thePC = new PersonalComputer("2208","Dell",
                theCase, theMnitor, theMotherboard);

//        thePC.getMonitor().drawPixelAt(10,10,"red");
//        thePC.getMotherboard().loadProgram("Windows OS");
//        thePC.getComputerCase().pressPowerButton();

        thePC.powerUp();
    }
}