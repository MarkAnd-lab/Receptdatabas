package se.lexicon.mark.Receptdatabas.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import java.util.List;

@Entity
public class Recipe<RecipeInstruction> {

    private int recipeId;
    private String recipeName;
    @OneToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH},
            fetch = FetchType.EAGER)
            private List<RecipeIngredient> recipeIngredients;
    RecipeInstruction instruction;
    private List<RecipeCategory> categories;

}
