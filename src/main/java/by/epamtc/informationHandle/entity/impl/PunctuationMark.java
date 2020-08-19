package by.epamtc.informationHandle.entity.impl;

import lombok.Data;
import by.epamtc.informationHandle.entity.SentenceElement;

import java.io.Serializable;

@Data
public class PunctuationMark implements SentenceElement, Serializable {
    private String mark;

    public PunctuationMark(String mark) {
        this.mark = mark;
    }

    @Override
    public String getString() {
        return mark;
    }
}
