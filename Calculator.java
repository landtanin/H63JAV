public class Calculator{

  public static void main(String[] args){

    // Constant
    Expression c = new Constant(3.0);
    Expression dc = c.derive();
    System.out.println("The derivative of " + c + " equals " + dc);

    // Variable
    Expression variable = new Variable(); // only one variable f(x) = x
    Expression derivativeVariable = variable.derive();
    System.out.println("The derivation of x equals " + derivativeVariable);

    // Sum
    Expression sum = new Sum(new Variable(), new Constant(2.0));
    Expression deriveativeSum = sum.derive();
    System.out.println("The derivation of x+2 equals " + deriveativeSum);
    // Expression evaluateSum = sum.evaluate(3.0);
    System.out.println("The evaluation of x+2 with x = 3 equals " + sum.evaluate(3.0));

    Expression difference = new Difference(new Variable(), new Constant(1.0));
    Expression derivativeDifference = difference.derive();
    System.out.println("The derivation of x-1 equals " + derivativeDifference);
    System.out.println("The evaluation of x-1 with x = 3 equals " + difference.evaluate(3.0));

    Expression product = new Product(new Variable(), new Variable());
    Expression productDerivative = product.derive();
    System.out.println("The derivation of x*y equals " + productDerivative);
    System.out.println("The evaluation of x*y with x = 3, y = 3 equals " + product.evaluate(3.0));

    Variable var1 = new Variable();
    Variable var2 = new Variable();
    Expression quotient = new Quotient(var1, var2);
    Expression quotientDerivative = quotient.derive();
    System.out.println("The derivation of x/y equals " + quotientDerivative);
    System.out.println("The evaluation of x/y with x = 3 equals " + quotient.evaluate(3.0));


  }

}
