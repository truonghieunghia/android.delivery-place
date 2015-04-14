package groupbase.vn.thn.deliveryplace.activity;

import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import groupbase.vn.thn.baselibs.common.ActivityCommon;
import groupbase.vn.thn.baselibs.common.AdapterCommon;
import groupbase.vn.thn.baselibs.listener.AdapterBaseListener;
import groupbase.vn.thn.baselibs.service.ConnectWS;
import groupbase.vn.thn.baselibs.service.callback.RequestCallBack;
import groupbase.vn.thn.baselibs.view.ImageViewNetWork;
import groupbase.vn.thn.deliveryplace.R;

public class MainActivity extends ActivityCommon implements AdapterBaseListener<VHCategoryItemData,MainActivity.HolderView>{

    private ConnectWS mConnectWS;
    private AdapterCommon adapter ;
    private ListView lst;
    private ArrayList<VHCategoryItemData> lstData = new ArrayList<>( );
    private RequestCallBack<VHCategoryItemList> mRequestCallBack = new RequestCallBack<VHCategoryItemList>() {
        @Override
        public void onResult( VHCategoryItemList data ) {
            lstData = data.getCategoryList();
            adapter = new AdapterCommon<VHCategoryItemData>( getApplicationContext(),R.layout.cell,lstData);
            adapter.setAdapterBaseListener( MainActivity.this);
            lst.setAdapter( adapter );
        }

        @Override
        public void onResultArray( ArrayList<VHCategoryItemList> data ) {

        }
    };

    @Override
    protected void init() {
        setLayout( R.layout.activity_main );
        lst = (ListView) findViewById( R.id.listView);
        mConnectWS = new ConnectWS( "http://video-hot.appspot.com/api/category/list", this );
        mConnectWS.setRequestCallBack( mRequestCallBack );
        mConnectWS.postRequest();

    }


    @Override
    public HolderView setHolderView( final View view ) {
        HolderView holderView = new HolderView();
        holderView.name = (TextView)view.findViewById( R.id.textView);
        holderView.image = (ImageViewNetWork)view.findViewById( R.id.imageView);
        return holderView;
    }

    @Override
    public void showData( final VHCategoryItemData data, final HolderView holderView, final int position ) {
        holderView.name.setText( data.getName());
        holderView.image.requestImage("http://l.f29.img.vnecdn.net/2015/04/14/MATTHAN1-4329-1428939538_1428978949_1428978961_490x294.jpg" );
    }
    public class HolderView {
        TextView name;
        ImageViewNetWork image;
    }
}
