import java.util.Scanner;
public class a417{
  public static void main (String []argv){
  Scanner scanner = new Scanner(System.in);

  
  int x,y,num,m,tmpx,tmpy;
  boolean finish;
  int t = scanner.nextInt(); 
  int cwx[]={1,0,-1,0},cwy[]={0,1,0,-1};  //���ɰw��J ��(0,0)�X�o�A�V�k�A�V�U�A�V���A�V�W
  int ccx[]={0,1,0,-1},ccy[]={1,0,-1,0};    //�f�ɰw��J ��(0,0)�X�o�A�V�U�A�V�k�A�V�W�A�V��
    for(int i = 0 ; i < t ; i++){
      int n = scanner.nextInt();            //�j�p
      int c = scanner.nextInt();            //�Ҧ� 1������ 2�f����  
      int a[][] = new int [100][100];
      finish=false;
      a[0][0]=1;
      num=2;
      x=y=tmpx=tmpy=0;

      if (c == 1) { //���ɰw     
        for (int j = 0; j <= n / 2; j++) { //�ѥ~��줺��ݭn��n/2
          for (int k = 0; k < 4; k++) { //�|�Ӥ�V
            if (!finish){
              for (m = 1; m < n; m++) { //�̦h��n-1�ӡA�]��(0,0)���e�w�g��F
                if (a[y + cwy[k] * m][x + cwx[k] * m] == 0) { //�Y�S����L
                  a[y + cwy[k] * m][x + cwx[k] * m] = num; //��s�}�Ca
                  tmpx = x + cwx[k] * m; //�Ȧs�{�b��X�y�Ш�tmpx
                  tmpy = y + cwy[k] * m; //�Ȧs�{�b��Y�y�Ш�tmpy
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
            x = tmpx; //����I�Nx��s��tmpx
            y = tmpy; //����I�Ny��s��tmpy
          }
        }
      }  

      if (c == 2) { //�f�ɰw                  
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
      for(int j=0;j<n;j++){  //�L�X���G
        for(int k=0;k<n;k++){
          System.out.printf("%5d",a[j][k]);
        }  
        System.out.println();
      }
    }
  }
}