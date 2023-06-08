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
@Table(name = "Cards")
public class Cards {
    @Id
    private Long id;
    private Long accountId;
    private String cardNumber;
    private LocalDate cardExpiredDate;
    private Long cardTypeId;
    private Double totalLimit;
    private Double amountUsed;
    private Double availableAmt;


}
