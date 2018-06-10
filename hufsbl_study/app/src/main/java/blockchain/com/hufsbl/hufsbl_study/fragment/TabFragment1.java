package blockchain.com.hufsbl.hufsbl_study.fragment;

/**
 * Created by user on 2018-06-10.
 */

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import blockchain.com.hufsbl.hufsbl_study.R;
import blockchain.com.hufsbl.hufsbl_study.util.Util;

public class TabFragment1 extends BaseFragment {

    public EditText hashInput;
    public TextView hashView;
    public Button hashButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.tab_fragment_1, container, false);

        initView(rootView);

        setListener();

        return rootView;

    }

    public void initView(View v){

        hashInput = (EditText)v.findViewById(R.id.hash_input);
        hashView = (TextView)v.findViewById(R.id.hash_value);
        hashButton = (Button)v.findViewById(R.id.button);

    }



    public void setListener(){

        hashButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Body is required
                if (TextUtils.isEmpty(hashInput.getText().toString().trim())) {

                    hashInput.setError(getString(R.string.text_required));

                    return;
                }

                final String getText = hashInput.getText().toString();

                // hash값 얻기
                hashView.setText(Util.getHash(getText));

                InputMethodManager imm = (InputMethodManager)getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(getView().getWindowToken(), 0);
                //출처: http://itpangpang.xyz/304 [ITPangPang]

            }
        });

    }



}