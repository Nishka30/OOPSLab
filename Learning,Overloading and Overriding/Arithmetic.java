class Arithmetic
{
    int a;
    float b;
    char c;
    double d;
    Arithmetic(){}
    Arithmetic(int v,float x,char y,double z)
    {
        this.a=v;
        this.b=x;
        this.c=y;
        this.d=z;
    }
    void add(int v,double z)
    {
        this.a=this.a+v;
        this.d=this.d+z;
    }
    void add(int v,float x,double z)
    {
        this.a=this.a+v;
        this.b=this.b+x;
        this.d=this.d+z;
    }
    void add(float x,int v,double z)
    {
        this.b=this.b+x;
        this.a=this.a+v;
        this.d=this.d+z;
    }
    Arithmetic add(Arithmetic ob)
    {
        Arithmetic ob1=new Arithmetic();
        ob1.a=this.a+ob.a;
        ob1.b=this.b+ob.b;
        ob1.c=(char)(this.c+ob.c);
        ob1.d=this.d+ob.d;
        return ob1;
    }
    void display()
    {
        System.out.println("Integer: "+this.a);
        System.out.println("Float: "+this.b);
        System.out.println("Character: "+this.c);
        System.out.println("Double: "+this.d);
    }
    public static void main(String args[])
    {
        Arithmetic ob=new Arithmetic(10,1.0f,'c',2.0);
        ob.add(2,3.2);
        ob.display();
        System.out.println();
        Arithmetic ob1=new Arithmetic(5,2.2f,'a',8.0);
        ob1.add(2,3.2f,2.0);
        ob1.display();
        System.out.println();
        Arithmetic ob2=new Arithmetic(5,4.9f,'b',2.1);
        ob2.add(3.3f,4,6.2);
        ob2.display();
        System.out.println();
        Arithmetic ob3=ob.add(ob1);
        ob3.display();
    }
}
