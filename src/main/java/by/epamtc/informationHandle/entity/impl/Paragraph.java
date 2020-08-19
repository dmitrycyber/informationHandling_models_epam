package by.epamtc.informationHandle.entity.impl;

import lombok.Data;
import by.epamtc.informationHandle.entity.TextElement;

import java.io.Serializable;
import java.util.List;

@Data
public class Paragraph implements TextElement, Serializable {
    private String paragraph;
    private List<Sentence> sentences;

    @Override
    public String getString() {
        return paragraph;
    }
}
