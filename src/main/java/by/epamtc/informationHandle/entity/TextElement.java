package by.epamtc.informationHandle.entity;

import by.epamtc.informationHandle.entity.impl.Sentence;

import java.util.List;

public interface TextElement {
    String getString();
    List<Sentence> getSentences();

}
