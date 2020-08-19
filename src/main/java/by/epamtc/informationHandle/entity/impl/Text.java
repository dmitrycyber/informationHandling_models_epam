package by.epamtc.informationHandle.entity.impl;

import lombok.Data;
import by.epamtc.informationHandle.entity.TextElement;

import java.io.Serializable;
import java.util.List;

@Data
public class Text implements Serializable {
    private List<TextElement> textElements;


}
