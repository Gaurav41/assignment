class Functions {

	public void add(int a, int b) {
		int c=a+b;
		c=(c<0)?(-c):(c); 
		System.out.println(c);
	}

	
	public void multiply(int a, int b) {
		System.out.println(a * b);
	}
	

	public void subtract(int a, int b) {
		int c=a-b;
		c=(c<0)?(-c):(c); 
		System.out.println(c);
	}

	public static void main(String args[]) {

	}

}
