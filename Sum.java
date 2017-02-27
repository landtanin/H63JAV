public class Sum implements Expression{

  private Expression exFirstTerm, exSecondTerm;
  public Sum(Expression firstTerm, Expression secondTerm){

    exFirstTerm = firstTerm;
    exSecondTerm = secondTerm;

  }
  // derivative of sum is the sum of the derivation
  public Expression derive(){

    return new Sum(exFirstTerm.derive(), exSecondTerm.derive());

  }

  public double evaluate(double a){ // how does this work????

    return exFirstTerm.evaluate(a) + exSecondTerm.evaluate(a);

  }
  public String toString(){

    return exFirstTerm.toString() + " + " + exSecondTerm.toString();

  }

}
