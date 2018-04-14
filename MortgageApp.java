public class MortgageApp{
  public static void main(String [] args){
    IO i = new IO();
    i.displayMenu();
    int choice = i.getMenuChoice();
    double rate = i.getRate(choice);
    int term = i.getTerm(choice);
    double amount = i.getAmount(choice);
    if(choice == 1){
    Mortgage m = new Mortgage();
    System.out.println(m);
    }
    if(choice == 2){
    Mortgage m = new Mortgage(rate, term, amount);
    System.out.println(m);
    }
    if(choice == 3){
    System.exit(0);
    }
  }
}//end main
