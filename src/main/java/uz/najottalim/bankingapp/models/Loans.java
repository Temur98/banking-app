package uz.najottalim.bankingapp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Credits")
public class Loans {
    @Id
    private Long id;
    private Long accountId;
    private LocalDate startDate;
    private Long typeLoansId;
    private Double totalLoan;
    private Double amountPy;
    private Double outstandingAmt;
}
