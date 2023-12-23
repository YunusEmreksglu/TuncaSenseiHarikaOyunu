import java.util.Scanner;
public class tunca {

    public static void main(String[] args) {
        
        StringBuilder str= new StringBuilder("xxxx");
        
        String sy;

        Scanner scr = new Scanner(System.in);

        while(true){
            char o ='+';

            sy = Integer.toString(1000+(int)(Math.random()*9999));  
            
            for(int i=0; i<4; i++){
                for(int j=0; j<4; j++){
                    if(sy.charAt(i)==sy.charAt(j) && i!=j){
                        o='-';
                    }
                }
            }
            if(o=='+'){
                break;
            }

        }
        
        while(true){

            String strb = scr.nextLine();

            str.replace(0, 4, "xxxx");

            for(int i=0; i<4; i++){
                for(int j=0; j<4; j++){
                    if(strb.charAt(i)==sy.charAt(j) && i==j){
                        str.setCharAt(i, 'x');
                        break;
                    }
                    else if(strb.charAt(i)==sy.charAt(j) && i!=j){
                        str.setCharAt(i, 'o');
                        break;
                    }
                    else{
                        str.setCharAt(i, '-');
                    }
                }
            }

            System.out.println(str);
            String ne =str.toString();
            if(ne=="xxxx"){
                System.out.println("sanjuuichi");


                break;
            }
        
        }

        

    }
    
}
