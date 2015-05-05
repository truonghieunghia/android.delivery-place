package groupbase.vn.thn.deliveryplace.activity;

import java.io.Serializable;

import groupbase.vn.thn.baselibs.util.JsonAnnotation;

/**
 * Created by nghiath on 5/5/15.
 */
public class Result implements Serializable {
    @JsonAnnotation(FieldName = "Follow", FieldType = Follow.class , isObject = true)
    private Follow Follow;
    @JsonAnnotation(FieldName = "Rating", FieldType = Rating.class, isObject = true)
    private Rating Rating;
}
