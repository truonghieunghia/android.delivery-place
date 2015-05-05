package groupbase.vn.thn.deliveryplace.activity;

import java.io.Serializable;

import groupbase.vn.thn.baselibs.util.JsonAnnotation;

/**
 * Created by nghiath on 5/5/15.
 */
public class FollowList implements Serializable {
    @JsonAnnotation(FieldName = "ResultSet", FieldType = ResultSet.class , isObject = true)
    private ResultSet ResultSet;
}
