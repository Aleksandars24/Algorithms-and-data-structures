package Cas3;

interface Device{
    public String LED="LED";
    public float getPrice();
    public void printDescription();
}
interface Electric extends Device{
    public int getNumberofValue();
}
abstract class Computer implements Electric{
    public String standard;
public int  HDD;
public int CPU;
abstract public String OS();

    public Computer() {
    }

    public Computer(int HDD, int CPU, String standard) {
        this.standard=standard;
        this.HDD = HDD;
        this.CPU = CPU;
    }

    public int getHDD() {
        return HDD;
    }

    public void setHDD(int HDD) {
        this.HDD = HDD;
    }

    public int getCPU() {
        return CPU;
    }

    public void setCPU(int CPU) {
        this.CPU = CPU;
    }

    @Override
    public String toString() {
        return "Computer " +
                "standard='" + standard + '\'' +
                ", HDD=" + HDD +
                ", CPU=" + CPU+ "\n";
    }
}

class DesktopPC extends Computer{

    public String CaseType;

    public DesktopPC(String caseType) {
        CaseType = caseType;
    }

    public DesktopPC(int HDD, int CPU, String standard, String caseType) {
        super(HDD, CPU, standard);
        CaseType = caseType;
    }

    public DesktopPC() {

    }

    @Override
    public float getPrice() {
        return 850;
    }

    @Override
    public void printDescription() {
        System.out.println("DesktopPc\n");
    }

    @Override
    public int getNumberofValue() {
        if(standard.equals("USE")){
            return  120;
        }
         else
             return 220;
    }

    @Override
    public String OS() {
        return "Windows 11";
    }

    public String getCaseType() {
        return CaseType;
    }

    @Override
    public String toString() {
        String a= new String();
         a=super.toString();
         a=a + getCaseType() +"case\n";
         return a;
    }
}
class Laptop extends Computer {


    public Laptop(int HDD, int CPU, String standard) {
        super(HDD, CPU, standard);
    }

    @Override
    public float getPrice() {
        return 1200;
    }

    @Override
    public void printDescription() {
        System.out.println("Laptop\n");
    }

    @Override
    public int getNumberofValue() {
        if(standard.equals("USE")){
            return  120;
        }
        else
            return 220;
    }
    @Override
    public String OS() {
        return "Windows 11";
    }

}
public class Nasleduvajne {
    public static void main(String[] args) {
    DesktopPC pc1= new DesktopPC(300,550,"USA","Tower");
        //System.out.println(pc1);//adresa na obiektot
        System.out.println(pc1.toString());
    Computer computer[];
    computer=new Computer[10];
    computer[0]=new DesktopPC();
    int brDeskotp=0;
    int brLaptops=0;
    for (int i=0;i<10;i++){
        if(computer[i] instanceof DesktopPC){
            brDeskotp++;
        }
        else {
            brLaptops++;
        }
    }

    }
}