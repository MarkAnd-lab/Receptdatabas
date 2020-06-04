package se.lexicon.mark.Receptdatabas.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class RecipeIngredient<Recipe> {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "recipeIngredientId", updatable = false, nullable = false)
    private String recipeIngredientId;
    Ingredient ingredient;
    private double amount;
    Measurement measurement;
    Recipe recipe;


    public RecipeIngredient(Ingredient ingredient, double amount, Measurement measurement, Recipe recipe) {
        this.ingredient = ingredient;
        this.amount = amount;
        this.measurement = measurement;
        this.recipe = recipe;
    }

    public RecipeIngredient(String recipeIngredientId, Ingredient ingredient, double amount, Measurement measurement, Recipe recipe) {
        this.recipeIngredientId = recipeIngredientId;
        this.ingredient = ingredient;
        this.amount = amount;
        this.measurement = measurement;
        this.recipe = recipe;


    }

    public String getRecipeIngredientId() {
        return recipeIngredientId;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Measurement getMeasurement() {
        return measurement;
    }

    public void setMeasurement(Measurement measurement) {
        this.measurement = measurement;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecipeIngredient<?> that = (RecipeIngredient<?>) o;
        return Double.compare(that.amount, amount) == 0 &&
                Objects.equals(recipeIngredientId, that.recipeIngredientId) &&
                Objects.equals(ingredient, that.ingredient) &&
                measurement == that.measurement &&
                Objects.equals(recipe, that.recipe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipeIngredientId, ingredient, amount, measurement, recipe);
    }

    @Override
    public String toString() {
        return "RecipeIngredient{" +
                "recipeIngredientId='" + recipeIngredientId + '\'' +
                ", ingredient=" + ingredient +
                ", amount=" + amount +
                ", measurement=" + measurement +
                ", recipe=" + recipe +
                '}';
    }
}
