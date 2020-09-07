package by.epamtc.informationHandle.entity.impl;

import lombok.Data;
import by.epamtc.informationHandle.entity.TextElement;

import java.io.Serializable;
import java.util.List;

@Data
public class CodeBlock implements TextElement, Serializable {
    private String codeBlock;

    @Override
    public String getString() {
        return codeBlock;
    }

    @Override
    public List<Sentence> getSentences() {
        return null;
    }
}
