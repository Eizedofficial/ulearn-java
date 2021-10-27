public class Handler {

    public int handleResults(String input) {
        int result = 0;
        if (input.contains("error")) throw  new HandlerException();
        if (input.length()==0 || input == null) throw new NullHandlerException();
        try{
            String[] numbers = input.split("\\.");
            result = Integer.parseInt(numbers[0])+Integer.parseInt(numbers[1])-(Integer.parseInt(numbers[2])*Integer.parseInt(numbers[3]));
        } catch(RuntimeException t){
        }
        if (result<0) throw  new HandlerResultException();
        return result;
    }

    class HandlerException extends RuntimeException {

    }
    class HandlerResultException extends  RuntimeException{


    }
    class NullHandlerException extends  RuntimeException{

    }
}
