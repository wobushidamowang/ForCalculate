import bean.OperationExpression;
import org.junit.Test;

import java.util.List;

public class test {
    @Test
    public void test1(){
        OperationPro.mainGenerate(10,10000);
    }
    @Test
    public void test2(){
        OperationPro.mainCheck("D:\\developer\\ForCalculate\\Answer1.txt","D:\\developer\\ForCalculate\\Answer.txt");
    }
    @Test
    public void test3(){
        getExpression getExpression = new getExpression();
        List exp = getExpression.getExp(new OperationExpression(null, null, null), 10);
        System.out.println(exp);
    }
    @Test
    public void test4(){

    }
}
