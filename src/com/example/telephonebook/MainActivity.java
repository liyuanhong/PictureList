package com.example.telephonebook;

import android.app.ListActivity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends ListActivity{
	private static class EfficientAdapter extends BaseAdapter {
        private LayoutInflater mInflater;
        private Bitmap mIcon[] = new Bitmap[100];
        private Bitmap mIcon2;
        private int cat[] = {R.drawable.cat1,R.drawable.cat2,R.drawable.cat3,R.drawable.cat4,R.drawable.cat5,
        		R.drawable.cat6,R.drawable.cat7,R.drawable.cat8,R.drawable.cat9,R.drawable.cat10,
        		R.drawable.cat11,R.drawable.cat12,R.drawable.cat13,R.drawable.cat14,R.drawable.cat51,
        		R.drawable.cat16,R.drawable.cat17,R.drawable.cat17,R.drawable.cat19,R.drawable.cat20,
        		R.drawable.cat21,R.drawable.cat22,R.drawable.cat23,R.drawable.cat24,R.drawable.cat25,
        		R.drawable.cat26,R.drawable.cat27,R.drawable.cat27,R.drawable.cat29,R.drawable.cat30,
        		R.drawable.cat31,R.drawable.cat32,R.drawable.cat33,R.drawable.cat34,R.drawable.cat35,
        		R.drawable.cat36,R.drawable.cat37,R.drawable.cat37,R.drawable.cat39,R.drawable.cat40,
        		R.drawable.cat41,R.drawable.cat42,R.drawable.cat43,R.drawable.cat44,R.drawable.cat45,
        		R.drawable.cat46,R.drawable.cat47,R.drawable.cat47,R.drawable.cat49,R.drawable.cat50,
        		R.drawable.cat51,R.drawable.cat52,R.drawable.cat53,R.drawable.cat54,R.drawable.cat55,
        		R.drawable.cat56,R.drawable.cat57,R.drawable.cat57,R.drawable.cat59,R.drawable.cat60,
        		R.drawable.cat61,R.drawable.cat62,R.drawable.cat63,R.drawable.cat64,R.drawable.cat65,
        		R.drawable.cat66,R.drawable.cat67,R.drawable.cat67,R.drawable.cat69,R.drawable.cat70,
        		R.drawable.cat71,R.drawable.cat72,R.drawable.cat73,R.drawable.cat74,R.drawable.cat75,
        		R.drawable.cat76,R.drawable.cat77,R.drawable.cat77,R.drawable.cat79,R.drawable.cat80,
        		R.drawable.cat81,R.drawable.cat82,R.drawable.cat83,R.drawable.cat84,R.drawable.cat85,
        		R.drawable.cat86,R.drawable.cat87,R.drawable.cat87,R.drawable.cat89,R.drawable.cat90,
        		R.drawable.cat91,R.drawable.cat92,R.drawable.cat93,R.drawable.cat94,R.drawable.cat95,
        		R.drawable.cat96,R.drawable.cat97,R.drawable.cat97,R.drawable.cat99,R.drawable.cat100
        		
        		};

        public EfficientAdapter(Context context) {            
            mInflater = LayoutInflater.from(context);	
            for(int i = 0;i < 100;i++){
            	mIcon[i] = BitmapFactory.decodeResource(context.getResources(),cat[i]);        //添加100张图片
            }
//            mIcon2 = BitmapFactory.decodeResource(context.getResources(),cat[0]);           //取出其中一张图片
        }

        public int getCount() {
            return DATA.length;
        }

        public Object getItem(int position) {
            return position;
        }

        public long getItemId(int position) {
            return position;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
           
            ViewHolder holder;

           
            if (convertView == null) {
                convertView = mInflater.inflate(R.layout.activity_main, null);

                holder = new ViewHolder();
                holder.text = (TextView) convertView.findViewById(R.id.text);
                holder.icon = (ImageView) convertView.findViewById(R.id.icon);

                convertView.setTag(holder);
            } else {
               
                holder = (ViewHolder) convertView.getTag();
            }

            holder.text.setText(DATA[position]);
            
            
            
            holder.icon.setImageBitmap(mIcon[position]);    //100张图片的情况
 //         holder.icon.setImageBitmap(mIcon2);          //1张图片的情况
            return convertView;
        }
        
        static class ViewHolder {
            TextView text;
            ImageView icon;
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new EfficientAdapter(this));
    }

    private static final String[] DATA = Cheeses.addValue();

}
