public class Theorver {
 static long combination(int a, int b)
{
    int i;
    long c=1,f;
    if (b<a-b)
        {
            for (i=1; i<=b; i++)
            {
                c*=i;
            }
            b=a-b;
        }
    else
        {
            for (i=1; i<=a-b; i++)
            {
                c*=i;
            }
        }
    f=c;
    c=1;
    for (i=b+1; i<=a; i++)
    {
        c*=i;
    }
    c=c/f;
    return c;

}

static double discombination(int n)
{
int f=1;
double s=1;
for (int i=1; i<=n;i++)
    {
        f*=i;
        s+=(Math.pow(-1,i)/f);
    }
s*=f;
return s;
}

static double bernulli(int n, int k, double p)
{
    double b;
    b=combination(n,k)*Math.pow(p,k)*Math.pow(1-p,n-k);
    return b;
}
static double erf(double x)
    {
        double er=0;
        if(x>=3)
        {
            er=1;
        } 
        if(x==0)
        {
            er=0;
        }
        if(x<0)
        {
            er=-erf(-x);
        }
        if (x>0 && x<3)
            {
                int i=0, f=1;
                while(i<10)
                {
                    er+=(Math.pow(-1,i))*(Math.pow(x,(2*i+1)))/(f*(2*i+1));
                    i++;
                    f*=i;
                }
                er=er*2/Math.PI;
            }
        
        return er;
    }
static double phi(double x)
    {
        double phi;
        phi=(erf(x/Math.sqrt(2)))/2;
        return phi;
    }
static double int_moivre_laplace(double a, double b, int n, double p)
{
    double ml, np=n*p,npq;
    npq=Math.sqrt((1-p)*np);
    ml=phi((b-np)/npq)-phi((a-np)/npq);
    return ml;
}
static double loc_moivre_laplace(int n, int m, double p)
{
    double ml, np=n*p,npq;
    npq=Math.sqrt((1-p)*np);
    ml=((1/Math.sqrt(2*Math.PI))*Math.pow(Math.E,(-(Math.pow(((m-np)/npq), 2))/2)))/npq;
    return ml;
}

}

class Discred_Random_Variable
{
    private int number, type;
    protected double [][]cells;

    private void init ()
    {
    int i,j;
    this.cells = new double[2][this.number];
    this.cells[0] = new double[this.number];
    this.cells[1] = new double[this.number];
    for (j = 0; j < this.number; j++)
        {
            this.cells[0][j] = j+1;
            this.cells[1][j] = 1/this.number;
        }
    }
    Discred_Random_Variable ()
    {

    }
    Discred_Random_Variable (int n)
    {
        this.number=n;
        this.init();
    }
    void instream()//Vvod 
    {
        int n=Input.nextInt(), i=0,a;
        
        this.number=n;
        this.init();

        while (i<n) {
        a=Input.nextInt();
        this.cells[0][i]=a;
        a=Input.nextInt();
        this.cells[1][i]=a;
        i++;
        }
    }

    void set_element(int i, double x)//Vvod 
    {
        this.cells[0][i]=x;
    }
    double get_element(int i)//Vyvod 
    {
        double a[]=this.cells[0][i];
        return a;
    }
    double get_probability(int i)//Vyvod 
    {
        double a[]=this.cells[1][i];
        return a;
    }
    double[] get_element_with_probability(int i)//Vyvod 
    {
        double a[]={this.cells[0][i],this.cells[1][i]};
        return a;
    }

    int size()
    {
        return this.number;
    }
    double expected_value()//Mat. ozhidnie
    {
        int i; double s=0;
        for (i=0; i<this.number; i++)
        {
            s+=(this.cells[0][i]*this.cells[1][i]);
        }
        s/=this.number;
        return s;
    }
double variance()//Dispersia
  {int i; double s1=0, s2=0;
  for (i=0; i<this.number; i++)
    {
      s1+=(this.cells[0][i]*this.cells[0][i]*this.cells[1][i]);
      s2+=(this.cells[0][i]*this.cells[1][i]);
    }
    s1=(s1-(s2*s2))/this.number;
    return s1;
  }
double standard_deviation()//
  {int i; double s1=0, s2=0;
  for (i=0; i<this.number; i++)
    {
      s1+=(this.cells[0][i]*this.cells[0][i]*this.cells[1][i]);
      s2+=(this.cells[0][i]*this.cells[1][i]);
    }
    s1=Math.sqrt((s1-(s2*s2))/this.number);
    return s1;
  }
   
}

class Continuous_Random_Variable
{
    private int number;
    protected double []cells;
    protected Simple_Function []functions;
    private void init ()
    {
    int j;
    this.cells = new double[this.number];
    this.functions = new Math_Function[this.number];
    for (j = 0; j < this.number; j++)
        {
            this.cells[j] = j+1;
            this.functions;
        }
    }
Continuous_Random_Variable ()
    {

    }
Continuous_Random_Variable(int n)
    {
        this.number=n;
        this.init();
    }

void set_element(int i, double x, double p)//Vvod 
    {
        this.cells[i]=x;
        this.functions[i]=p;
    }
double[] get_element(int i)//Vyvod 
    {
        double a[]={this.cells[i],this.functions[i]};
        return a;
    }
int size()
    {
        return this.number;
    }
double expected_value()//Mat. ozhidnie
    {
        int i; double s=0;
 
        return s;
    }
double variance()//Dispersia
  {int i; double s1=0, s2=0;
  for (i=0; i<this.number; i++)
    {
      s1+=(this.cells[0][i]*this.cells[0][i]*this.cells[1][i]);
      s2+=(this.cells[0][i]*this.cells[1][i]);
    }
    s1=(s1-(s2*s2))/this.number;
    return s1;
  }
double standard_deviation()// 
  {int i; double s1=0, s2=0;
  for (i=0; i<this.number; i++)
    {
      s1+=(this.cells[0][i]*this.cells[0][i]*this.cells[1][i]);
      s2+=(this.cells[0][i]*this.cells[1][i]);
    }
    s1=Math.sqrt((s1-(s2*s2))/this.number);
    return s1;
  }
   
}