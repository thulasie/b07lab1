import java.util.Arrays;


class DriverLab1{

    public static void main(String[] args){

        /* 

        Polynomial p = new Polynomial();
        double [] c1 = {6,0,0,5};
        Polynomial p1 = new Polynomial(c1);
        double [] c2 = {0,-2,0,0,-9};
        Polynomial p2 = new Polynomial(c2);
        //Polynomial s = p1.add(p2);

        double [] c3 = {-4, 2};
        Polynomial p3 = new Polynomial(c3);

        double ok = p1.evaluate(1.0);

        System.out.println(ok);


        if(p3.hasRoot(2))
            System.out.println("2 is a root of s");
        else
            System.out.println("2 is not a root of s");


       */
      
       
       Polynomial p = new Polynomial();
       System.out.println(p.evaluate(3));
       double [] c1 = {6,0,0,5};
       Polynomial p1 = new Polynomial(c1);
       double [] c2 = {0,-2,0,0,-9};
       Polynomial p2 = new Polynomial(c2);
       Polynomial s = p1.add(p2);
       System.out.println("s(0.1) = " + s.evaluate(0.1));

       if(s.hasRoot(1))
            System.out.println("1 is a root of s");
       else
            System.out.println("1 is not a root of s");
      
       
    
        
      
    }


}