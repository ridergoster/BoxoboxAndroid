package com.example.vincent.boxobox.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vincent on 03/07/2017.
 *
 * This class is store the info of a section
 * It's used by recycler view to see title,desriptioon and images of this section
 * Example of esection :
 * A Game is a section, info of 1 captor is a section etc....
 */

public class Section {
    private String title;
    private String description;
    private String image;
    private String callToAction;
    private List<String> types;

    public Section(String title, String description, String image,String callToAction,String type1,String type2) {
        this.title = title;
        this.description = description;
        this.image = image;
        this.callToAction = callToAction;

        types = new ArrayList<>();
        this.types.add(type1);
        this.types.add(type2);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCallToAction() {
        return callToAction;
    }

    public void setCallToAction(String callToAction) {
        this.callToAction = callToAction;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }
}
