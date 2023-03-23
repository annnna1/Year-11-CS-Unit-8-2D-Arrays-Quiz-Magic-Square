public class MagicSquare {

    /**
     *
     * @param array2d
     * @return the sum of the first row in array2d.
     */

    public static int calculateCheckSum(int[][] array2d)
    {
        int s = 0;
        for(int i = 0 ; i < array2d[0].length ; i ++)
        {
            s += array2d[0][i];
        }
        return s;
    }

    /**
     *
     * @param array2d
     * @param checkSum
     * @return whether the sum of each row in array2d is equal to checkSum or not.
     *         Because we have already determined the sum of the first row
     *         via the method 'calculateCheckSum', this method can begin
     *         iterating from the second row.
     */

    public static boolean magicRows(int[][] array2d, int checkSum)
    {
        int s = 0;
        int side = array2d.length;
        for(int i = 1 ; i < side ; i ++)
        {
            for(int j = 0 ; j < side ; j ++)
            {
                s+= array2d[i][j];
            }
            if(!(s == checkSum))
            {
                return false;
            }
            s = 0;
        }
        return true;
    }

    /**
     *
     * @param array2d
     * @param checkSum
     * @return whether the sum of each column in array2d is equal to checkSum or not.
     */

    public static boolean magicColumns(int[][] array2d, int checkSum)
    {
        int s = 0;
        int side = array2d.length;
        for(int i = 0 ; i < side ; i ++)
        {
            for(int j = 0 ; j < side ; j ++)
            {
                s+= array2d[j][i];
            }
            if(!(s == checkSum))
            {
                return false;
            }
            s = 0;
        }
        return true;
    }

    /**
     *
     * @param array2d
     * @param checkSum
     * @return whether the sum of each of the two main diagonals is equal to checkSum or not.
     */

    public static boolean magicDiagonals(int[][] array2d, int checkSum)
    {
        int s1 = 0;
        int s2 = 0;
        int side = array2d.length;
        for(int i = 0 ; i < side ; i ++)
        {
            s1+= array2d[i][i];
        }
        for(int i = side - 1 ; i >= 0 ; i --)
        {
            s2+= array2d[i][i];
        }
        return (s1==checkSum && s2==checkSum);
    }

    /**
     *
     * @param array2d
     * @return whether array2d is magic or not.
     */

    public static boolean isMagic(int[][] array2d)
    {
        int checksum = calculateCheckSum(array2d);
        boolean isMagic = (magicRows(array2d , checksum) && magicColumns(array2d , checksum) && magicDiagonals(array2d , checksum));
        return isMagic;
    }

}
