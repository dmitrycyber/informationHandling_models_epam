package by.epamtc.informationHandle.entity.impl;


import lombok.Data;
import by.epamtc.informationHandle.entity.SentenceElement;

import java.io.Serializable;

@Data
public class Word implements SentenceElement, Serializable {
    private String word;

    public Word(String word) {
        this.word = word;
    }

    @Override
    public String getString() {
        return word;
    }
}
