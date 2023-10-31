package Cas4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

interface Imartaon {
    Atleticar najdobrovrmer();

    int atletiucariod(String s);

}

class Atleticar {
    private String name;
    private String gender;
    int age;
    double time;
    private String country;

    public Atleticar() {
    }

    public Atleticar(String name, String gander, int age, double time, String country) {
        this.name = name;
        this.gender = gander;
        this.age = age;
        this.time = time;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public double getTime() {
        return time;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return name + " " + age + " " + country + "  " + time;
    }
}

class Maraton implements Imartaon {
    public String place;
    public short year;
    private Atleticar[] runers;

    public Maraton() {
    }

    public Maraton(String place, short year, Atleticar[] runers) {
        this.place = place;
        this.year = year;
        this.runers = runers;
    }

    @Override
    public Atleticar najdobrovrmer() {
        double min = runers[0].getTime();//za da ja dava najgolemata vrednost za double
        int index = 0;
        for (int i = 1; i < runers.length; i++) {
            if (runers[i].getTime() < min) {
                min = runers[i].getTime();
                index = i;
            }
        }
        return runers[index];//vraka referenca
    }

    @Override
    public int atletiucariod(String s) {
        int number = 0;
        for (int i = 0; i < runers.length; i++) {
            if (s.compareTo(runers[i].getCountry()) == 0) {
                number++;
            }
        }
        return number;
    }
    @Override
    public String toString(){
        StringBuilder s= new StringBuilder(new String());
        s = new StringBuilder("Place: " + place + '\n' + "Year: " + year + '\n');
        s.append("Atlests: ").append(runers.length).append("\n");
        for (int i=0;i<runers.length;i++){
            s.append(runers[i]).append("\n");
        }
        return s.toString();
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());

        
        //line Dragan M 34 3454 Macedonia
        Atleticar atleticari[]=new Atleticar[n];

        for (int i = 0; i < n; i++) {
            String line =input.readLine();
            String[] niza = line.split("\\s+");
            String ime = niza[0];
            String pol = niza[1];
            int godini = Integer.parseInt(niza[2]);
            double time = Double.parseDouble(niza[3]);
            String drzava = niza[4];
            atleticari[i]=new Atleticar(ime,pol,godini,time,drzava);//niza od obiekti
        }
          Maraton s =new Maraton("Skopje", (short) 2023,atleticari);
        System.out.println(s);
        System.out.println("Najdobar atleticar e : "+ s.najdobrovrmer());
        System.out.println("Vnesi drzava: ");
        String drzava=input.readLine();
        System.out.println("Najdeni se: "+ s.atletiucariod(drzava));
    }
}
