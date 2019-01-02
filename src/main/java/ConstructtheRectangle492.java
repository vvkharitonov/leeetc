public class ConstructtheRectangle492 {

    public static int[] constructRectangle(int area) {
        int[] rect = {1,1};
        if (area == 1) return rect;
//        if (area == 2)
//        {   rect[0] =  2;
//            rect[1]= 1;
//            return rect;}

        float mean;
        mean = (float)Math.sqrt(area);

        float z;
        int zz;

        for (int i = (int)(mean+0.99);i<=area;i++){
            z = (float) area/i;
            zz= (int) z;
            if (i>=zz && (zz%z==0) )
            {
                rect[0]=i;rect[1]=area/rect[0];
                break;
            }
        }

//        public static int[] constructRectangle(int area) {
//            int[] rect = {1,1};
//            if (area == 1) return rect;
//
//
//
//            for (int i = (int) Math.sqrt(area)-1; i <= area ; i++) {
//                for (int j = i; j >0; j--) {
//                    if (j*i==area) {
//                        rect[0] = i;
//                        rect[1] = j;
//                        return rect;
//                    }
//
//                }
//            }
                
                
        return rect;
    }

    public static void main(String[] args) {
        int area =9999998;
        System.out.println(constructRectangle(area)[0] +" " + constructRectangle(area)[1]);
    }
}
