/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainCap4;
import Capitulo4.Billing;
import Capitulo4.BirdSighting;
import Capitulo4.BloodType;
import Capitulo4.CertificateOfDeposit;
import Capitulo4.Circle;
import Capitulo4.Die;
import Capitulo4.Factor;
import Capitulo4.FormLetterWriter;
import Capitulo4.GregorianCalendar;
import Capitulo4.Patient;
import Capitulo4.Sandwich;
import Capitulo4.State;
import java.util.Scanner;

/**
 *
 * @author luisl
 */
public class Main {
    
    public static void main(String[] args) {
        FormLetterWriter flm = new FormLetterWriter();
        Scanner Sc = new Scanner(System.in);
    
        String fName,lName;
        
        System.out.println("Input your First Name:");
        fName=Sc.nextLine();
        
        flm.setfName(fName);
        
        System.out.println("Input your Last Name:");
        lName=Sc.nextLine();
        
        flm.setlName(lName);
        
        System.out.println(flm.displaySalutation());
        System.out.println(flm.displaySalutation1());
        
        int quantity;
        double discount,price;
        
        Billing bill = new Billing();
        
        System.out.println("Input price per photo book:");
        price=Sc.nextDouble();
        bill.setPrice(price);
        
        System.out.println(bill.computeBill());
        
        System.out.println("Input quantity of photo books:");
        quantity=Sc.nextInt();
        
        System.out.println(bill.computeBill(quantity));
        
        System.out.println("Input your percentage of discount:");
        discount=Sc.nextDouble();
        
        System.out.println(bill.computeBill(quantity,discount));
        
        Scanner Sc1 = new Scanner(System.in);
        
        String specie;
        int day,number;
        
        BirdSighting bd=new BirdSighting();
        
        Scanner fSpecies=new Scanner(System.in);
        
        System.out.println("Input specie:");
        specie=fSpecies.nextLine();
        bd.setSpecie(specie);
        
        System.out.println("Input day of the year:");
        day=Sc.nextInt();
        bd.setDay(day);
        
        System.out.println("Input number of seen birds:");
        number=Sc.nextInt();
        bd.setNumber(number);
        
        System.out.println("Specie: "+bd.getSpecie()+"\nNumber of seen birds: "+bd.getNumber()+"\nDay of the year: "+bd.getDay());
        
        System.out.println("Input specie:");
        specie=Sc1.nextLine();
        bd.setSpecie(specie);
        
        System.out.println("Input day of the year:");
        day=Sc.nextInt();
        bd.setDay(day);
        
        System.out.println("Input number of seen birds:");
        number=Sc.nextInt();
        bd.setNumber(number);
        
        BirdSighting bd1=new BirdSighting();
        
        BirdSighting bd2=bd1.crear(specie, number, day);
        
        System.out.println("Specie: "+bd2.getSpecie()+"\nNumber of seen birds: "+bd2.getNumber()+"\nDay of the year: "+bd2.getDay());
        
        Patient luis = new Patient (95,24,BloodType.O,Factor.POSITIVO);
        
        System.out.println("Patient ID: "+luis.getId()+"\nPatient age: "+luis.getAge()+"\nPatient blood type: "+luis.getBd().getBloodType()+"\nPatient factor: "+luis.getBd().getFactor());
        
        Sandwich br1 = new Sandwich("White",200,"Salad",50);
        Sandwich br2 = new Sandwich("Black",300,"Jam",80);
        Sandwich br3 = new Sandwich("Rye",150,"Tuna",60);
        
        System.out.println(br1.getBd().toString());
        System.out.println(br2.getBd().toString());
        System.out.println(br3.getBd().toString());
        
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        Circle c3 = new Circle();
        c2.setRadius(3.0);
        c3.setRadius(12.0);
        
        System.out.println("Circle 1: "+c1.getArea());
        System.out.println("Circle 2: "+c2.getArea());
        System.out.println("Circle 3: "+c3.getArea());
        
        double p7_1=Math.sqrt(37);
        double p7_21=Math.sin(300);
        double p7_22=Math.cos(300);
        double p7_31=Math.floor(22.8);
        double p7_32=Math.ceil(22.8);
        double p7_33=Math.round(22.8);
        int p7_41=Math.min('D', 71);
        int p7_42=Math.max('D',71);
        double p7_5=(Math.random()*20);
        
        System.out.println(p7_1);
        System.out.println(p7_21+" "+p7_22);
        System.out.println(p7_31+" "+p7_32+" "+p7_33);
        System.out.println(p7_41+" "+p7_42);
        System.out.println(p7_5);
        System.out.println("");
        System.out.println("");
        
        String name;
        int day2;
        
        Scanner month = new Scanner(System.in);
        GregorianCalendar gc = new GregorianCalendar();
        
        System.out.println("Input Month (Don't forget capital letter):");
        name=month.nextLine();
        
        System.out.println("Input day:");
        day2=month.nextInt();
        
        System.out.println("There are "+gc.search(name,day2)+" days left before the next month.");
        System.out.println("There are "+gc.yearEnd(name, day2)+" days left before next year.");
        
        Scanner deposit = new Scanner(System.in);
        Scanner dmonth = new Scanner(System.in);
        
        String month1,name1;
        int day1,cNumber;
        Double balance;
        
        System.out.println("Input your last name:");  
        name1=deposit.nextLine();
        
        System.out.println("Input certificate number:");
        cNumber=deposit.nextInt();
        
        System.out.println("Input balance: ");
        balance=deposit.nextDouble();
        
        System.out.println("Input issue month (Don't forget capital letter):");
        month1=dmonth.nextLine();
        
        System.out.println("Input issue day:");
        
        day1=deposit.nextInt();
        
        CertificateOfDeposit cert=new CertificateOfDeposit(cNumber,name1,balance,month1,day1);
        
        System.out.println("User's last name: "+cert.getlName()+"\nCertiricate number: "+cert.getNumber()+"\nBalance: "+cert.getBalance()+"\nDate: "+cert.getDay()+" of "+cert.getMonth());
        
        State state = new State("Oaxaca",3968,"Oaxaca de Juarez",263357,"Oaxaca de Juarez",263357);
        
        System.out.println("State: "+state.getnState()+" Population: "+state.getPopulation()+" Millions"+
                "\nCapital: "+state.getcCity().getName()+" Population: "+state.getcCity().getPopulation()+
                "\nMost populated city: "+state.getmPCity().getName()+" Population: "+state.getmPCity().getPopulation());
        
        Die dice1 = new Die();
        Die dice2 = new Die();
        Die dice3 = new Die();
        Die dice4 = new Die();
        Die dice5 = new Die();
        
        Die pc1 = new Die();
        Die pc2 = new Die();
        Die pc3 = new Die();
        Die pc4 = new Die();
        Die pc5 = new Die();
        
        System.out.println("Player: "+dice1.getNumber()+" "+dice2.getNumber()+" "+dice3.getNumber()+" "+dice4.getNumber()+" "+dice5.getNumber());
        System.out.println("PC: "+pc1.getNumber()+" "+pc2.getNumber()+" "+pc3.getNumber()+" "+pc4.getNumber()+" "+pc5.getNumber());
       
        
        int guests;
        
        System.out.println("Input number of guests:");
        guests=Sc.nextInt();
        
        Capítulo3.CarlysEventPrice cep = new Capítulo3.CarlysEventPrice(guests);
        
        System.out.println(cep.carlysMotto2());
        System.out.println(cep.toString());
        System.out.println(cep.isLarge());
        
        
        int minutes;
        
        System.out.println("Input minutes:");
        minutes=Sc.nextInt();
        
        Capítulo3.SammysRentalPrice total = new Capítulo3.SammysRentalPrice(minutes);
        
        System.out.println(total.motto());
        System.out.println(total.toString());
        
    }
    
}
