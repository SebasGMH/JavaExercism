class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int square_sum = 0;

        for (int i = 1; i <= input; i++){
            square_sum += i;
        }
        square_sum *= square_sum;

        return square_sum;
    }

    int computeSumOfSquaresTo(int input) {
        int sum_square = 0;

        for (int i = 1; i <= input; i++){
             sum_square = sum_square + (i * i);
        }
        return sum_square;
    }

    int computeDifferenceOfSquares(int input) {
        int diff = computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
        return Math.abs(diff);
    }
}
