package ie.atu;

public class Calculator { //Creating the class Calculator
    public int add(int firNum, int secNum) { //Method to add two numbers *
        return firNum + secNum;
    }

    public int sub(int firNum, int secNum) { //Method to subtract two numbers *
      return firNum - secNum;
    }

    public int mul(int firNum, int secNum) { //Method to multiply two numbers *
        return firNum * secNum;
    }

    public int div(int firNum, int secNum) { //Method to divide two numbers
        return firNum / secNum;
    }

    public int power(int firNum, int secNum) {
        int tempResult = firNum;

        for(int i = secNum; i > 1; i--){
            tempResult = tempResult * firNum;
        }

        return tempResult;
    }

}
