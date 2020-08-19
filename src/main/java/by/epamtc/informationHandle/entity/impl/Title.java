package by.epamtc.informationHandle.entity.impl;

import lombok.Data;
import by.epamtc.informationHandle.entity.TextElement;

import java.io.Serializable;

@Data
public class Title implements TextElement, Serializable {
    private String title;
    private Sentence sentence;

    @Override
    public String getString() {
        return title;
    }
}
