package com.sda.she_likes_java.exeptions;

public class SecretLocker {
    private Secret mySecret;

    @Override
    public String toString() {
        return "SecretLocker{" +
                "mySecret=" + mySecret +
                '}';
    }
    public Secret tellMeYourSecret(){
        System.out.println("I'm sharing with you this..");
        return mySecret;
    }
//HSM - hardware security module
//send encrypted Secret to HSM
//get decrypted value from HSM
//celebrate secrets:)
    public Secret decryptMessageWithHSM() throws  Exception {
    //connect to HSM
        boolean canConnectToHSM = false;
        if(canConnectToHSM){
            //hsm decrypted the message for me:)
            return mySecret;
        }
        throw new Exception("Couldn't connect to HSM");

    }
    //using my own exception of class MyBrokenException
public Secret decryptSecretAndSignalIssueWithMyBrokenException(){
//throws MyBrokenException{
        return null;
}
public Secret decrypt() throws HSMConnectionException, DecryptionIssueException {
    boolean canConnectToHSM = false;
    boolean decryptIssue = false;
    if(canConnectToHSM){
        //hsm decrypted the message for me:)
        System.out.println("I am able to connect to HSM");
        if (decryptIssue) {
            throw new DecryptionIssueException("Broken text");
        }
        return mySecret;
    }
    throw new HSMConnectionException("Couldn't connect to HSM");
}
    public SecretLocker(Secret mySecret) {
        this.mySecret = mySecret;
    }
}
