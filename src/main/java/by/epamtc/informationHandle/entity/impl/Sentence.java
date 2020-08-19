package by.epamtc.informationHandle.entity.impl;


import lombok.Data;
import by.epamtc.informationHandle.entity.SentenceElement;

import java.io.Serializable;
import java.util.List;

@Data
public class Sentence implements Serializable {
    private List<SentenceElement> sentenceElements;
}
