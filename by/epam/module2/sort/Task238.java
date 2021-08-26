package by.epam.module2.sort;

/*
 * 8.ƒаны дроби p1/q1, p2/q2, ... , pn/qn ( pi, qi - натуральные). —оставить программу,
 *  котора€ приводит эти дроби к общему знаменателю и упор€дочивает их в пор€дке возрастани€.
 * */

public class Task238 {
	final static int MINIMUM_HOPE_SHELL_SORT = 1;
	
	public static void main(String[] args) {
		//int[] mass1 = { 0, 1, 10, 2, 3, 33, 4, 5, 100, 1 };
		//int[] mass2 = { 14, 52, 36, 27, 58, 87, 2, 90, 88, 17 };
		
		int[] mass1 = {0, 1, 2};
		int[] mass2 = {20, 4, 8};

		if (isMatrixCorrect(mass1, mass2)) {
			System.out.println("Matrices is not exist or correct");
		}

		double denuminator;
		double[] numerator;
		
		denuminator = findDenominator(mass2);
		numerator = findNumerator(mass1, mass2, denuminator);
		
		int h;
		
		h = findMaxHope(numerator);
	    
        while (h >= 1){
            sortShell(h, numerator);
            h /= 3;
        }
        
		for (int i = 0; i < numerator.length; i++) {
			System.out.print(numerator[i] + "/" + denuminator + " ");
		}
	}

	private static boolean isMatrixCorrect(int[] mass1, int[] mass2) {

		if (mass1 == null || mass2 == null || mass1.length == 0 || mass2.length == 0) {

			return false;
		}

		if (mass1.length != mass2.length) {

			return false;
		}

		return true;
	}

	private static double findDenominator(int[] mass) {
		double nok;
		
		nok = mass[0];
		for (int i = 1; i < mass.length; i++) {
			nok = findNOK(nok, mass[i]);
		}
		
		return nok;
	}

	private static double findNOD(double val1, double val2) {
		while (val1 != 0 && val2 != 0) {
			if (val1 > val2) {
				val1 %= val2;
			} else {
				val2 %= val1;
			}
		}
		return val1 + val2;
	}
	
	private static double findNOK(double val1, double val2) {		
		return (double)Math.abs(val1 * val2)/findNOD(val1, val2);
	}

	private static double[] findNumerator(int mass1[], int mass2[], double denumerator) {
		double[] numerator = new double[mass1.length];
		
		for (int i = 0; i < mass1.length; i++) {
			numerator[i] = denumerator / mass2[i] * mass1[i];
		}
		
		return numerator;
	}
	
	private static int findMaxHope(double[] mass) {
    	int h;
    	
    	h = MINIMUM_HOPE_SHELL_SORT;
    	
    	while (h < mass.length){
            h = h * 3 + 1;
        }
    	
    	return h;
    }

    private static void sortShell(int h, double[] mass){
    	double buffer;
    	
        for (int i = h; i < mass.length; i++) {
            for (int j = i; j >= h; j -= h) {
            	
                if(mass[j] < mass[j - h]){
                    buffer = mass[j];
                    mass[j] = mass[j - h];
                    mass[j - h] = buffer;
                }
                
            }
        }
        
    }
}
