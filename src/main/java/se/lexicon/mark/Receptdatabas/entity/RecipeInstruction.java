package se.lexicon.mark.Receptdatabas.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class RecipeInstruction {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "instructionId", updatable = false, nullable = false)
    private String instructionId;
    private String instruction;

    public String getInstructionId() {
        return instructionId;
    }

    public RecipeInstruction(String instruction) {
        this.instruction = instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecipeInstruction that = (RecipeInstruction) o;
        return Objects.equals(instructionId, that.instructionId) &&
                Objects.equals(instruction, that.instruction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instructionId, instruction);
    }

    @Override
    public String toString() {
        return "RecipeInstruction{" +
                "instructionId='" + instructionId + '\'' +
                ", instruction='" + instruction + '\'' +
                '}';
    }
}
