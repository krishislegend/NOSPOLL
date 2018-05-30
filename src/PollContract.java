

public class PollContract extends SmartContract{

  //const NEO ASSET ScryptHash
  //const GAS ASSET ScryptHash 

  private String neoAddress;    // Owner or Customer
  private String pollContract;  // Access to the poll throught the scryptHash of the contract
  private String result;        // Result String
  private boolean votingEn;     // Is Active?
  private int voteLimit;        // How many votes we got now?
  private int voteCast;         // How many votes can we got?
  private String keyA;          // Option A selected for VOTE
  private String KeyB;          // Option B selected for VOTE
  private int Value;            // Total of votes of A or B
  private String key;
  
  // Check if there is a contract scryptHash
  // If pollContract Variable is not null, then start the voting
  
  if(pollContract != null){
    // GET THE STORED DATA
    votingEn = Storage.Get(Storage.CurrentContext, "votingEn");
    voteLimit = Storage.Get(Storage.CurrentContext, "voteLimit");
    voteCast = Storage.Get(Storage.CurrentContext, "voteCast");
    
    //Check the option voted(A or B)
    if(checkbox1.isSelected){
       Value = Storage.Get(Storage.CurrentContext, "keyA"); 
       Value = Value+1;
       key = "keyA";
    }
    if(checkbox2.isSelected){
       Value = Storage.Get(Storage.CurrentContext, "keyB"); 
       Value = Value+1;
       key = "keyB";
    }
    
    
    
    if(votingEn && voteLimit<=voteCast){
      account.claimGas;     //FROM NOS API
      if(neoAddress.GetBalance(GASasset) != 0){
        Storage.Put(Storage.CurrentContext, key, Value);
        result = "Vote Registered";
        return result;
      }else{
        result = "Sorry, not enought GAS for vote"
        return result;
      }
    }else{
      result = "The vote has finished";
      return result;
    {
  }else{      // Create the contract
    Contract;
  }
  
}

// COPIED DIRECTLY FROM API
public class Contract{

  byte[] script = new byte[] { 116, 107, 0, 97, 116, 0, 147, 108, 118, 107, 148, 121, 116, 81, 147, 108, 118, 107, 148, 121, 147, 116, 0, 148, 140, 108, 118, 107, 148, 114, 117, 98, 3, 0, 116, 0, 148, 140, 108, 118, 107, 148, 121, 97, 116, 140, 108, 118, 107, 148, 109, 116, 108, 118, 140, 107, 148, 109, 116, 108, 118, 140, 107, 148, 109, 108, 117, 102 };     
  byte[] parameter_list = { 2, 2 };
  byte return_type = 2;
  bool need_storage = true;
  string name = "AdditionContractExample";
  string version = "0.1";
  string author = "@dblama";
  string email = "blascokoa@github.com";
  string description = "This is an Addition Contract. It takes in 2 inputs, adds them and returns the result.";
      
  Blockchain.CreateContract(script, parameter_list, return_type, need_storage, name, version, author, email, description);


}
