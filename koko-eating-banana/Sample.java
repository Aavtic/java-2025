class Main {
    public static void main(String args[]) {
        int arr[] = {332484035,524908576,855865114,632922376,222257295,690155293,112677673,679580077,337406589,290818316,877337160,901728858,679284947,688210097,692137887,718203285,629455728,941802184};
        // 
        Main s = new Main();
        System.out.println("Solution: " + s.minEatingSpeed(arr, 823855818));
    }
    public int minEatingSpeed(int[] piles, int h) {        
        int low = 1;
        int high = 0;

        for (int pile: piles) {
            if (pile > high)
                high = pile;
        }
        System.out.println("high = " + high);

        while (low <= high) {
            int mid = (low + high) / 2;
            long time = 0;
            for (int pile: piles) {
                time += (pile + mid - 1) / mid; 
            }

            if (time > h) 
                low = mid + 1;
            else {
                high = mid - 1;
            }
            System.out.println("Time for " + mid + " banana per second " + time);
        }

        //for (int speed=1; speed<max+1; ++speed) {
        //    long time = 0;
        //    for (int pile: piles) {
        //        System.out.println("Pile = " + pile + " speed = " + speed + " pile / speed = " + pile / speed);
        //        time += pile / speed;
        //
        //        if (pile % speed != 0) {
        //            System.out.println("rem?");
        //            time += 1;
        //        }
        //    }
        //
        //    System.out.println("Time for " + speed + " banana per second " + time);
        //    if (time <= h) {
        //        return speed;
        //    }
        return low;
    }
}
