public class demo3 {
    public static void main(String []args)
    {
        int [][] array={{1,2,3},{2,3,4},{3,4,6}};
        int target = 8;
        StringBuffer temp = new StringBuffer("sada das as a  as");
        System.out.println(Find(target,array));
    }
    public static boolean Find(int target, int [][] array) {
        boolean result = false;
        int col = array[0].length-1;
        int row = 0;
        while (col>=0 && row<array.length)
        {
            if(array[row][col]==target)
            {
                return true;
            }
            else if(array[row][col]>target)
            {
                col--;
            }
            else if (array[row][col]<target)
            {
                row++;
            }
        }

        return result;
    }
}
