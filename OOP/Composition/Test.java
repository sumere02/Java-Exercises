public class Test{
    public static void main(String[] args) {
        Resolution resolution = new Resolution(1920,1080);
        Monitor monitor = new Monitor("G3","Samsung","23.7",resolution);
        CompCase comp_case = new CompCase("Shadow-Blade","Corsair","Carbon");
        MotherBoard motherboard = new MotherBoard("B250-PRO","Asus",10,"Windows 10");
        Comp computer = new Comp(monitor,motherboard,comp_case);
        
        //Accessing with reference using getters
        //Different than other languages because you can not directly access to class objects they are private
        //Inheritance IS-A Composition HAS-A
        computer.getComp_case().open_pc();
        computer.getMonitor().power_off();
        computer.getMotherboard().install_os("Ubuntu 16.04");
    }
}