public class Test<T extends Number>{

    T[] numArr;

    Test(T[] numArr){
        this.numArr = numArr;
    }

    public double getAvg(){
        double sum =0.0;
        for(int i =0; i < numArr.length; i++){
            sum += numArr[i].doubleValue();
        }
        double avg = sum/numArr.length;
        return avg;
    }


}
