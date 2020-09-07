package by.epamtc.informationHandle.models;

import by.epamtc.informationHandle.entity.impl.Text;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class RemoveWordModel implements Serializable {
    private int length;
    private Text text;
}
