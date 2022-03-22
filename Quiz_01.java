
public class Quiz_01 {
	public static void main(String[] args) {
		int kor, mat, eng, sum;
		float avg;
		kor = 90;
		mat = 80;
		eng = 100;
		sum = kor + mat + eng;
		avg = sum/3;
		System.out.printf("Korean: %d\nMath: %d\nEnglish: %d\nSum: %d\nAvg: %.1f", kor, mat, eng, sum, avg);
	}
}
