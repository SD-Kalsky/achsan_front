public class Simple_Function
{
private boolean isLimited, include_min, include_max;
private float min_arg, max_arg, coef_a, coef_b;
private int type;
//Types of a function
//0 - custom
//1 - uniform distribution
//2 -
//3 - 
//4 - 


Simple_Function()
{
    this.type=1;
    this.isLimited=false;
    this.include_min=false;
    this.include_max=false;
    this.min_arg=0;
    this.max_arg=1;
    this.coef_a=1;
    this.coef_b=0;
}

Simple_Function(float a, float b)
{
    this.type=1;
    this.isLimited=false;
    this.include_min=false;
    this.include_max=false;
    this.min_arg=0;
    this.max_arg=1;
    this.coef_a=a;
    this.coef_b=b;
}

Simple_Function(float a, float b, int min, int max)
{
    this.type=1;
    this.isLimited=true;
    this.include_min=true;
    this.include_max=true;
    this.min_arg=min;
    this.max_arg=max;
    this.coef_a=a;
    this.coef_b=b;
}

protected double function(double x)
{
    double f=x;
    return f;
}

public double solve(double x)
    {
        double f=0;
        if(this.isLimited)
        {
            if(((a<x)or((a==x)and(this.include_min)))and((x<b)or((b==x)and(this.include_max))))
            {f=function(x);}
            else 
            {f=0;}
        }
        else 
        {f=function(x);}
        return f;
    }
public boolean isLimit() 
    {
        return this.isLimited;
    }
public void setlimits(float a, float b, boolean ab, boolean bb)
    {
        this.isLimited=true;
        this.max_arg=b;
        this.min_arg=a;
        this.include_min=ab;
        this.include_max=bb;
    }
}






// public class Uniform_Distribution() extends Math_Function
// {

// Uniform_Distribution(float a, float b, boolean ab, boolean bb)
//     {
//         super();
//         setlimits(a,b,ab,bb);
//     }

// @Override
// public double function(double x)
//     {
//         return x/(b-a);
//     }
// }