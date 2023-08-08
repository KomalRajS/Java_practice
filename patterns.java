public class patterns {
    public static void main(String[] args) {
        int m = 4, n = 5;

        System.out.println();
        System.out.println("Solid Rectangle Pattern "); 
          for(int i = 1; i <= m; i++) {
            for(int j = 1; j <= n; j++)
                System.out.print("*");
                System.out.println();
        }     

        System.out.println();
        System.out.println("Hollow Reectangle Pattern"); 
        for(int i = 1; i <= m; i++) {
            for(int j = 1; j <= n; j++) {
                 if(i == 1 || i == m || j ==1 || j == n) 
                     System.out.print("*");
                 else 
                     System.out.print(" ");
            }
            System.out.println();
        }      
       
        System.out.println();
        System.out.println("Half Pyramid with numbers"); 
        for(int i = 1; i <= m; i++) {
            for(int j = 1; j <= i; j++) 
                System.out.print(j+" ");
            System.out.println();
        }       

        System.out.println();
        System.out.println("Inverted Half Pyramid ");  
        for(int i = 1; i <= m; i++) {        //       or for(int i = m; i>=1; i--){for(int j=1;j<=i;j++){}}
            for(int j = m; j >= i; j--)
                System.out.print("*");
            System.out.println();
        }      

        System.out.println();
        System.out.println("Inverted Half Pyramid rotated about 180 degree");    
        for( int i = m; i >= 1; i--) {
            for(int j = 1; j <= m; j++ ) {
                if(j >= i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();   
        }     

        System.out.println();
        System.out.println("Floyd Triangle"); 
        int a = 1;
        for(int i = 1; i <= m; i++) {
            for(int j = 1; j <= i; j++,a++) 
                System.out.print(a+" ");
            System.out.println();
        }  

        System.out.println();
        System.out.println("0-1 Triangle");  
        for(int i = 1; i <= m; i++) {
            for(int j = 1; j <= i; j++) {
                if((i+j) % 2 == 0) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println();
        } 

    }
}
