package com.sisfacturation.demo.invoiceLine.models;

import java.io.Serializable;

import com.sisfacturation.demo.invoice.models.Invoice;
import com.sisfacturation.demo.products.models.Product;
import com.sisfacturation.demo.tax.models.Tax;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class InvoiceLine implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	public InvoiceLine(Invoice invoice, Product product, Tax tax) {
		super();
		this.invoice = invoice;
		this.product = product;
		this.tax = tax;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Tax getTax() {
		return tax;
	}

	public void setTax(Tax tax) {
		this.tax = tax;
	}

	@ManyToOne
	@JoinColumn(name="invoice_id", nullable=false)
	private Invoice invoice;
	
	@ManyToOne
	@JoinColumn(name="product_id", nullable=false)
	private Product product;
	
	@ManyToOne
	@JoinColumn(name="tax_id", nullable=false)
	private Tax tax;
}
