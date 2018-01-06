enum Operation{ADD,SUB,MUL,DIV}

    public class Arithmetic {
        Message message = new Message();

    public int add(int a,int b){

        message.addMessage(a+b, String.valueOf(Operation.ADD));
        return a+b;
    }

    public int sub(int a,int b){

        message.addMessage(a-b, String.valueOf(Operation.SUB));
        return a-b;
    }

    public int mul(int a,int b){
        message.addMessage(a*b, String.valueOf(Operation.MUL));
        return a*b;
    }

    public int div(int a,int b){

        if(a==0||b==0){
            throw new ArithmeticException();
        }else {
            message.addMessage(a/b, String.valueOf(Operation.DIV));
            return a/b;
        }

    }

}
