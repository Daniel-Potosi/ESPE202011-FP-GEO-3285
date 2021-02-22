package ws14.arrays;

public class WS14Arrays {

    public static void main(String[] args) {
        // TODO code application logic here
        int[] bikes;
        String[] bikes = {"mountain bike", "rute", "mtb"};
        float[] bikes = { 1F, 2F, 4F, 8F, 3F, 5F};
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the types of bikes -> ");
        n = input.nextInt();

        bikes = new int[n];
        //cbikes = new String[20];
        //numberofbicyclesperwarehouse = new float[n];

//        bikes[0] = 7;
//        bikes[1] = 9;
//        bikes[2] = 3;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the number of bikes of the warehouse " + (i + 1) + " -> ");
            bikes[i] = input.nextInt();
        }

        for (int bikes : bikesOfTheWarehouse) {
            System.out.println("bikes of warehouse are " + bikes);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("bikes of the warehouse " + (i + 1) + " -> " + bikes[i]);
        }

        for (String bike : bikes) {
            System.out.println("type bike -> " + bike);
        }
        
        for (int i = 0; i < weightsByWarehouse.length ; i++) {
            System.out.println("weight of warehouse " + (i + 1) + " -> " + weightsWarehouse[i]);
    }
    
}