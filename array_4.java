public class array_4 {
    public static void main(String args[]){
        int fBed[]={1,0,0,0,1};
        int n=1;
        boolean put=flower(fBed,n);
        System.out.println(put);
    }
    public static boolean flower(int[] fBed,int n){
        int x=0;
        int y=fBed.length - 1;
        int i=0;
        while(i<y){
            if (fBed[i] == 0 && (i == 0 || fBed[i - 1] == 0) && (i == y || fBed[i + 1] == 0)) {
                fBed[i]=1;
                x++;
                if(x>=n){
                    return true;
                }
        }
        i++;
    }
    return false;
    }
}


