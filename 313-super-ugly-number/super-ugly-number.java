class Solution{
    public int nthSuperUglyNumber(int n,int[] primes){

        long[] superUglyNumbers=new long[n];
        superUglyNumbers[0]=1;

        int totalPrimes=primes.length;
        int[] primePointers=new int[totalPrimes];

        for(int currentIndex=1;currentIndex<n;currentIndex++){

            long nextUgly=Long.MAX_VALUE;

            for(int primeIndex=0;primeIndex<totalPrimes;primeIndex++){
                long candidate=superUglyNumbers[primePointers[primeIndex]]*primes[primeIndex];
                nextUgly=Math.min(nextUgly,candidate);
            }

            superUglyNumbers[currentIndex]=nextUgly;

            for(int primeIndex=0;primeIndex<totalPrimes;primeIndex++){
                long candidate=superUglyNumbers[primePointers[primeIndex]]*primes[primeIndex];
                if(candidate==nextUgly){
                    primePointers[primeIndex]++;
                }
            }
        }

        return (int)superUglyNumbers[n-1];
    }
}
