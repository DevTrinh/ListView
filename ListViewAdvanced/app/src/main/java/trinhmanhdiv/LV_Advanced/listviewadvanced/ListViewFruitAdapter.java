package trinhmanhdiv.LV_Advanced.listviewadvanced;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ListViewFruitAdapter extends BaseAdapter {

    private Context     context;
    private int         layout;
    private List<Fruit> fruitList;


    public ListViewFruitAdapter(Context context, int layout, List<Fruit> fruitList){
        this.context =     context;
        this.layout =      layout;
        this.fruitList =   fruitList;
    }

//  function return number line in listView
    @Override
    public int getCount() {
        return fruitList.size();
    }

//  using this 2 part in array
    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

//  return one line in item when called adapter
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

//      khai báo đối tượng view holder
        viewHolder  viewholder;

//      kiếm tra convert view có bằng null hay không
//      thông thường lần chạy đầu tiên sẽ bằng giá trị null
        if(convertView == null){
//           take context
            LayoutInflater inflater =
                    (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

//          để chứa các layout, layout nào sẽ hiển thị mỗi dòng
//                                     resource    viewGr
            convertView = inflater.inflate(layout, null);
            viewholder = new viewHolder();

//          mapping
            viewholder.tv_name =     (TextView) convertView.findViewById(R.id.tv_name);
            viewholder.tv_describe = (TextView) convertView.findViewById(R.id.tv_describe);
            viewholder.iv_holder =   (ImageView) convertView.findViewById(R.id.iv_image);

//          truyền vào và giữ trạng thái ánh xạ của convertView
            convertView.setTag(viewholder);
        }
        else{
//          lấy phần ánh xạ của 3 phần view đã setTag rồi
            viewholder = (viewHolder) convertView.getTag();
        }

//      mount value
        Fruit fruit = fruitList.get(position);
        viewholder.tv_name.setText(fruit.getName());
        viewholder.tv_describe.setText(fruit.getDescribe());
        viewholder.iv_holder.setImageResource(fruit.getIv_image());
        return convertView;
    }

//    khai báo class
    private class viewHolder{
//      có bao nhiêu biến cần giữ ánh xạ thì khai báo vào đây
        ImageView iv_holder;
        TextView  tv_name,
                  tv_describe;
    }
}
