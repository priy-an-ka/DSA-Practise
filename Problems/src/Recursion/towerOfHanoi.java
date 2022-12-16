package Recursion;

public class towerOfHanoi {
    public static void towerOfHanoi(int disks, int source, int temp, int destination)
    {
        if(disks==0)
            return;
        towerOfHanoi(disks-1, source, destination, temp);
        System.out.println("Disk no "+ disks+": "+ source +  "->" + destination);
        towerOfHanoi(disks-1, temp, source, destination);


    }

    public static void main(String args[]){
        int source = 1;
        int temp = 2;
        int destination = 3;
        int disks = 3;
        towerOfHanoi(disks, source, temp, destination);

    }


}
