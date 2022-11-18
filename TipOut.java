

import java.util.Scanner;

public class TipOut {
	int tables;
	double sales;
	int host;
	int runner;
	int busser;
	int bar;
	
	public TipOut(int tables, double sales, int host, int runner, int busser, int bar) {
		super();
		this.tables = tables;
		this.sales = sales;
		this.host = host;
		this.runner = runner;
		this.busser = busser;
		this.bar = bar;
	}
	public void weekendNight()
	{
		if(host == 1) {
			System.out.println("Host: " + tables * 0.7);
		} else {
			System.out.println("Host: " + tables * 0.4);
		}
		
		if(runner == 1) {
			System.out.println("Runner: " + sales * 0.015);
		}else if(runner == 2) {
			System.out.println("Runner: " + sales * 0.009);
		}else {
			System.out.println("Runner: " + sales * 0.007);
		}
		
		if(busser == 1) {
			System.out.println("Busser: " + sales * 0.012);
		}else if(busser == 2) {
			System.out.println("Busser: " + sales * 0.008);
		}else {
			System.out.println("Busser: " + sales * 0.005);
		}
		
		if(bar == 1) {
			System.out.println("Bar: " + sales * 0.007);
		}else {
			System.out.println("Bar: " + sales * 0.004);
		}
		
	}
	
	public void morning()
	{
		
		System.out.println("Host: " + tables * 0.5);
		
		if(runner == 1) {
			System.out.println("Runner: " + sales * 0.009);
		}else {
			System.out.println("Runner: " + sales * 0.007);
		}
		
		if(busser == 1) {
			System.out.println("Busser: " + sales * 0.008);
		}else {
			System.out.println("Busser: " + sales * 0.005);
		}
		
		System.out.println("Bar: " + sales * 0.005);
	}
	
	public static void main(String[] args) {
		System.out.println("Morning(a) or weekend/night(b)\n# of tables\nSales\n"
				+ "# of host\n# of runners\n# of bussers\n# of bar\n");
		Scanner in = new Scanner(System.in);
		String ab = in.nextLine();
		int tables = in.nextInt();
		double sales = in.nextDouble();
		int host = in.nextInt();
		int runner= in.nextInt();
		int busser= in.nextInt();
		int bar= in.nextInt();
		TipOut tp = new TipOut(tables,sales,host,runner,busser,bar);
		if(ab.contains("a")){
			tp.morning();
		}
		else {
			tp.weekendNight();
		}
	}

}
