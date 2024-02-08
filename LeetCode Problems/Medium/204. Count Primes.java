//https://leetcode.com/problems/count-primes/

public int CountPrimes(int N){
        //Using Sieve of Eratosthenes
        boolean [] isPrime= new boolean[N+1];
        Arrays.fill(isPrime,true);
        isPrime[0]=false;
        isPrime[1]=false;
        for(int i=2;i*i<=N;i++){
            if(isPrime[i]){
                for(int j=i*i;j<=N;j+=i){
                    isPrime[j]=false;
                }
            }
        }
        int count=0;
        for(int i=0;i<isPrime.length;i++){
            if(isPrime[i]){
                count++;
            }
        }
        return count;


    }
    public int countPrimes(int n) {
        if(n<=2)
            return 0;
        return CountPrimes(n-1);
    }
