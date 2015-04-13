package groupbase.vn.thn.deliveryplace.activity;

import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

import groupbase.vn.thn.baselibs.service.ConnectWS;
import groupbase.vn.thn.baselibs.service.callback.RequestCallBack;
import groupbase.vn.thn.deliveryplace.R;


public class MainActivity extends ActionBarActivity implements DialogInterface.OnClickListener{

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
    protected void onCreate ( Bundle savedInstanceState ) {

        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        mConnectWS = new ConnectWS( "http://video-hot.appspot.com/api/category/list" ,this);
        mConnectWS.setRequestCallBack( mRequestCallBack );
        mConnectWS.postRequest();
    }


    @Override
    public boolean onCreateOptionsMenu ( Menu menu ) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate( R.menu.menu_main, menu );
        return true;
    }

    @Override
    public boolean onOptionsItemSelected ( MenuItem item ) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if ( id == R.id.action_settings ) {
            return true;
        }

        return super.onOptionsItemSelected( item );
    }

    @Override
    public void onClick(DialogInterface dialog, int which) {

    }
}
