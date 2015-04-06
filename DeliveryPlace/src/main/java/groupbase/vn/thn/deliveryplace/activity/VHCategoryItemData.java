package groupbase.vn.thn.deliveryplace.activity;

import java.io.Serializable;

import groupbase.vn.thn.baselibs.util.JsonAnnotation;

/**
 * Created by nghiath on 4/6/15.
 */
public class VHCategoryItemData implements Serializable {

    @JsonAnnotation(FieldName = "Key", FieldType = Long.class)
    private Long mKey;
    @JsonAnnotation(FieldName = "Name", FieldType = String.class)
    private String mName;
    @JsonAnnotation(FieldName = "Name_us", FieldType = String.class)
    private String mName_us;

    public Long getKey () {

        return mKey;
    }

    public String getName () {

        return mName;
    }

    public String getName_us () {

        return mName_us;
    }
}
