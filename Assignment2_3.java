// Java program to generate a specified X Pattern as shown i the given diagram

package answer_2_3_AAA;


public class Assignment2_3   
{
	public static void main(String[] args)        
	{
		
        char firstChar;            //Declaring char variable firstChar.
        int rowNum;                //Declaring int variable for number of rows.
        int colNum;                //Declaring int variable for number of columns.
        
                
        firstChar='*';    
        rowNum=5;     
        colNum=5;      
        
        for(int row = 0 ; row < rowNum; row++)       
        {
        	int numOfChar=0;                         
        	for(int col=0;col < colNum; col++)     
        	{
        	    if(row==col || col==colNum-row-1)      
        	    {   
        	    	System.out.print(firstChar);     
        	    	numOfChar++;
        	    }	
        	    else
        	    	System.out.print("__");           
        	    if((numOfChar==2 && row!=2) || (numOfChar==1 && row==2))
        	    	break;
        	}
        	System.out.print("\n");        
        }                                 
	}      
}      