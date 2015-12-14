import java.util.Scanner;
public class a417{
  public static void main (String []argv){
  Scanner scanner = new Scanner(System.in);

  
  int x,y,num,m,tmpx,tmpy;
  boolean finish;
  int t = scanner.nextInt(); 
  int cwx[]={1,0,-1,0},cwy[]={0,1,0,-1};  //順時針填入 由(0,0)出發，向右，向下，向左，向上
  int ccx[]={0,1,0,-1},ccy[]={1,0,-1,0};    //逆時針填入 由(0,0)出發，向下，向右，向上，向左
    for(int i = 0 ; i < t ; i++){
      int n = scanner.nextInt();            //大小
      int c = scanner.nextInt();            //模式 1順時鐘 2逆時鐘  
      int a[][] = new int [100][100];
      finish=false;
      a[0][0]=1;
      num=2;
      x=y=tmpx=tmpy=0;

      if (c == 1) { //順時針     
        for (int j = 0; j <= n / 2; j++) { //由外圈到內圈需要到n/2
          for (int k = 0; k < 4; k++) { //四個方向
            if (!finish){
              for (m = 1; m < n; m++) { //最多到n-1個，因為(0,0)之前已經填了
                if (a[y + cwy[k] * m][x + cwx[k] * m] == 0) { //若沒有填過
                  a[y + cwy[k] * m][x + cwx[k] * m] = num; //更新陣列a
                  tmpx = x + cwx[k] * m; //暫存現在的X座標到tmpx
                  tmpy = y + cwy[k] * m; //暫存現在的Y座標到tmpy
                  if (num == n * n) {
                    finish = true;
                    break;
                  }
                  num++;
                } else {
                  break;
                }
              }
            }  
            x = tmpx; //轉折點將x更新為tmpx
            y = tmpy; //轉折點將y更新為tmpy
          }
        }
      }  

      if (c == 2) { //逆時針                  
        for (int j = 0; j <= n / 2; j++) {
          for (int k = 0; k < 4; k++) {
            if (!finish) {
              for (m = 1; m < n; m++) {
                if (a[y + ccy[k] * m][x + ccx[k] * m] == 0) {
                  a[y + ccy[k] * m][x + ccx[k] * m] = num;
                  tmpx = x + ccx[k] * m;
                  tmpy = y + ccy[k] * m;
                  if (num == n * n) {
                    finish = true;
                    break;
                  }
                  num++;
                } else {
                  break;
                }
              }
            }  
            x = tmpx;
            y = tmpy;
          }
        }
      }
      for(int j=0;j<n;j++){  //印出結果
        for(int k=0;k<n;k++){
          System.out.printf("%5d",a[j][k]);
        }  
        System.out.println();
      }
    }
  }
}