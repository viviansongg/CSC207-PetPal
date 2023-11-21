package interface_adaptor.adopt_user_preview;

import entities.Pet;

public class AdoptUserPreviewState {
    private Pet thisPet;
    private String failMessage = null;

    public void setPet(Pet pet) {
        thisPet = pet;
    }
    public Pet getPet() {
        return thisPet;
    }
    public void setSearchFailMessage(String errorMessage) {
        failMessage = errorMessage;
    }
    public Object getPetError() {
        return failMessage;
    }
}