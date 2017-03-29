package com.example.joker.dialoganimation;


import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

/**
 * Created by joker on 2017/3/29.
 */

public class CustomDialog extends DialogFragment {
    private Button button2;
    public static final CustomDialog getdialog(){
        CustomDialog dialog=new CustomDialog();
        return dialog;
    }

    private CustomDialog(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        View view = inflater.inflate(R.layout.dialogitem,null);
        button2= (Button) view.findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });

        final Animation animation= AnimationUtils.loadAnimation(getActivity(),R.anim.animation);
        animation.setDuration(4000);
        view.startAnimation(animation);

        return view;
    }

    @Override
    public void onStart() {
        getDialog().getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT);
        super.onStart();
    }


}
