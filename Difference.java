public class Difference implements Expression{

  private Expression firstTerm, secondTerm;
  public Difference(Expression firstTerm, Expression secondTerm){

    this.firstTerm = firstTerm;
    this.secondTerm = secondTerm;

  }
  public Expression derive(){

    return new Difference(firstTerm.derive(), secondTerm.derive());

  }
  public double evaluate(double a){ // f(x) = x

    return firstTerm.evaluate(a) - secondTerm.evaluate(a);

  }
  public String toString(){

    return firstTerm.toString() + " - " + secondTerm.toString();

  }

}
