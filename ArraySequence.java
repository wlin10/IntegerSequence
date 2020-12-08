import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int []data;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int [] other){
    for (int i = 0; i < other.length; i++) {
      data[i] = other[i];
    }
  }

  public void reset(){
    this.currentIndex = 0;
  }
  public int length(){

  }
  public boolean hasNext(){

  }
  public int next(){
    
  }

  public ArraySequence(IntegerSequence otherseq){

  }

}
