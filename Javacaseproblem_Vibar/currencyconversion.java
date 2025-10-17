public class currencyconversion {
    public static void main(String[] args) {
       
        System.out.println("Name: Cheny Vibar");
        System.out.println("ID Number: 2024303781");
        System.out.println("------------------------------");

       
        double pesos = 1000;       
        double rate = 58.50;       
        double dollars = pesos / rate;

        
        System.out.println("Result: " + pesos + " Philippine Pesos is equal to " 
                           + String.format("%.2f", dollars) + " US Dollars");
    }
}
