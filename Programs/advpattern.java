public class advpattern{

    //hollow rectangle pattern 

    public static void hollow_rectangle(int row, int col){
        //outer loop for row
        for(int i = 1; i<=row; i++){
            //inner loop for colunm 
            for(int j = 1; j<=col; j++){
                //condition for boundry stars print
                if(i == 1 || i == row || j == 1 || j == col){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //inverted rotated half pyramid 

    public static void inverted_rotated_half_pyramid(int row ){
        //outer loop for row
        for( int i = 1; i<=row; i++){
            //print spaces
            for(int j = 1; j<=row-i; j++){
                System.out.print(" ");
            }
            //print stars
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //inverted half pyramid
    public static void inverted_half_pyramid_withNumbers(int row ){
         //outer loop for row
         for(int i = 1; i<=row; i++){
            //inner loop for colunm 
            for(int j = 1; j<=row - i +1; j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }

        //floyd's triangle
    public static void floyds_triangle(int n){
        int counter = 1; 
        //outer loop for row 
        for ( int i = 1; i<=n; i++){
            //inner loop for column
            for(int j= 1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }

    //0,1 triangle 
    public static void zero_one_triangle(int n){ 
        //outer loop for row 
        for ( int i = 1; i<=n; i++){
            //inner loop for column
            for(int j= 1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }  
            }
            System.out.println();
        }
    }

    //butterfly pattern 

    public static void butterfly(int n ){
        //1st half of butterfly
       for ( int i =1; i<=n; i++){
        //stars - i

        for(int j =1; j<=i; j++){
            System.out.print("*");
        }

        //spaces - 2*(n-i)
        for(int j= 1; j<=2*(n-i); j++){
            System.out.print(" ");
        }
        //stars-i
        for(int j =1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
       
    }

         //2nd half of butterfly 

        for(int i=n ; i>=1; i--){
    
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }
    
            //spaces - 2*(n-i)
            for(int j= 1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //stars-i
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }

    //solid rhombus
    public static void solid_rhombus(int n){
        //outer loop 
        for(int i= 1; i<=n; i++){
            //printing spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //printing stars
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    //hollow rhombus pattern

    public static void hollow_rhombus(int n){
        for (int i=1; i<=n; i++){
                        //printing spaces
                        for(int j=1; j<=n-i; j++){
                            System.out.print(" ");
                        }
                        for(int j = 1; j<=n; j++){
                            //condition for boundry stars print
                            if(i == 1 || i == n || j == 1 || j == n){
                                System.out.print("*");
                            }else{
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
        }

    }
    //diamond pattern

    public static void diamond(int n){
        //1st half 
        for(int i =1; i<=n; i++){
            //printing spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //printing stars
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        for(int i =n; i>=1; i--){
            //printing spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //printing stars
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    


    public static void main(String[] args) {
        System.out.println("Patterns");
        // hollow_rectangle(6,17);//calling fxn
        // inverted_rotated_half_pyramid(4);//calling fxn
        // inverted_half_pyramid_withNumbers(4); //calling fxn
        // floyds_triangle(4);//calling fxn
        // zero_one_triangle(5);//calling fxn
        // butterfly(4);//calling fxn 
        // solid_rhombus(5);//calling fxn
        // hollow_rhombus(7);//calling fxn
        // diamond(5);//calling fxn 

    }
}