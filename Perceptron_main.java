package perceptron;

public class Perceptron_main {
/*	double output[] = {1, 0, 0, 0}; とすることで、AND演算用判定関数に変更した。*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nu[] = {0.35, 0.2};
		Perceptron_lib plib = new Perceptron_lib(2, nu, 0.01, 0.5);
		
		//学習データ
		double input[][] = { {1,1}, {1,0}, {0,1}, {0,0} };
		//double output[] = {1, 1, 1, 0};    OR
		//AND
		double output[] = {1, 0, 0, 0};
		//上の{1, 1, 1, 0}は{ {1,1}, {1,0}, {0,1}, {0,0} }に対応している;
		
		int index;
		for(int i = 0; i < 1000; i++){
			index = (int)(Math.random()*4);  //0から3の乱数発生
			plib.getParameter(input[index], output[index]);
			System.out.println("index : "+i+"nu = "+nu[0]+", "+nu[1]);
		}
		//結果確認
		for(int i= 0; i< output.length; i++){
			if(plib.getOutput(input[i]) == output[i])
				System.out.println("Correct! : input("+input[i][0]+","+input[i][1]+") to output("+output[i]+")");
			else System.out.println("Miss! : input("+input[i][0]+","+input[i][1]+") to output("+output[i]+")");
		}
		System.out.println("Check : nu = "+nu[0]+","+nu[1]);
		
	}
}


