package groupbase.vn.thn.deliveryplace.activity;

import java.io.Serializable;

import groupbase.vn.thn.baselibs.util.JsonAnnotation;

/**
 * Created by nghiath on 5/5/15.
 */
public class Follow implements Serializable {
    @JsonAnnotation(FieldName = "Id", FieldType = String.class)
    private String Id;
    @JsonAnnotation(FieldName = "Icon", FieldType = String.class)
    private String Icon;
    @JsonAnnotation(FieldName = "Update", FieldType = Integer.class)
    private int Update;
    @JsonAnnotation(FieldName = "Itemlisturl", FieldType = String.class)
    private String Itemlisturl;
}
