package se.lexicon.mark.Receptdatabas.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class RecipeIngredient {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
        name = "UUID",
        strategy = "org.hibernate.id.UUIDGenerator"
)
    @Column(name = "recipeIngredientId", updatable = false, nullable = false)
    private String recipeIngredientId;

    @ManyToOne (cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH},
            fetch = FetchType.EAGER)
    @JoinColumn(name = "ingredientId")
    private Ingredient ingredient;

    private double amount;
    private Measurement measurement;
    @ManyToOne (cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH},
            fetch = FetchType.EAGER)
    @JoinColumn(name = "recipeId")
    private Recipe recipe;
    public RecipeIngredient(){

    }
}
