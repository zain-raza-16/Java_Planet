public class CommonBitTasks {
    public boolean getBit(int num ,int i){
        return ((num & (1<<i)) != 0);
    }

    public int setBit(int num ,int i){
        return num | (1<<i);
    }

    public int clearBitsMSBThroughI(int num, int i){
        int mask = (1 << i) -1;
        return num & mask;
    }
    public int clearBitsIThrough0 (int num , int i){
        int mask = (-1<< (i+1));
        return num & mask;
    }


    public static void main(String[] args){
        CommonBitTasks hello = new CommonBitTasks();
        System.out.println(hello.getBit(10,3));
        System.out.println(hello.clearBitsIThrough0(15,2));
//        System.out.println(hello.setBit(10,1));
        System.out.println(10100);
//        System.out.println(hello.clearBitsMSBThroughI(15,2));
    }
}
