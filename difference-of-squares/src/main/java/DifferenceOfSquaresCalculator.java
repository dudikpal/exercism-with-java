class DifferenceOfSquaresCalculator {
    

    int computeSquareOfSumTo(int input) {
        return (int)Math.pow(sumOfNumbers(input), 2);
    }

    
    int computeSumOfSquaresTo(int input) {
        if (input == 0) {
            return 0;
        }
        return (int)Math.pow(input, 2) + computeSumOfSquaresTo(input - 1);
    }

    
    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }
    
    
    private int sumOfNumbers(int input) {
        if (input == 0) {
            return 0;
        }
        return input + sumOfNumbers(input - 1);
    }
    

}
