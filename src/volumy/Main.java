package volumy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String s = "味噌汁と塩飴と鯛焼と牛乳飴";
		System.out.println("机の上に、「"+s+"」がある。");
		System.out.println("どれがいいですか？");
		System.out.println("1.味噌汁　2.塩飴　3.鯛焼　4.牛乳飴　5.全部");
		String[] choice = s.split("と");
		Scanner sc = new Scanner(System.in);
			
					int i = sc.nextInt();				
					if(i>=1 && i<=4) {
						System.out.println("「ボリューミーにする」を唱えた！");
						String w = choice[i-1].replaceAll("[汁飴焼]", "ラーメン");
						System.out.println("「"+w+"」に変わった。");
					}else if(i == 5){
						System.out.println("「ボリューミーにする」を唱えた！");
						String w = s.replaceAll("[汁飴焼]", "ラーメン");
						System.out.println("「"+w+"」に変わった。");
					}
					else {
						System.out.println("1～5の数字を入力してください。");
					
					}
					
		}
}

