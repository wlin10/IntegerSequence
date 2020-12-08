import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start,end,current;
  public Range(int start, int end){
    this.start = start;
    this.end = end;
  }
  public void reset(){

  }
  public int length(){
    return (end - start + 1);
  }
  public boolean hasNext(){

  }
  public int next(){
    if (hasNext()) {
      return current;
    } else {
      throw new NoSuchElementException ("No more values left.");
    }
  }
}
