public class demo {
    public static void main(String []args)
    {
        StringBuffer temp = new StringBuffer("sada das as a  as");
        System.out.println(replaceSpace(temp));
    }
    public static String replaceSpace(StringBuffer str) {
        int spacenum = 0;
       int  oldlength = str.length();
        for(int i=0;i<oldlength;i++)
        {
            if(str.charAt(i)==' ')
            {
                spacenum++;
            }
        }
        int newlength = spacenum*2+str.length();
        str.setLength(newlength);
        while(oldlength>0&&newlength>0)
        {
            oldlength--;
            newlength--;
            if(str.charAt(oldlength)==' ')
            {
                str.setCharAt(newlength--,'0');
                str.setCharAt(newlength--,'2');
                str.setCharAt(newlength,'%');

            }
            else
            {
                str.setCharAt(newlength,str.charAt(oldlength));
            }
        }
        return str.toString();
    }
}
