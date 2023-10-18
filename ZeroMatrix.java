import java.util.ArrayList;
public class ZeroMatrix {
     public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, Integer n, Integer m) {
    	ArrayList<Integer> row=new ArrayList<>();
        ArrayList<Integer> col=new ArrayList<>();
        int f=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix.get(i).get(j)==0){
                    matrix.get(0).set(j,0);
                    // System.out.print(j+" ");
                    
                    matrix.get(i).set(0,0);
                    if(i==0){
                        f=1;
                    }
                    
            }
            // System.out.println();
        }
        }
        for(int i=1;i<m;i++){
            if(matrix.get(0).get(i)==0){
                for(int j=0;j<n;j++){
                    matrix.get(j).set(i,0);
                }
            }
        }
        for(int i=1;i<n;i++){
            if(matrix.get(i).get(0)==0){
                for(int j=0;j<m;j++){
                    matrix.get(i).set(j,0);
                }
            }
        }
        if(matrix.get(0).get(0)==0){
        for(int i=0;i<n;i++){
         matrix.get(i).set(0,0);   
        }
        }
        if(f==1){
            for(int i=0;i<m;i++){
                matrix.get(0).set(i,0);
            }
        }
        
        
       
        

        return matrix;
    }
    
}
