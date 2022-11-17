package easy;
import java.util.*;

public class Gossip { 
	static int count(int[][]grid,int m,int n) {
		int s=0;
		for(int i=0;i<m;i++) {
			   for(int j=0;j<n;j++) {
				   if(j!=n-1) {
				   if(grid[i][j]==1&&grid[i][j]==grid[i][j+1]) {
					   s++;
					   
				   }
				   }
			   }
				   
			   }
		/*for(int i=0;i<m-1;i++) {
			   for(int j=0;j<n;j++) {
				   if(grid[i][j]==1&&grid[i][j]==grid[i+1][j]) {
					   s++;
				   }
					   
			   }
		}*/
		
		return s;
	}

   public static void main(String[]args) {
	   Scanner sc=new Scanner(System.in);
	   int m=5;
	   int n=4;
	   int grid[][]={ { 1,1,0,0,0 }, { 0, 1,0,0,1 },{  1,0,0,1,1 },{ 0, 0,0,0,0 },{ 1, 0,1,0,1 } };
	   //int grid[][]= {{1,1,1,1},{1,1,1,1},{0,1,0,0},{1,0,1,1},{0,1,0,0}};
	   for(int i=0;i<5;i++) {
		   for(int j=0;j<4;j++) {
			   System.out.print(grid[i][j]);
		   }
		   System.out.println();
	   }
	   System.out.println(count(grid,m,n));
   }

}
