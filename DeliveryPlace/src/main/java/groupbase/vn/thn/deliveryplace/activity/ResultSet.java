package groupbase.vn.thn.deliveryplace.activity;

import java.io.Serializable;
import java.util.ArrayList;

import groupbase.vn.thn.baselibs.util.JsonAnnotation;

/**
 * Created by nghiath on 5/5/15.
 */
public class ResultSet implements Serializable {
    @JsonAnnotation(FieldName = "Results", FieldType = Integer.class)
    private int Results;
    @JsonAnnotation(FieldName = "Position", FieldType = Integer.class)
    private int Position;
    @JsonAnnotation(FieldName = "Total", FieldType = Integer.class)
    private int Total;
    @JsonAnnotation(FieldName = "Result", FieldType = Result.class,isObject = true,isList = true)
    private ArrayList<Result> Result = new ArrayList<>();
}
