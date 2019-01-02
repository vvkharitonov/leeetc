public class RotatedDigits788 {

    public static int rotatedDigits(int N) {
        int x=0;
        int d[]={0,0,0,0};
        int r[]={0,0,0,0};

        for (int i = 0; i <=N ; i++) {

//            A number is valid if each digit remains a digit after rotation.

//            0, 1, and 8 rotate to themselves;
//            2 and 5 rotate to each other;
//            6 and 9 rotate to each other,
//
//            and the rest of the numbers do not rotate to any other number and become invalid.
//            3 4 7
            if(i==10000) continue;

            d[3]=i/1000%100;
            d[2]=i/100%10;
            d[1]=i/10%10;
            d[0] = i%10;

            if (d[0]==3 ||d[1]==3 ||d[2]==3 ||d[3]==3 ||d[0]==4 ||d[1]==4 ||d[2]==4 ||d[3]==4 ||d[0]==7 ||d[1]==7 ||d[2]==7 ||d[3]==7 ) {continue;}
            else {

                //rotate
                for (int j = 0; j <=3; j++) {
                    switch (d[j]) {
                        case 0:
                            r[j] = d[j];
                            break;
                        case 1:
                            r[j] = d[j];
                            break;
                        case 8:
                            r[j] = d[j];
                            break;
                        case 2:
                            r[j] = 5;
                            break;
                        case 5:
                            r[j] = 2;
                            break;
                        case 6:
                            r[j] = 9;
                            break;
                        case 9:
                            r[j] = 6;
                            break;
                    }

                }
                if (d[0]==r[0] && d[1]==r[1] && d[2]==r[2] && d[3]==r[3]  ) continue;
                System.out.println(i+ " = " +d[3] + " "+ d[2] + " "+d[1]+ " "+d[0]+  "|| " +r[3] + " "+ r[2] + " "+r[1]+ " "+r[0]);
                x++;
            }



        }
        
        return x;
    }

    public static void main(String[] args) {

        int N=1591;
        System.out.println(rotatedDigits(N));
    }

}
