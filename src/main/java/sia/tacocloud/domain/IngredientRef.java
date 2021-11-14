package sia.tacocloud.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@NoArgsConstructor (access= AccessLevel.PRIVATE, force=true)
@AllArgsConstructor
public class IngredientRef {
    private final String ingredient;
}