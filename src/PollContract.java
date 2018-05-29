

public class PollContract extends SmartContract{

  //const NEO ASSET ScryptHash
  //const GAS ASSET ScryptHash 

  private String neoAddress;    // Owner or Customer
  private String pollContract;  // Access to the poll throught the scryptHash of the contract
  private String result;        // Result String
  private boolean votingEn;     // Is Active?
  private int voteLimit;        // How many votes we got now?
  private int voteCast;         // How many votes can we got?
  
  // Check if there is a contract scryptHash
  // If pollContract Variable is not null, then start the voting
  
  if(pollContract != null){
    // GET THE STORED DATA
    votingEn = Storage.Get(Storage.CurrentContext, new byte[] {0}); //HOW TO SELECT THE DATA WE WANT TO GET????
    voteLimit = Storage.Get(Storage.CurrentContext, new byte[] {0}); //HOW TO SELECT THE DATA WE WANT TO GET????
    voteCast = Storage.Get(Storage.CurrentContext, new byte[] {0}); //HOW TO SELECT THE DATA WE WANT TO GET????
    
    if(votingEn && voteLimit<=voteCast){
      account.claimGas;     //FROM NOS API
      if(neoAddress.GetBalance(GASasset) != 0){
        Storage.Put(Storage.CurrentContext, key, value);
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
