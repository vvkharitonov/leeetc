public class RobotReturntoOrigin657 {
    public static boolean judgeCircle(String moves) {
    int U=0;
        int D=0;
        int L=0;
        int R=0;

        for (int i = 0; i <moves.length() ; i++) {
            switch (moves.charAt(i)) {
                case 'U':
                    U++;
                    break;
                case 'D':
                    D++;
                    break;
                case 'L':
                    L++;
                    break;
                case 'R':
                    R++;
                    break;
            }
        }

        if(U==D && L==R) return true;
        else return false;

    }

    public static void main(String[] args) {
        String moves="UUDDLLRR";
        System.out.println(judgeCircle(moves));
    }
}
