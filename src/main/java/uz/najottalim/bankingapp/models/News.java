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
@Table(name = "News")
public class News {
    @Id
    private Long id;
    private String title;
    private String body;
    private String imageUrl;
    private LocalDate createDate;
}
