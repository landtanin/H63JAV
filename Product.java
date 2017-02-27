public class Product implements Expression{

  private Expression exFirstTerm, exSecondTerm;
  public Product(Expression firstTerm, Expression secondTerm){

    exFirstTerm = firstTerm;
    exSecondTerm = secondTerm;
      // System.out.println("I am " + exFirstTerm.toString());

    // double test = exFirstTerm.derive().evaluate(a) * exSecondTerm.evaluate(a);

  }
  // derivative of sum is the sum of the derivation
  public Expression derive(){

    return new Product(exFirstTerm, exSecondTerm);

  }

  //*********
    // Still not done
  public double evaluate(double a){

    return ((exFirstTerm.derive().evaluate(a) * exSecondTerm.evaluate(a))
            + (exSecondTerm.derive().evaluate(a) * exFirstTerm.evaluate(a)));

  }

  // ********** Should this show the formula???
  public String toString(){

    return exFirstTerm.toString() + "'" + exSecondTerm.toString() + " + " + exFirstTerm.toString() + exSecondTerm.toString() + "'" ;

  }

}
