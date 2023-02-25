import java.util.Random;

public class Kmean_Clustering{
	int x[],y[];
	int num;
	int k;
	int meanX[],meanY[];
	int oldX[],oldY[];
	int CAssign[];
	double minimum=Double.MAX_VALUE ;
	
    public Kmean_Clustering(int num,int k)
	{
		this.num=num;
		this.k=k;
		x = new int[num];
		y = new int[num];
		meanX = new int[num];
		meanY = new int[num];
		oldX = new int[num];
		oldY= new int[num];
		CAssign=new int[num];
	}
	
	void randomMean() 
	{
		Random rand=new Random();
		for(int i=0; i<k; i++)
		{
			meanX[i]=rand.nextInt(1000);
			meanY[i]=rand.nextInt(1000);
		}
		
	}
	void randomData() 
	{
		Random rand=new Random();
		for(int i=0; i<num; i++)
		{
			x[i]=rand.nextInt(1000);
			y[i]=rand.nextInt(1000);
		}
		
	}
	void assignCluster()
	{
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<k;j++)
			{
				double distance=Math.sqrt(Math.pow(x[i]-meanX[j],2)+Math.pow(y[i]-meanY[j],2));
				if(distance<minimum)
				{
					CAssign[i]=j;
					minimum=distance;
				}
				
			}
			
		}
		
	}
	void updateMeans()
	{
		for(int i=0;i<k;i++)
		{
			 oldX[i]=meanX[i];
			 oldY[i]=meanY[i];
		}
		
		for(int i=0;i<k;i++)
				{
			   int sumx=0,sumy=0,counter=0;
					for (int j=0;j<num;j++)
						{
							if(CAssign[j]==i)
							{
							 sumx+=x[i];
							 sumy+=y[i];
							 counter++;
							 
							}

						}
					if(counter!=0) 
					{
						meanX[i]=sumx/counter;
						meanY[i]=sumy/counter;
					}
					
				}
	}
	boolean isDifferent()
	{    boolean y=false;
		 for(int i=0;i<num;i++)
		 {
			 if((meanX[i]==oldX[i])&& (meanY[i]==oldY[i]))
					 {
				 		return false;
					 }
			 		else
			 			{
			 				return true;
			 			}
		 }
		return y;
	}
		  

	void doClustering()
	{
		randomMean();
		randomData();
		do {
			assignCluster();
			updateMeans();
			
		}while(isDifferent());
	}
	
	void display()
	{
		for(int i=0;i<k;i++)
		{
			System.out.println("\n Clustering :"+(i+1));
			System.out.println("("+meanX[i]+","+meanY[i]+")");
			for (int j=0;j<num;j++)
			{
				if(CAssign[j]==i)
				{
					
				 System.out.print("("+x[j]+","+y[j]+"), ");
				 
				}
			}
			//System.out.println("\n");
			
			
		}
	}
	
	
	public static void main(String[]args)
	{
		Kmean_Clustering k=new Kmean_Clustering(10, 2);
		k.doClustering();
		k.display();
	}

}
