package com.lambton;



public class Arithmetic
{
    private int a=0;
    private int b=0;
    private int c=0;
    private int Sum=0;
    private String s1,s2,s3,s4,s5;
    private float f1,f2,f3;
    private double d1,d2,d3;
    public Arithmetic(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        add(this.a,this.b,this.c);
    }
    public Arithmetic(int a, int b, float c) {
        this.a = a;
        this.b = b;
        this.f1 = c;
        add(this.a,this.b,this.f1);
    }


    public Arithmetic(int a, int b) {
        this.a = a;
        this.b = b;
        Sum =add(this.a,this.b);
        System.out.println(Sum);
    }

    public Arithmetic(float f1, float f2) {
        this.f1 = f1;
        this.f2 = f2;
        f3=add(this.f1,this.f2);
    }

    public Arithmetic(String s1, String s2) {
        this.s1 = s1;
        this.s2 = s2;
        s3=add(this.s1,this.s2);
    }

    public Arithmetic(int a, String s1) {
        this.a = a;
        this.s1 = s1;
       s4= add(this.a,this.s1);
    }
    public Arithmetic(String a, int s1)
    {
        this.s1 = a;
        this.a = s1;
       s5= add(this.s1,this.a);
    }

    public int add(int a1, int a2)
    {
        Sum=a1+a2;
        return  Sum;
    }
    public float add(float a1, float a2)
    {
        f3=a1+a2;
        return  f3;
    }
    public String add(String s1, String s2)
    {
        s3= s1.concat(s2);
        return  s3;
    }
    public String add(String s1, int s2)
    {
        String s3 = s1.concat(String.valueOf(s2));
        return  s3;
    }
    public String add(int s1, String s2)
    {
        String s4 = String.valueOf(s1).concat(s2);
        return  s4;
    }
    public int add(int x, int y, int z) {
        int c = x + y + z;
        return c;
    }
    public float add(int x, int y, float z) {
        float c = x + y + z;
        return c;
    }

    public Arithmetic(int a, double d1) {
        this.a = a;
        this.d1 = d1;
        add(this.a,this.d1);
    }

    public Arithmetic( String s2,int a, float f2) {

        this.s2 = s2;
        this.a = a;
        this.f2 = f2;
        add(this.s2,this.a,this.f2);
    }

    public Arithmetic(int b, float f1) {
        this.b = b;
        this.f1 = f1;
        add(this.a,this.f1);
    }

    public float add(float x, int y) {
        float c = x + y;
        return c;
    }
    public float add(float x, int y, int z) {
        float c = x + y + z;
        return c;
    }
    public String add(String x, int y, float z) {
        String c = x.concat(String.valueOf(y)).concat(String.valueOf(z));
        return c;
    }
    public double add(int x, double y) {
        double c = x + y;
        return c;
    }
    public float add(int x, float y) {
        float c = x + y;
        return c;
    }
    
}
