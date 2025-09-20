import java.util.Arrays;


class Polynomial{

    private double[] ce;        // array for coefficents

    
    public Polynomial(){        // no-arg constructor that sets polynomial to 0

        ce = new double[]{0};

    }

    public Polynomial(double[] array){

        ce=array;       

    }

    public Polynomial add(Polynomial coefficents){        

        int maximum = Math.max(coefficents.ce.length, ce.length);
        double[] sum = new double[maximum];
        double first;
        double second; 


        for(int i=0; i<maximum;i++){
            if(i<ce.length){
                first = ce[i];
            }
            else{
                first=0;
            }

            if(i<coefficents.ce.length){
                second = coefficents.ce[i];
            }
            else{
                second = 0;
            }

            sum[i] = first+second;
        }

        Polynomial result = new Polynomial(sum);
        
        return result;

    }




    public double evaluate(double value){           

        double answer = 0;
        double[] answer2 = new double[ce.length];
        double result = 0;

        for(int i=1; i<ce.length; i++){
            answer = (Math.pow(value, i)) * ce[i];
            answer2[i]=answer;
        }

         
        for(int i=0; i<answer2.length;i++){
            result = result + answer2[i];
        }
        
        return result + ce[0];
    }




    public boolean hasRoot(double value){

        if(evaluate(value)==0){
            return true;
        }

        return false;
    }





    public String toString() {
        return Arrays.toString(ce);
    }





    

    

}



