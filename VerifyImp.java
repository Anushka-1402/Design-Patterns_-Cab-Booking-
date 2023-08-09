class VerifyImp implements Verify{

    public void verify(Cab c,String str){
        c.flag=1;
        System.out.println("\n OTP: "+str+" verified.");
    }
}