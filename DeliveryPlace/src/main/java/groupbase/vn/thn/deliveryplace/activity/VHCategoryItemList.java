package groupbase.vn.thn.deliveryplace.activity;

import java.util.ArrayList;

import groupbase.vn.thn.baselibs.util.JsonAnnotation;

/**
 * Created by nghiath on 4/6/15.
 */
public class VHCategoryItemList {
    @JsonAnnotation(FieldName = "category_list", FieldType = VHCategoryItemData.class, isObject = true)
    private ArrayList< VHCategoryItemData > mCategoryList;

    public void setmCategoryList ( ArrayList< VHCategoryItemData > categoryList ) {

        this.mCategoryList = categoryList;
    }

    public ArrayList< VHCategoryItemData > getCategoryList () {

        return mCategoryList;
    }
}
