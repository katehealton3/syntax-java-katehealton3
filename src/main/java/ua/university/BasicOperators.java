package ua.university;


/**
 * BasicOperators class contains a set of static methods
 * for practicing Java operators, loops, arrays, and branching.
 */
public class BasicOperators {

    /**
     * Returns the sum and average of three integers.
     *
     * @param a first integer
     * @param b second integer
     * @param c third integer
     * @return double array where [0] = sum, [1] = average
     */
    public static double[] sumAndAverage(int a, int b, int c) {
        double[] Arr = new double[2];
        Arr[0]=a+b+c;
        Arr[1]=(a+b+c)/3;
        
        return Arr;
    }

    /**
     * Returns the maximum of three integers.
     */
    public static int maxOfThree(int a, int b, int c) {
        if(a>=b && a>=c){
            return a;
        }
        if(b>=a && b>=c ){
            return b;
        }
        return c;
    }

    /**
     /**
     * Returns the corresponding grade letter for a given numeric score.
     * <p>
     * The grading scale is as follows:
     * <ul>
     *     <li>90–100: 'A'</li>
     *     <li>80–89:  'B'</li>
     *     <li>70–79:  'C'</li>
     *     <li>60–69:  'D'</li>
     *     <li>50–59:  'E'</li>
     *     <li>0–49:   'F'</li>
     * </ul>
     *
     * @param score the numeric score, expected to be between 0 and 100 inclusive
     * @return the grade letter corresponding to the given score
     * @throws IllegalArgumentException if {@code score} is less than 0 or greater than 100
     */
    public static char gradeFromScore(int score) {
        if(score>=0 && score<=100){
            if(score<50) return 'F';
            if(score<60) return 'E';
            if(score<70) return 'D';
            if(score<80) return 'C';
            if(score<90) return 'B';
            return 'A';    
        }
        else{
            throw new IllegalArgumentException("Incorrect score!");
        }
    }

    /**
     * Returns the day of the week name for a number 1-7.
     */
    public static String dayOfWeek(int day) {
        switch(day){
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default: 
                throw new IllegalArgumentException("Incorrect day!");          
        }
        
        
    }

    /**
     * Returns an array counting down from n to 1.
     */
    public static int[] countdown(int n) {
        if(n>0){
            int[] Arr=new int[n];
            for(int i=0; i<n; i++){
                Arr[i]=n-i;
            }
            return Arr;
        }
        else{
            throw new IllegalArgumentException("Invalid number!");
        }
        
        
    }

    /**
     * Returns factorial of n.
     */
    public static long factorial(int n) {
        long f=1;
        if(n==0 || n==1){
            return 1;   
        }
        if(n>1){
            for(int i=2; i<=n; i++){
            f=f*i;   
        }
        }
        
        else {
            throw new IllegalArgumentException("Invalid number!"); 
        }
        return f;
        
    }

    /**
     * Returns a reversed copy of the array.
     */
    public static int[] reverseArray(int[] arr) {
        if(arr==null) throw new IllegalArgumentException("Null");
        int[] arr2=new int[arr.length];
        for(int i=arr.length-1; i>=0; i--){
            arr2[arr.length-1-i]=arr[i];
              
        }
        return arr2;
    }

    /**
     * Returns sum of all elements in a 2D array (matrix).
     */
    public static int sumMatrix(int[][] matrix) {
        if(matrix==null) throw new IllegalArgumentException("Null");
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0; j<matrix[i].length; j++){
                sum+=matrix[i][j];
                
            }
        }
        return sum;
    }

    /**
     * Checks if a string is a palindrome.
     */
    public static boolean isPalindrome(String s) {
        if(s==null) throw new IllegalArgumentException("Null");
        for(int i=0; i<s.length()/2; i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){ 
                return false;
                
            }
        }
        return true;
    }

    /**
     * Returns minimum and maximum of an array.
     */
    public static int[] findMinMax(int[] arr) {
        if(arr==null || arr.length<1) throw new IllegalArgumentException("Null");
        int[] minmax=new int[2];
        int max=arr[0];
        int min=arr[0];
        for(int i=1; i<arr.length; i++){
            if (max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
   
        }
        minmax[0]=min;
        minmax[1]=max;
        return minmax;
    }

    /**
     * Returns multiplication table n x n.
     */
    public static int[][] multiplicationTable(int n) {
        if(n<1) throw new IllegalArgumentException();
        int[][] arr=new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=(i+1)*(j+1);
            }
        }
        return arr;
    }

    /**
     * Returns all even numbers up to n.
     */
    public static int[] evenNumbersUpToN(int n) {
        if (n<1) throw new IllegalArgumentException();
        int[] even=new int[n/2];
        even[0]=2;
        if(n>1){
            for(int i=1; i<n/2; i++){
                even[i]=even[i-1]+2;
        }
        }
        
        return even;
    }

    /**
     * Checks if a number is prime.
     */
    public static boolean isPrime(int n) {
        if(n==2) return true;
        for(int i=2; i<Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    /**
     * Counts vowels in a string.
     */
    public static int countVowels(String s) {
        String vowels="aeouyi";
        int x=0;
        for(int i=0;i<s.length();i++){
            if(vowels.contains(String.valueOf(s.charAt(i)))){
                x++;
            }
        }
        return x;
    }

    /**
     * Returns first n Fibonacci numbers.
     */
    public static int[] fibonacci(int n) {
        if(n<1) throw new IllegalArgumentException();
        
        int[] fi=new int[n];
        fi[0]=0;
        if(n>1){
            fi[1]=1;    
        }
        for(int i=2; i<n;i++){
            fi[i]=fi[i-1]+fi[i-2];
        }
        return fi;
    }

    /**
     * Returns the transpose of a 2D array (matrix).
     */
    public static int[][] transpose(int[][] matrix) {
        int[][] m2=new int[matrix[0].length][matrix.length];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                m2[j][i]=matrix[i][j];
            }
            
        }
        return m2;
    }

    /**
     * Returns a sorted copy of the array in ascending order.
     */
    public static int[] sortArray(int[] arr) {
        int s=0;
        int[] arr2= arr.clone();
        for(int i=0; i<arr2.length-1; i++){
            for(int j=0; j<arr2.length-1-i; j++){
                if(arr2[j]>arr2[j+1]){
                s=arr2[j];
                arr2[j]=arr2[j+1];
                arr2[j+1]=s;
                
            }
            }
            
        }
        
        return arr2;
    }

}
