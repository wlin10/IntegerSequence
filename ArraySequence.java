import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int []data;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int [] other){
    currentIndex = 0;
    data = new int[other.length];
    for (int i = 0; i < other.length; i++) {
      data[i] = other[i];
    }
  }

  public void reset(){
    this.currentIndex = 0;
  }
  public int length(){
    return data.length;
  }
  public boolean hasNext(){
    return (currentIndex < length());
  }
  public int next(){
    if (hasNext()) {
      int temp = data[currentIndex];
      currentIndex++;
      return temp;
    } else {
      throw new NoSuchElementException ("No more values left.");
    }
  }

    public ArraySequence(IntegerSequence otherseq){
      reset();
      otherseq.reset();
      data = new int[otherseq.length()];
      while (otherseq.hasNext()) {
        data[currentIndex] = otherseq.next();
        currentIndex++;
      }
      reset();
      otherseq.reset();
    }

}
