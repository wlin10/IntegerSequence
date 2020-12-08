import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start,end,current;
  public Range(int start, int end){
    if (start > end){
      throw new IllegalArgumentException ("Start should be less than or equal to end.");
    }
    this.start = start;
    this.end = end;
    this.current = start;
  }
  public void reset(){
    this.current = this.start;
  }
  public int length(){
    return (end - start + 1);
  }
  public boolean hasNext(){
    return (current <= end);
  }
  public int next(){
    if (hasNext()) {
      int temp = current;
      current++;
      return temp;
    } else {
      throw new NoSuchElementException ("No more values left.");
    }
  }
}
