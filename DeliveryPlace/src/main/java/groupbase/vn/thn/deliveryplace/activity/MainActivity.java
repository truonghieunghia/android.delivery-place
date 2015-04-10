package groupbase.vn.thn.deliveryplace.activity;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

import groupbase.vn.thn.baselibs.common.ActivityCommon;
import groupbase.vn.thn.baselibs.service.ConnectWS;
import groupbase.vn.thn.baselibs.service.callback.RequestCallBack;
import groupbase.vn.thn.deliveryplace.R;


public class MainActivity extends ActivityCommon {

    private ConnectWS mConnectWS;
    private RequestCallBack<VHCategoryItemList> mRequestCallBack = new RequestCallBack< VHCategoryItemList >() {
        @Override
        public void onResult ( VHCategoryItemList data ) {

        }

        @Override
        public void onResultArray ( ArrayList< VHCategoryItemList > data ) {

        }
    };

    @Override
    protected void init () {
        setLayout( R.layout.activity_main );
        mConnectWS = new ConnectWS( "http://video-hot.appspot.com/api/category/list" ,this);

        mConnectWS.setRequestCallBack( mRequestCallBack );
        mConnectWS.postRequest();
    }

}
