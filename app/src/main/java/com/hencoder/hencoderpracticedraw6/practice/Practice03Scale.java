package com.hencoder.hencoderpracticedraw6.practice;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.hencoder.hencoderpracticedraw6.R;

public class Practice03Scale extends RelativeLayout {
    Button animateBt;
    ImageView imageView;
    int end =6;
    int pos =0;

    public Practice03Scale(Context context) {
        super(context);
    }

    public Practice03Scale(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice03Scale(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        animateBt = (Button) findViewById(R.id.animateBt);
        imageView = (ImageView) findViewById(R.id.imageView);

        animateBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                // TODO 在这里处理点击事件，通过 View.animate().scaleX/Y() 来让 View 放缩
                switch (pos){
                    case 0:
                        imageView.animate().scaleX(0.5f).setDuration(500);
                        break;
                    case 1:
                        imageView.animate().scaleX(1f).setDuration(500);
                        break;
                    case 2:
                        imageView.animate().scaleY(0.5f).setDuration(500);
                        break;
                    case 3:
                        imageView.animate().scaleY(1f).setDuration(500);

                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                        default:
                            break;
                }
                pos++;
                if (pos==end){
                    pos=0;
                }
            }
        });
    }
}
