import java.util.Arrays;

public class SubStringsOfAString {

    public static final void main(String[] args) {
        //int[] array = {1,1,0,0,1,1,0,0,1,0,0,1,0,0,1,0};
        //int[] array = {-969,-948,350,150,-59,724,966,430,107,-809,-993,337,457,-713,753,-617,-55,-91,-791,758,-779,-412,-578,-54,506,30,-587,168,-100,-409,-238,655,410,-641,624,-463,548,-517,595,-959,602,-650,-709,-164,374,20,-404,-979,348,199,668,-516,-719,-266,-947,999,-582,938,-100,788,-873,-533,728,-107,-352,-517,807,-579,-690,-383,-187,514,-691,616,-65,451,-400,249,-481,556,-202,-697,-776,8,844,-391,-11,-298,195,-515,93,-657,-477,587};
        //int[] array = {-584,-714,-895,-512,-718,-545,734,-886,701,316,-329,786,-737,-687,-645,185,-947,-88,-192,832,-55,-687,756,-679,558,646,982,-519,-856,196,-778,129,-839,535,-550,173,-534,-956,659,-708,-561,253,-976,-846,510,-255,-351,186,-687,-526,-978,-832,-982,-213,905,958,391,-798,625,-523,-586,314,824,334,874,-628,-841,833,-930,487,-703,518,-823,773,-730,763,-332,192,985,102,-520,213,627,-198,-901,-473,-375,543,924,23,972,61,-819,3,432,505,593,-275,31,-508,-858,222,286,64,900,187,-640,-587,-26,-730,170,-765,-167,711,760,-104,-333};
        //int[] array = {2,3,4,3,4,4,1};
        //int[] array = {-533,-666,-500,169,724,478,358,-38,-536,705,-855,281,-173,961,-509,-5,942,-173,436,-609,-396,902,-847,-708,-618,421,-284,718,895,447,726,-229,538,869,912,667,-701,35,894,-297,811,322,-667,673,-336,141,711,-747,-132,547,644,-338,-243,-963,-141,-277,741,529,-222,-684,35};
        int[] array = {16, 3, 3, 6, 7, 8, 17, 13, 7};
        int[][] B = {{2, 6}, {4, 7}, {6, 7}};
        System.out.println(solve(array, B));
    }

    public static int[] solve(int[] A, int[][] B) {
        int[] ans = new int[B.length];
        for (int i = 0; i < B.length; i++) {
            int L = B[i][0];
            int R = B[i][1];
            int count = 0;
            for (int j = L; j <= R; j++) {
                if (isComposite(A[j])) {
                    count++;
                }
            }
            ans[i] = count;
            System.out.println(" ans: " + ans[i]);
        }
        return ans;
    }

    public static boolean isComposite(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return true;
        }
        return false;
    }

    /*public static int solveMagic(int[] A) {
        int ans = 0;
        for (int i = 0; i < A.length; i++) {
            System.out.println(" starting start: " + (A[i] % 2));
            System.out.println(" starting start: " + (A[i] % 3));
            System.out.println(" ");
            if (A[i] % 2 == 0 || A[i] % 3 != 0) continue;

            System.out.println(" starting: " + i);
            for (int j = i; j < A.length; j++) {
                if (A[j] % 2 != 0 || A[j] % 3 != 0) continue;
                System.out.println(" ending: " + j);
                for (int k = i + 1; k < j; k++) {
                    if (A[k] % 2 != 0 || A[k] % 3 != 0) break;
                    ans = Math.max(ans, j - i);
                    System.out.println(" magic: " + A[k]);
                }
            }
        }
        return ans;
    }*/

    public static void printDiagonalsOfSquareMatrix() {
        int i = 0, j = 3;
        while(i <= 3 && j >= 0) {
            //System.out.println(array[i][i] + " " + array[i][j]);
            i++;
            j--;
        }
    }
