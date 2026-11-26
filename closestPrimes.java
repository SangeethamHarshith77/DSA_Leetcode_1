
class closestPrimes {
    public int[] closestPrimes(int left, int right) {

        int prev = -1;
        int minDiff = Integer.MAX_VALUE;

        int[] answer = {-1, -1};

        for(int num = left; num <= right; num++) {

            boolean isPrime = true;

            if(num <= 1) {
                isPrime = false;
            }

            for(int i = 2; i * i <= num; i++) {
                if(num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime) {

                if(prev != -1) {

                    int diff = num - prev;

                    if(diff < minDiff) {
                        minDiff = diff;
                        answer[0] = prev;
                        answer[1] = num;
                    }
                }

                prev = num;
            }
        }

        return answer;
    }
}
