/*Write a program to print Left down alphabet triangle pattern using loop
ABCDE
ABCD
ABC
AB
A*/

class Alpha_Trigle{
	public void Tri_gle(){
	 int i, j, n = 5;
    for (i = 1; i <= n; i++)
    {
        for (j = i; j <= n; j++)
		{
			System.out.print('A');
		}
		System.out.println(" ");
	}
	}
	public static void main(String args[]){
		Alpha_Trigle zaid=new Alpha_Trigle();
		zaid.Tri_gle();
	}
}
