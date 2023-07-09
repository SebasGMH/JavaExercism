class Scrabble {
    // can use hashmap or 27 element array
    // will use both methods

    private String word;
    private int[] points = new int[27];

    Scrabble(String word) {
        this.word = word.toLowerCase();

        // array
        int[] points = new int[27];
        points[0] = 0;
        points[1] = 1;
        points[2] = 3;
        points[3] = 3;
        points[4] = 2;
        points[5] = 1;
        points[6] = 4;
        points[7] = 2;
        points[8] = 4;
        points[9] = 1;
        points[10] = 8;
        points[11] = 5;
        points[12] = 1;
        points[13] = 3;
        points[14] = 1;
        points[15] = 1;
        points[16] = 3;
        points[17] = 10;
        points[18] = 1;
        points[19] = 1;
        points[20] = 1;
        points[21] = 1;
        points[22] = 4;
        points[23] = 4;
        points[24] = 8;
        points[25] = 4;
        points[26] = 10;
        
        this.points = points;
        
    }

    int getScore() {
        int score=0;
        int acsci;
        for(int i= 0; i < word.length(); i++){
            if (word.charAt(i) == ' '){
                continue;
            }
            acsci = (int) word.charAt(i);
            acsci -= 96;
            score += points[acsci];
        }

        return score;
    }

}
