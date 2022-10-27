package bankingsystem.backend.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity(name = "Transaction")
public class Transaction implements Comparable<Transaction> {

    @Id
    @Column(name = "id")
    private String id;
    
    @Column(name = "transferFrom")
    private String transferFrom;
    
    @Column(name = "tranferTo")
    private String transferTo;
    
    @Column(name = "amount")
    private Long amount;
    @Column(name = "date")
    private Date date;


    public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getTransferFrom() {
		return transferFrom;
	}


	public void setTransferFrom(String transferFrom) {
		this.transferFrom = transferFrom;
	}


	public String getTransferTo() {
		return transferTo;
	}


	public void setTransferTo(String transferTo) {
		this.transferTo = transferTo;
	}


	public Long getAmount() {
		return amount;
	}


	public void setAmount(Long amount) {
		this.amount = amount;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	@Override
    public int compareTo(Transaction transaction) {
        return this.getDate().compareTo(transaction.getDate());
    }
}
