import java.util.Scanner;
public class a417 {
 public static void main(String[] args) {
  System.out.print("請輸入矩陣的行列數:");

  Scanner scanner = new Scanner(System.in);
  try {
   int strIn = scanner.nextInt();
  } catch (IOException e) {
   System.out.println(e.toString());
  }
  int int1 = Integer.parseInt(strIn);
  int n = int1;
  System.out.println("這是行列數為" + n + "的螺線型數組:");
  int intA = 1; // 初始化
  int[][] array = new int[n][n];
  int intB;
  if (n % 2 != 0) {
   intB = n / 2 + 1; // 奇數時i循環次數
  } else
   intB = n / 2; // 偶數時i循環次數
  for (int i = 0; i < intB; i++) { // 從外到裡循環
   // 從左到右橫的開始
   for (int j = i; j < n - i; j++) {
    array[i][j] = intA;
    intA++;
   }
   // 從上到下縱
   for (int k = i + 1; k < n - i; k++) {
    array[k][n - i - 1] = intA;
    intA++;
   }
   // 從右到左橫
   for (int l = n - i - 2; l >= i; l--) {
    array[n - i - 1][l] = intA;
    intA++;
   }
   // 從下到上縱
   for (int m = n - i - 2; m > i; m--) {
    array[m][i] = intA;
    intA++;
   }
  }
  // 輸出數組
  for (int i = 0; i < n; i++) {
   for (int j = 0; j < n; j++) {
    System.out.print(array[i][j] + " ");
   }
   System.out.println();
  } }
}