/*
    public static void printDiagonalsOfRectangularMatrix() {
        for (int c = 0; c < M;c++) {
            int i = 0, j = c;
            while(i <= N-1 && j >= 0) {
                i++; j--;
            }
        }
        for (int r = 0; r < N; r++) {
            int i = r, j = M -1;
            while(i <= N -1 && j >= 0) {
                i++; j--;
            }
        }

    }

    public static void findTranspose() {
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < M; c++) {
                ans[c][r] = mat[r][c];
            }
        }
    }*/

    public static int solve1(int[] A, int B) {
        int totalSum = 0;
        for (int i = 0; i < A.length; i++) {
            totalSum += A[i];
        }

        int[] pSum = new int[A.length];
        pSum[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            pSum[i] = pSum[i-1] + A[i];
        }

        int sum = 0;
        int ans = totalSum - pSum[A.length - B - 1];
        int start = 0, end = A.length - B;
        while(end < A.length) {
            sum = totalSum - (pSum[end] - pSum[start]);
            start++;
            end++;
            ans = Math.max(ans, sum);
        }
        return ans;
    }

    public static int solve(int[] A, int B) {

        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < B; i++) {
            int sum = 0;
            System.out.println("i: " + i);
            System.out.println("j1 from 0 to " + (B - i));
            for (int j = 0; j < B - i -1; j++) {
                sum += A[j];
                System.out.println("j1 iterarion");
            }
            System.out.println("j2 from " + (A.length -1) +" to " + (A.length -1 - i));
            for (int j = A.length -1 ; j > A.length -1 - i; j--) {
                sum += A[j];
                System.out.println("j2 iterarion");
            }
            System.out.println(" sum: " + sum);
            ans = Math.max(ans, sum);
        }

        return ans;
    }

    public static int bulbs1(int[] bulb) {
        int count = 0;
        boolean flip = false; //Initially we don't flip the states, so flip is false

        for(int i = 0; i < bulb.length; i++) {
            //A bulb is ON when:
            //1. The bulb is ON and it is not supposed to be flipped.
            if (bulb[i] == 1 && !flip) continue;

            //2. The bulb is OFF but it is supposed to be flipped.
            if (bulb[i] == 0 && flip) continue;

            //Now the bulb is OFF, so we turn it ON i.e. increment count and
            //invert the flipping condition for the rest of the bulbs on the right.
            count++;
            flip = !flip;
        }

        return count;
    }

    public static int bulbs(int[] A) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                //System.out.println("Got zero : " + A[i]);
                printArray(A);
                A[i] = 1;
                count++;
                for (int j = i + 1; j < A.length; j++) {
                    if (A[j] == 0) A[j] = 1;
                    else if (A[j] == 1) A[j] = 0;
                }
            }
        }
        return count;
    }

    public static void printArray(int[] array) {
        for (int i =0;i < array.length; i++) {
            System.out.print(", " + array[i]);
        }
        System.out.print("\n ");
    }



    /*public int solve(String A) {
        int sizeA = -1;
        int ans = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == 'A') {
                sizeA = sizeA + 1;
            } else if (A.charAt(i) == 'G') {
                ans = ans + sizeA;
            }
        }


    }*/

/*    public int solve(int[] A) {

        int max = A[0], min = A[0];

        for (int i = 1; i < A.length; i++) {
            if (A[i] > max) max = A[i];
            else if (A[i] < min) min = A[i];
        }
        int lastMinIndex = -1, lastMaxIndex = -1;
        int ans = A.length;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == min) {
                lastMinIndex = i;
                if (lastMaxIndex > -1) {
                    ans = Math.min(ans, i - lastMaxIndex + 1);
                }
            }
            if (A[i] == max) {
                lastMaxIndex = i;
                if (lastMinIndex > -1) {
                    ans = Math.min(ans, i - lastMinIndex + 1);
                }
            }
        }

        return ans;

    }*/






}
