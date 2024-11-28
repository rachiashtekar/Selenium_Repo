package StarPattern;
//*******
//******
//*****
//****
//***
//**
//*
public class Pattern8 {
	public static void main(String[] args) {
		int start=7;
		for(int i=0;i<=7;i++) {
			for(int j=0;j<start;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			start--;
		}
	}

}
