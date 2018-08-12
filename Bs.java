package program;

import java.util.Scanner;

public class Bs
{

	public static void main(String[] args)
	{
		int i,j,k;
		double ea=75,lip=100;
		double [][] hra=new double[5][5];
		double [][] da=new double[5][5];
		double [][] cca=new double[5][5];
		double [][] pf=new double[5][5];
		double [][] t_reduction=new double[5][8];
		double [][] bs=new double[5][5];
		double [][] gross_salary=new double[5][8];
		double [][] net_salary=new double[5][9];
		double [][] salary=new double[5][8];
		Scanner s=new Scanner(System.in);
		System.out.println("enter the salary of five person");
		for(i=0;i<salary.length;i++)
		{
			for(j=0;j<1;j++)
			{
				salary[i][j]=s.nextDouble();
			}
		}
		System.out.println("salary"+" "+"  hra"+"    "+" da"+"    "+" cca"+"    "+"  pf"+"     "+"gross-salary"+"  "+"total-reduction"+"   "+"net-salary");
		for(i=0;i<salary.length;i++)
		{
			for(j=0;j<1;j++)
			{
				da[i][2]=salary[i][j]*57/100;
				cca[i][3]=salary[i][j]*1/5;
				hra[i][1]=salary[i][j]*5/100;
				gross_salary[i][5]=hra[i][1]+da[i][2]+cca[i][3]+ea+salary[i][j];
				pf[i][4]=salary[i][j]*8.5/100;
				t_reduction[i][6]=pf[i][4]+lip;
				net_salary[i][7]=gross_salary[i][5]-t_reduction[i][6];
				System.out.print(salary[i][j]+"  ");
				System.out.print(hra[i][1]+"  ");
				System.out.print(da[i][2]+"  ");
				System.out.print(cca[i][3]+"  ");
				System.out.print(pf[i][4]+"      ");
				System.out.print(gross_salary[i][5]+"  	  ");
				System.out.print(t_reduction[i][6]+"           ");
				System.out.print(net_salary[i][7]);
				System.out.println();
			}
		}
	}

}
