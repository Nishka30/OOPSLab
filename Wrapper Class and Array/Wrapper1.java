public class Wrapper1
{
    public static void main(String[] args)
    {
        char a='s';
        double b=5.02;
        Integer i=null;
        Character c=a;
        Float f=null;
        Double d=b;
        System.out.println("Primitive to Wrapper class conversion:");
        System.out.println(i+" "+c+" "+f+" "+d);
        Integer a1=new Integer(4);
        Character a2=new Character('c');
        Float a3=new Float(2.33f);
        Double a4=new Double(2.3);
        int k=a1;
        char l=a2;
        float m=a3;
        double n=a4;
        System.out.println("Wrapper class to Primitive conversion:");
        System.out.println(k+" "+l+" "+m+" "+n);
        char[] arr={'A','b',' ',9};
        System.out.println("Individual characters are :");
        for(int p=0;p<arr.length;p++)
        {
            if(arr[p]>='A' && arr[p]<='Z')
            {
                System.out.println("Uppercase");
            }
            else if(arr[p]>='a' && arr[p]<='z')
            {
                System.out.println("Lowercase");
            }
            else if(arr[p]>=0 && arr[p]<=9)
            {
                System.out.println("Digit");
            } else if(arr[p]==' ')
            {
                System.out.println("Whitespace");
            }
            else
            {
                System.out.println("Special character");
            }
        }
    }
}


