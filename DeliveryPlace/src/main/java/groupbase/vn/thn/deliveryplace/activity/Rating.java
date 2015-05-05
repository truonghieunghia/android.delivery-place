package groupbase.vn.thn.deliveryplace.activity;

import java.io.Serializable;

import groupbase.vn.thn.baselibs.util.JsonAnnotation;

/**
 * Created by nghiath on 5/5/15.
 */
public class Rating implements Serializable {
    @JsonAnnotation(FieldName = "Good", FieldType = Integer.class)
    private int Good;
    @JsonAnnotation(FieldName = "Bad", FieldType = Integer.class)
    private int Bad;
}
