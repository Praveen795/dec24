package dec24;

public class dec24 {
	public static void main(String[] args) {
		
//________________[problem1]_________________________________________________***
		
		int a=6;
		
		for(int i=1;i<a;i++) {
			System.out.println(i);
		}
//       time complexity o(n)
		
//_________________________[2nd problem]______________________________________***
		System.out.println("2nd problem");
		int  n=8;
		for(int i=1;i<n;i=i*2) {
			System.out.println(n);
		}
		
//      time complexity is o(log n)
		
//___________________[3rd problem]___________________________________________***
		
		System.out.println("3rd problem");
		
		int num=5;
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(i+"  ");
			}
			System.out.println();
		}
//     time complexity o(n*n)
		
		
		
	}

}
