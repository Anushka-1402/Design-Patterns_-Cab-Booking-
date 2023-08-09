import java.util.*;

class OpeningException extends Exception{
    OpeningException(String msg){
        super(msg);
    }
}

class VerifyProxy implements Verify{

    Verify v= new VerifyImp();

    public void verify(Cab c,String str){
            try{
                    if(str.equalsIgnoreCase("123456"))
                    {
                        v.verify(c,str);
                    }
                    else
                    {
                        throw new OpeningException("\nError! OTP: "+ str +" Not valid."); 
                    }
                    
            }catch(OpeningException e){
                e.printStackTrace();
            }
    }  
}
