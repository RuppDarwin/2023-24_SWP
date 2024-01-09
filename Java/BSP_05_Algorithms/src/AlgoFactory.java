import rup.algorithms.Algorithm;
import rup.algorithms.BubbleSort;
import rup.algorithms.SelectionSort;

public class AlgoFactory {

    public String AlgoType = new String();

    public Algorithm chooseAlgo(){
        switch (this.AlgoType){
            case "BubbleSort":
                return new BubbleSort();
            case "SelectionSort":
                return new SelectionSort();
            default:
                return null;
        }
    }
}
