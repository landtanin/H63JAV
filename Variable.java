public class Variable implements Expression{

  public Expression derive(){

    return new Constant(1.0);

  }
  public double evaluate(double a){ // f(x) = x

    return a;

  }
  public String toString(){

    return "x";

  }

}
