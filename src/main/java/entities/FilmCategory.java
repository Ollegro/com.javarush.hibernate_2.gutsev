package entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
@Getter
@Setter
@Entity
@Table(name = "film_category")
public class FilmCategory {
    @EmbeddedId
    private FilmCategoryId id;

    @MapsId("filmId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "film_id", nullable = false)
    private Film film;

    @MapsId("categoryId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    @Column(name = "last_update", nullable = false)
    private Instant lastUpdate;

}