public class Invest {
    public static void main( String[] arguments) {
        float total = 14000;
        System.out.println("Original investment : $" + total);
        // Increases by 40 percent the frist year total = total + (total * .4F);
        total = total + (total * .4F);
        System.out.println("After one year : $" + total);
        
        // Loses $1,500 the second year total = total -1500F;
        total = total -1500F;
        System.out.println("After two years : $" + total);

        // Increases by 12 percent the thrid year total = total +(total * .12F);
        total = total +(total * .12F);
        System.out.println("After three years : $" + total);
        
    }
}