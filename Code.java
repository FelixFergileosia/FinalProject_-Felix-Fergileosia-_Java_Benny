import java.lang.Math;

public class Code {
    public static void main(String[] args) 
    {
        //Random ID Generator from 1-9
        int[] ID = new int[] {1,1,1,1};
        int min = 0;
        int max = 9;

        for(int i = 0; i<4; i++)
        {
            int random = (int)Math.floor(Math.random()*(max-min+1)+min);
            ID[i] = random;
        }
        int random = (int)Math.floor(Math.random()*(max-min+1)+min);

        for(int i = 0; i<4; i++)
        {
            System.out.println(ID[i]);
        }
        

    }
}
