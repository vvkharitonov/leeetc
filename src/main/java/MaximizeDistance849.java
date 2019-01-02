public class MaximizeDistance849 {

    public static  int maxDistToClosest(int[] seats) {
        int index1=0;
        int indexLast=0;
        int indexLast1=0;
        int indexFloatStart =0;
        int indexFloatEnd=0;
        int largest=0;
        int count=0;
        int lastChar=-1;

        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 0) {
                index1++;
            } else {
                break;
            }
        }


        for (int i = seats.length-1; i >= 0; i--) {
            if (seats[i] == 0) {
                indexLast++;
            } else {
                break;
            }
        }


        for (int i = 0; i <seats.length ; i++) {
            if(seats[i]==0)
            {
            if(lastChar==1){
                count=1;
                indexFloatStart=i;
                lastChar=0;
            }
            else {
                count++;
                indexFloatEnd=i;
                lastChar=0;
            }

            }
            else{
                if(count>largest) {
                    largest = count;
                    indexLast1 = indexFloatEnd;
                    lastChar=1;
                }
                else
                {                    lastChar=1;
                }
            }
        }

        count = largest;
        count=count%2==0?count/2:count/2+1;

        if (index1>indexLast)
        {
            if(index1>count) return index1;
            else return count;
        }
        else
        {
            if(indexLast>count) return indexLast;
            else return count;
        }




    }

    public static void main(String[] args) {
        int[] seats = {0,0,1};
//        int[] seats = {1,0,0,0,1,0,1};
        System.out.println(maxDistToClosest(seats));

    }

}
