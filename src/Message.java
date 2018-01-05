public class Message {

    public void addMessage(int ans,String operation){

        if(operation == "ADD"){
            System.out.println("Successfully added and your answer is "+ans);
        }else if(operation == "SUB"){
            System.out.println("Successfully subtracted and your answer is "+ans);
        }else if(operation == "MUL"){
            System.out.println("Successfully multiplied and your answer is "+ans);
        }else if(operation == "DIV"){
            System.out.println("Successfully divided and your answer is "+ans);
        }else {
           errorMessage()
         }
    }
    
    public void errorMessage(){
         System.out.println("Check your operations.");

     }
}
