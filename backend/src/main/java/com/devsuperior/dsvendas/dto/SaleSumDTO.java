package com.devsuperior.dsvendas.dto;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.dsvendas.entities.Sale;
import com.devsuperior.dsvendas.entities.Seller;

public class SaleSumDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String sellerName;
	
	public interface SaleRepository extends JpaRepository<Sale,Long>{

		@Query("SELECT new com.devsuperior.dsvendas.dto.SaleSumDTO(obj.seller,SUM(obj.amount)) "
				+ " FROM Sale AS obj GROUP BY obj.seller")
		List<SaleSumDTO> amountGroupedBySeller();
	}
	private Double sum;
	
	public SaleSumDTO() {
		
	}

	public SaleSumDTO(Seller seller, Double sum) {
		this.sellerName = seller.getName();
		this.sum = sum;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}
	
	
}
