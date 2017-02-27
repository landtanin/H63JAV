public class Quotient implements Expression{

  private Expression exFirstTerm, exSecondTerm;
  public Quotient(Expression firstTerm, Expression secondTerm){

    exFirstTerm = firstTerm;
    exSecondTerm = secondTerm;
      // System.out.println("I am " + exFirstTerm.toString());

    // double test = exFirstTerm.derive().evaluate(a) * exSecondTerm.evaluate(a);

  }
  // derivative of sum is the sum of the derivation
  public Expression derive(){

    return new Quotient(exFirstTerm, exSecondTerm);

  }

  //*********
    // Still not done
  public double evaluate(double a){

    return ((exFirstTerm.derive().evaluate(a) * exSecondTerm.evaluate(a))
            - (exSecondTerm.derive().evaluate(a) * exFirstTerm.evaluate(a)))/Math.pow(exSecondTerm.evaluate(a),2);

  }
  public String toString(){

    return exFirstTerm.derive().toString() + " ÷ " + exSecondTerm.derive().toString();

  }

}
