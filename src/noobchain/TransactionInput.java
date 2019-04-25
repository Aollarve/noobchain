package noobchain;

public class TransactionInput {
	public String transactionOutputId; //Reference to TransactionOutputs -> transactionID
	public TransactionOutput UTXO; // Contains the Unspent transaction output
	
	public TransactionInput(String transactionOutputId) {
		this.transactionOutputId = transactionOutputId;
	}
}
