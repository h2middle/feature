package sec02.chap02;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int result[] = {0, 0, 0, 0}; //OUTPUT
        int menu[] = {4, 1, 2, 3};  //INPUT
        int ladder[][]= {
                {1,0,0},
                {0,0,1},
                {0,1,0},
                {0,1,0},
                {1,0,0},
                {0,0,0}};   //LADDER

        int x=0, y=0, z = 0, a = 0;

        for (x = 0; x < menu.length; x++){
            a = x;
            for(int i=0; i<ladder.length; i++) {

                System.out.print(a + " ");

                if (a==0){

                    if (ladder[y][a] == 0) {

                    } else if (ladder[y][a] == 1) {
                        a += 1;

                    }

                } else if (a == menu.length-1) {

                    if (ladder[y][a-1] == 0) {

                    } else if (ladder[y][a-1] == 1) {
                        a -= 1;

                    }

                } else {

                    if (ladder[y][a-1] == 0 && ladder[y][a] == 0) {

                    } else if (ladder[y][a-1] == 1) {
                        a -= 1;

                    } else if (ladder[y][a] == 1) {
                        a += 1;

                    }
                }
                y += 1;
            }
            y=0;
            System.out.println();
            result[a] = menu[z];
            z+=1;
        }
        System.out.println(Arrays.toString(result));
    }
}
// 마지막 row(0,0,0)를 제거하고도 값이 나올 수 있도록 만들기