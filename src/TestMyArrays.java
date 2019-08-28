public class TestMyArrays {
    public static void main(String[] args) {
        
        int [] values = new int[5];
        values[0] = 16;
        values[1] = 18;
        values[2] = 25;
        values[3] = 21;
        values[4] = 23;
        
        int currentSize = 5;



        MyArrays.insertionSort(values);

        //currentSize = MyArrays.insert(values, currentSize, 10, 2);
        //expected output 1,4,10,15,23,55
       
        for (int i=0; i < 5; i++)
            System.out.println(values[i]);







        }
}
