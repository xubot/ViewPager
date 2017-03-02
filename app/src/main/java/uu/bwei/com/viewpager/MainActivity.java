package uu.bwei.com.viewpager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Integer> integerList=new ArrayList<>();
    private List<String> imgerList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Banner banner= (Banner) findViewById(R.id.banner);
      /*  integerList.add(R.drawable.ac36dd02f81131b22beb274804d5412f);
        integerList.add(R.drawable.b9ca38b4bf865048aa7542d4780a5281);
        integerList.add(R.drawable.c58a76e73cf0739b95c81f68113fd48);*/
        imgerList.add("http://a2.att.hudong.com/23/17/300001350490131523174249554_950.jpg");
        imgerList.add("http://www.llkwz.cn/uploads/allimg/100921/1U1534458-0.jpg");
        imgerList.add("http://pic3.bbzhi.com/huihuabizhi/jianyuedanyashouhuishijiefeng/design_hand_234356_11.jpg");
        //设置图片加载器
        banner.setImageLoader(new GlideImageLoader());
        //设置图片集合
        banner.setImages(imgerList);
        //banner设置方法全部调用完毕时最后调用
        banner.start();
    }
}
