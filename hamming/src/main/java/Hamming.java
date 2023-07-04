public class Hamming {
    private String left;
    private String right;
    public Hamming(String leftStrand, String rightStrand) {
        // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        // EXCEPTION HANDLING WILL OCCUR HERE

        
        if (leftStrand.isEmpty() && !rightStrand.isEmpty()){
            throw new IllegalArgumentException("left strand must not be empty.");
        }

        if (rightStrand.isEmpty() && !leftStrand.isEmpty()){
            throw new IllegalArgumentException("right strand must not be empty.");
        }

        if (leftStrand.length() != rightStrand.length()){
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }

        left = leftStrand;
        right = rightStrand;
    }

    public int getHammingDistance() {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");

        int ham = 0;
        for (int i = 0; i < left.length(); i++){
            if (left.charAt(i) != right.charAt(i)){
                ham++;
            }
        }
        return ham;
    }
}
