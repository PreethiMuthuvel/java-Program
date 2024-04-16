package DynamicProgramming;

public class MinimumJump {

	public static int minJumps(int[] arr) {
		int n = arr.length;
        if (n <= 1) return 0; // If array size is 0 or 1, no jumps needed
        
        int[] jumps = new int[n]; // Array to store the minimum jumps required to reach each index
        jumps[0] = 0; // No jump needed to reach the first index
        
        for (int i = 1; i < n; i++) {
            jumps[i] = Integer.MAX_VALUE; // Initialize jumps to max value
            
            for (int j = 0; j < i; j++) {
                // Check if it's possible to reach index i from index j
                if (j + arr[j] >= i) {
                    // If reachable, update jumps[i] with the minimum of its current value and jumps[j] + 1
                    jumps[i] = Math.min(jumps[i], jumps[j] + 1);
                }
            }
        }
        
        return jumps[n - 1]; // Return the minimum jumps required to reach the last index
    }
    
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 1,4,5};
        System.out.println("Minimum number of jumps required: " + minJumps(arr));
    
	}

}
