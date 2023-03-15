package Player;

import java.util.Scanner;

public  class SpecialFunc{
    Scanner scan = new Scanner(System.in);

    // code for clear function
    public  void cls()
    {
        try
        {
            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        }catch(Exception E)
        {
            System.out.println(E);
        }
    }
    public String getAny(){
        String str = scan.nextLine();
        return str;
    }
    public int getNumber(){
        String str = scan.nextLine();
        int number;
        try{
            number = Integer.parseInt(str);
        }
        catch (Exception e){
            System.out.println("Check your input");
            number = getNumber();
        }
        return number;
    }

    public int getNumber(int upBound){
        String str = scan.nextLine();
        int number;
        try{
            number = Integer.parseInt(str);
        }
        catch (Exception e){
            System.out.println("Check your input and re-enter it!");
            number = getNumber();
        }
        if(number>upBound){
            System.out.printf("Your input must smaller than %1$d%n",upBound);
            number = getNumber(upBound);
        }
        return number;
    }

    public int getNumber(int downBound, int upBound){
        String str = scan.nextLine();
        int number;
        try{
            number = Integer.parseInt(str);
        }
        catch (Exception e){
            System.out.println("Check your input and re-enter it!");
            number = getNumber();
        }
        if(number>upBound || number<downBound){
            System.out.printf("Your input must between %1$d - %2$d%n",downBound, upBound);
            number = getNumber(downBound, upBound);
        }
        return number;
    }
    public String getDoubleBox(String a,String e){
        String str = getAny();
        if(!(str.equals(a) ^ str.equals(e))){
            System.out.printf("Your entry was wrong, You should enter %s or %s%n",a,e);
            str = getDoubleBox(a,e);
        }
        return str;
    }

    public SpecialFunc() {
    }
}
