package Learning;

import java.io.IOException;
import java.util.Scanner;

public class CandidateCode {

	public static int cadbury(int input1,int input2,int input3,int input4)
    {
	    //Write code here
	    int cnt=0;
	    for (int x=input1;x<=input2;x++){
	    	for (int y=input3;y<=input4;y++){
	    		cnt=cnt+counter(x,y);
	    		System.out.println("in loop m="+x+" n="+y+" cnt="+cnt+" cntactual="+counter(x,y) );
	    	}
	    }
	    return cnt;
    }
    public static int counter(int i,int j) throws ArithmeticException {
        int m=i,n=j,k=0,cnt=0;
        do {
        	if ( m == 1 || n == 1 ){
        		cnt=cnt+n+m-1;
        		break;
        	} else if(m<n){
            	if ( n % m == 0){
            		cnt=cnt+(n/m);
            		break;
            	}
            	k=n-m;
            	int tmp=0;
            	tmp=m;
            	n=tmp;
            	m=n;
            } else if(m>n){ 
            	if ( m % n == 0){
            		cnt=cnt+(m/n);
            		break;
            	}
            	k=m-n;
            } else if (m == n){
            	cnt++;
            	break;
            }
            if (k == n){
            	cnt++;
            	m=k;
            } else if (k<n){
            	m=n;
            	n=k;
            	cnt++;
            } else if (k>n){
            	m=k;
                cnt++;
            } 
        } while( m > 0 && n > 0 && m != n );
        return cnt;
    }
    
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        int output = 0;
        int ip1 = Integer.parseInt(in.nextLine().trim());
        int ip2 = Integer.parseInt(in.nextLine().trim());
        int ip3 = Integer.parseInt(in.nextLine().trim());
        int ip4 = Integer.parseInt(in.nextLine().trim());
        output = cadbury(ip1,ip2,ip3,ip4);
        System.out.println(String.valueOf(output));
        in.close();
    }
}
