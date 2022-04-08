package fixtures;
import code.Calculator;

public class TestAdd {
 int result;
 private int num1;
 private int num2;

 public void execute() { // executed after each table row
  this.result = new Calculator().add(num1, num2);
 }
 public void setNum1(int  num1) { // setter method
  this.num1 = num1;
 }
 public void setNum2(int  num2) { // setter method
  this.num2 = num2;
 }
 public int result()  { return result; }
}
