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
@Table(name = "Massagees")
public class Messages {
    @Id
    private Long id;
    private String name;
    private String email;
    private String subject;
    private String message;
    private LocalDate sentDate;
    private Long statusTypeId;
}
