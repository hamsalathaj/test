package Learning;

public class Snippet {
	public static int cadbury(int input1,int input2,int input3,int input4)
	    {
		    //Write code here
		    int cnt=0,counter=0;
		    int x=0;
		    for (x=input1;x<=input2;x++){
		        counter=counter+count(x,input3);
		        System.out.println("c1:"+counter);
		    }
		    for (x=input1;x<=input2;x++){
		        counter=counter+count(x,input4);
		        System.out.println("c2:"+counter);
		    }
		    
		    return counter;
	    }
	    public static int count(int i,int j){
	        int m=0,n=0,k=0,counter=0;
	        if(j<i){
	            m=i;
	            n=j;
	        }else if(i<j){
	            n=i;
	            m=j;
	        }else{
	            counter++;
	        }
	        while( m % n != 0 && m/n != m && m != n && m != 0 && n != 0){
	            k=m-n;
	            counter++;
	            if(k<n){
	                m=n;
	                n=k;
	            }else if(k<n){
	                m=k;
	            }else{
	                counter++;
	            }
	        }
	        return counter;
	    }
}

