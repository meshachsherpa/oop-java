public class ContinueDemo {
    public static void main(String[] args)
    {
        int [] numbers = {13, 15, 17, 12, 44, 6};

        for (int num: numbers)
        {
            if (num%2 !=0 ){
                continue;
        }

                System.out.println(num);

        }
    }
}
