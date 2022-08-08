// This program calculates the average of all even integers between 1 and 10000
//Danyal Hamza, 10944646
pulic class SumOfEvenNumbers {

    public static void main(String[] args) {

        int q = 0;

        int sum = 0;

        for(int p = 1; p < 10000; p++) {

        if(p % 2 == 0;) {

            System.out.println(p);

            sum += p;

            q++;
        }
         }
 System.out.println("The sum of the numbers is" + sum);

 float average = sum / q;

 System.out.println("The average of the numbers is" + average);
    }
}